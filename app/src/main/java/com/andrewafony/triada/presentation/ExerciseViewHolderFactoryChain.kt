package com.andrewafony.triada.presentation

import android.view.LayoutInflater
import android.view.ViewGroup
import com.andrewafony.triada.R
import com.andrewafony.triada.domain.model.ItemUi

class ExerciseViewHolderFactoryChain(
    private val viewHolderFactoryChain: ViewHolderFactoryChain<ItemUi>
): ViewHolderFactoryChain<ItemUi> {
    override fun viewHolder(parent: ViewGroup, viewType: Int): GenericViewHolder<ItemUi> =
        if (viewType == 1)
            ExerciseViewHolder(
                LayoutInflater.from(parent.context)
                    .inflate(R.layout.exercise_layout, parent, false)
            )
        else viewHolderFactoryChain.viewHolder(parent, viewType)
}