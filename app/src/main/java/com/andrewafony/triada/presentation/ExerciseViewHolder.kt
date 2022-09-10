package com.andrewafony.triada.presentation

import android.view.View
import com.andrewafony.triada.R
import com.andrewafony.triada.domain.model.ItemUi

class ExerciseViewHolder(view: View): GenericViewHolder<ItemUi>(view) {
    override fun bind(data: ItemUi) {
        with(itemView) {
            data.show(
                findViewById(R.id.exercise_name)
            )
        }
    }
}