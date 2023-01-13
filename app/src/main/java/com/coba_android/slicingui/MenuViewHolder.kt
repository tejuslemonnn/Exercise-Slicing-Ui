package com.coba_android.slicingui

import androidx.recyclerview.widget.RecyclerView
import com.coba_android.slicingui.databinding.ItemsMenuBinding

class MenuViewHolder(
    private val itemsMenuBinding: ItemsMenuBinding
) : RecyclerView.ViewHolder(itemsMenuBinding.root) {
    fun bindMenu(itemsMenu: ItemsMenu) {
        itemsMenuBinding.iconMenu.setImageResource(itemsMenu.iconMenu)
        itemsMenuBinding.nameMenu.text = itemsMenu.nameMenu
    }
}