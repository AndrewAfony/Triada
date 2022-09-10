package com.andrewafony.triada.presentation

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.andrewafony.triada.core.Mapper
import com.andrewafony.triada.domain.model.ItemUi

abstract class GenericAdapter<T : ItemUi>(
    private val viewHolderChain: ViewHolderFactoryChain<T>
) : RecyclerView.Adapter<GenericViewHolder<T>>(), Mapper.Unit<List<T>> {

    private val list: MutableList<T> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GenericViewHolder<T> =
        viewHolderChain.viewHolder(parent, viewType)

    override fun onBindViewHolder(holder: GenericViewHolder<T>, position: Int) =
        holder.bind(list[position])

    override fun getItemCount(): Int = list.size

    override fun getItemViewType(position: Int): Int = list[position].type()

    override fun map(data: List<T>) {

    }

    abstract class Base(viewHolderChain: ViewHolderFactoryChain<ItemUi>) :
        GenericAdapter<ItemUi>(viewHolderChain)
}

