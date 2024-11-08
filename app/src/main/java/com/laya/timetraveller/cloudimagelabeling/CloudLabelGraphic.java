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
package com.laya.timetraveller.cloudimagelabeling;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.Log;

import com.google.firebase.ml.vision.cloud.label.FirebaseVisionCloudLabel;
import com.laya.timetraveller.GraphicOverlay;
import com.laya.timetraveller.GraphicOverlay.Graphic;

import java.util.List;

/** Graphic instance for rendering detected label. */
public class CloudLabelGraphic extends Graphic {
  private final Paint textPaint;
  private final GraphicOverlay overlay;

  private List<FirebaseVisionCloudLabel> labels;

  CloudLabelGraphic(GraphicOverlay overlay) {
    super(overlay);
    this.overlay = overlay;
    textPaint = new Paint();
    textPaint.setColor(Color.WHITE);
    textPaint.setTextSize(60.0f);
  }

  synchronized void updateLabel(List<FirebaseVisionCloudLabel> labels) {
    this.labels = labels;
    postInvalidate();
  }

  @Override
  public synchronized void draw(Canvas canvas) {
    float x = overlay.getWidth() / 4.0f;
    float y = overlay.getHeight() / 4.0f;

    for (FirebaseVisionCloudLabel label : labels) {
      Log.d("LabelGraphic", "Label found: " + label.getLabel() + " with confidence: " + (label.getConfidence()*100) + "%");

      canvas.drawText(label.getLabel(), x, y, textPaint);
      y = y - 62.0f;
    }
  }
}
