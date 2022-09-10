package com.andrewafony.triada.presentation

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.andrewafony.triada.domain.model.ItemUi

abstract class GenericViewHolder <T: ItemUi>(
    view: View
) : RecyclerView.ViewHolder(view) {

    abstract fun bind(data: T)
}