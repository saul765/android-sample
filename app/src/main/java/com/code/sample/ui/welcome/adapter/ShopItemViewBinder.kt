package com.code.sample.ui.welcome.adapter

import com.code.sample.domain.Shop
import com.code.sample.utils.capitalize

class ShopItemViewBinder(
    private val shopItem: Shop,
    private val itemClickListener: (Shop) -> Unit
) {

    fun getShopName() = shopItem.name.capitalize()

    fun shopItemClick() = itemClickListener(shopItem)

    fun getShopId() = shopItem.id

}