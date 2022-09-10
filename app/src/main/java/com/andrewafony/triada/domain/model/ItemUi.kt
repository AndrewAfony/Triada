package com.andrewafony.triada.domain.model

import com.andrewafony.triada.presentation.CustomView

interface ItemUi {

    fun type(): Int

    fun show(vararg views: CustomView)

    fun id(): String

    fun content(): String
}