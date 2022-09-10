package com.andrewafony.triada.presentation

import android.content.Context
import android.util.AttributeSet


class CustomTextView @JvmOverloads constructor(
    context: Context, attrs: AttributeSet? = null
) : androidx.appcompat.widget.AppCompatTextView(context, attrs), CustomView {

    override fun show(textId: Int) {
        setText(textId)
    }

    override fun show(text: CharSequence) {
        setText(text)
    }

}