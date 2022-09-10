package com.andrewafony.triada.presentation

interface CustomView {

    fun show(textId: Int) = Unit

    fun show(text: CharSequence) = Unit
}