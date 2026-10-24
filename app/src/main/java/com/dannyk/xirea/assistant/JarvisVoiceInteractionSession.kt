package com.dannyk.xirea.assistant

import android.content.Context
import android.graphics.Color
import android.service.voice.VoiceInteractionSession
import android.view.Gravity
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

/**
 * Diagnostic session: shows a visible panel directly inside the
 * VoiceInteractionSession, without launching MainActivity.
 */
class JarvisVoiceInteractionSession(
    context: Context
) : VoiceInteractionSession(context) {

    override fun onCreateContentView(): View {
        return TextView(context).apply {
            text = "JARVIS Assistant Session Active"
            setTextColor(Color.WHITE)
            setBackgroundColor(Color.BLACK)
            textSize = 22f
            gravity = Gravity.CENTER
            layoutParams = ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.MATCH_PARENT,
                ViewGroup.LayoutParams.MATCH_PARENT
            )
        }
    }
}
