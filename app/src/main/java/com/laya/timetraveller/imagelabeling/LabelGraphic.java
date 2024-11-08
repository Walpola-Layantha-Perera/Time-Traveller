// Copyright 2018 Google LLC
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.
package com.laya.timetraveller.imagelabeling;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.Log;

import com.google.firebase.ml.vision.label.FirebaseVisionLabel;
import com.laya.timetraveller.GraphicOverlay;
import com.laya.timetraveller.GraphicOverlay.Graphic;

import java.util.List;

/** Graphic instance for rendering a label within an associated graphic overlay view. */
public class LabelGraphic extends Graphic {

  private final Paint textPaint;
  private final GraphicOverlay overlay;

  private final List<FirebaseVisionLabel> labels;

  LabelGraphic(GraphicOverlay overlay, List<FirebaseVisionLabel> labels) {
    super(overlay);
    this.overlay = overlay;
    this.labels = labels;
    textPaint = new Paint();
    textPaint.setColor(Color.WHITE);
    textPaint.setTextSize(60.0f);
    postInvalidate();
  }

  @Override
  public synchronized void draw(Canvas canvas) {
    float x = overlay.getWidth() / 4.0f;
    float y = overlay.getHeight() / 2.0f;

    for (FirebaseVisionLabel label : labels) {
      Log.d("LabelGraphic", "Label found: " + label.getLabel() + " with confidence: " + (label.getConfidence()*100) + "%");

      if (label.getConfidence() > 0.9f) {
        canvas.drawText(label.getLabel(), x, y, textPaint);
        y = y - 62.0f;
      }
    }
  }
}
