package com.coba_android.slicingui

var menuList = mutableListOf<ItemsMenu>()

class ItemsMenu(
    var iconMenu: Int,
    var nameMenu: String,
    val id: Int = menuList.size,
) {

}