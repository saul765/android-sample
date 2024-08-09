package com.code.sample.ui.welcome.adapter

import com.code.sample.BR
import com.code.sample.R
import com.code.sample.base.BaseRecyclerViewAdapter
import com.code.sample.domain.Shop


class ShopAdapter(
    private val data: List<Shop>,
    private val itemClickListener: (Shop) -> Unit
) : BaseRecyclerViewAdapter(data) {

    override fun getItemCount(): Int = data.size
    override fun itemLayoutId(): Int = R.layout.shop_item

    override fun itemToBindId(): Int = BR.shopItem

    override fun onBindViewHolder(holder: BaseViewHolder, position: Int) {
        val binder = ShopItemViewBinder(data[position], itemClickListener)
        holder.bind(binder)
    }

}