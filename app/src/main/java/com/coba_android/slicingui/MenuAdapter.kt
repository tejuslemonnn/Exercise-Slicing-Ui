package com.coba_android.slicingui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.coba_android.slicingui.databinding.ItemsMenuBinding


class MenuAdapter(private val itemsMenu: List<ItemsMenu>) : RecyclerView.Adapter<MenuViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MenuViewHolder {
        val from = LayoutInflater.from(parent.context)
        val binding = ItemsMenuBinding.inflate(from, parent, false)
        return MenuViewHolder(binding)
    }

    override fun onBindViewHolder(holder: MenuViewHolder, position: Int) {
        holder.bindMenu(itemsMenu[position])
    }

    override fun getItemCount(): Int {
        return itemsMenu.size
    }
}