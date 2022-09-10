package com.andrewafony.triada.presentation

import android.view.ViewGroup
import com.andrewafony.triada.domain.model.ItemUi

interface ViewHolderFactoryChain<T : ItemUi> {

    fun viewHolder(parent: ViewGroup, viewType: Int): GenericViewHolder<T>

    class Exception<T : ItemUi>() : ViewHolderFactoryChain<T> {
        override fun viewHolder(parent: ViewGroup, viewType: Int): GenericViewHolder<T> {
            throw IllegalStateException("Unknown type $viewType")
        }
    }
}