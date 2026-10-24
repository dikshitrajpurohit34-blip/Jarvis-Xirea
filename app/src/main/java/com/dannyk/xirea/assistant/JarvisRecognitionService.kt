package com.dannyk.xirea.assistant

import android.content.Intent
import android.speech.RecognitionService

/**
 * Minimal recognition service for the JARVIS assistant framework.
 * This stub does not perform actual speech recognition.
 */
class JarvisRecognitionService : RecognitionService() {

    override fun onStartListening(
        recognizerIntent: Intent?,
        listener: Callback?
    ) {
        // Actual speech recognition is not implemented yet.
    }

    override fun onStopListening(listener: Callback?) {
        // Actual speech recognition is not implemented yet.
    }

    override fun onCancel(listener: Callback?) {
        // Actual speech recognition is not implemented yet.
    }
}
      
