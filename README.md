Time-Traveller
---------------
Time-Traveller is an AI-powered mobile application designed to take users on a virtual journey through architectural history. By leveraging big data, the app enables users to explore the cultural heritage of landmark buildings through image recognition, text reading, and historical classification. This tool is invaluable for students, researchers, history enthusiasts, and tourists interested in the architectural past.

Features: 
Historical Building Recognition: Identifies architectural landmarks from images.
Text Recognition: Reads information from building plaques or signs.
Image Labeling & Classification: Categorizes structures by type and historical period.
Virtual Time Travel: Offers detailed insights into architectural history.
Usage Example in Kotlin
Here’s how the app identifies historical buildings and reads their information:

kotlin
Copy code
// Load an image and process it with ML Kit
val image = InputImage.fromFilePath(this, uri)
val labeler = ImageLabeling.getClient(ImageLabelerOptions.DEFAULT_OPTIONS)

labeler.process(image)
    .addOnSuccessListener { labels ->
        for (label in labels) {
            val text = label.text
            val confidence = label.confidence
            println("Detected $text with confidence $confidence")
        }
    }
    .addOnFailureListener { e ->
        e.printStackTrace()
    }
This code enables building recognition by labeling images with detected structures and associated confidence scores.

Technologies: 
Android: Core platform for mobile app functionality.
Artificial Intelligence & Machine Learning: Integrates Google’s ML Kit for image processing and data classification.
Big Data: Utilizes extensive datasets for historical insights, including architectural and cultural information from various sources.
📚 Description
Time-Traveller uses existing 2D images, 3D models, and text to bring history to life through AI. By organizing and interpreting vast historical data on mobile devices, the app lets users virtually explore architectural history in a compelling way.

App Highlights: 

Recognize Landmarks: Identify historical buildings and their context.
Text Recognition: Read historical details from images of signs or plaques.
Historical Classification: Classify and organize architectural sites by historical period or style.
Virtual Time Travel: Gain insights into historical significance and context.
Advanced Feature: Virtual History Tour with Kotlin
The following code demonstrates how Time-Traveller uses Kotlin and ML Kit for text recognition on a historical plaque:

kotlin
Copy code
val recognizer = TextRecognition.getClient(TextRecognizerOptions.DEFAULT_OPTIONS)

recognizer.process(image)
    .addOnSuccessListener { visionText ->
        println("Text on the plaque: ${visionText.text}")
        // Here, display the historical context associated with the text
    }
    .addOnFailureListener { e ->
        println("Text recognition failed.")
        e.printStackTrace()
    }
With this code, the app can read and interpret historical texts, providing historical context for users interested in cultural exploration.

Especially for Tourists, History lovers, Cultural Heritage Lovers, Researchers & Students: 
This app provides quick access to cultural heritage data, metadata, and sources, making it an excellent tool for art, history, and architectural studies. Users can retrieve data relevant to their research, helping them deepen their understanding of architectural evolution over time.

Travel Through Time: 
Ideal for history enthusiasts and tourists, Time-Traveller allows users to virtually visit iconic buildings from the past, creating a richer understanding of their architectural and cultural significance.

Acknowledgments:  
Time-Traveller incorporates several essential open-source technologies and data resources:

Google ML Kit: Used for text and image recognition. We are grateful to the open-source community for providing such a powerful machine learning toolkit.
Historical Data Sources: Architectural and cultural heritage datasets from academic, governmental, and non-profit sources, each credited in-app according to their licensing.
For more details on licensing, please review our repository.
