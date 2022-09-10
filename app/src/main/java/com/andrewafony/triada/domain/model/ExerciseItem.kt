package com.andrewafony.triada.domain.model

import com.andrewafony.triada.presentation.CustomView

class ExerciseItem(
    private val id: String,
    private val text: String
): ItemUi {
    override fun type(): Int = 1

    override fun show(vararg views: CustomView) {
        views[0].show(text)
    }

    override fun id(): String = id

    override fun content(): String = text
}