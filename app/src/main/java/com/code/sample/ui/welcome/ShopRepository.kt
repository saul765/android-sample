package com.code.sample.ui.welcome

import com.code.sample.domain.Shop

object ShopRepository {


    // This should be in the localdata source layer, because of time i will leave it here
    fun generateShops(): List<Shop> {
        return listOf(
            Shop("1", "Shop 1", "Description for Shop 1"),
            Shop("2", "Shop 2", "Description for Shop 2"),
            Shop("3", "Shop 3", "Description for Shop 3"),
            Shop("4", "Shop 4", "Description for Shop 4"),
            Shop("5", "Shop 5", "Description for Shop 5"),
            Shop("6", "Shop 6", "Description for Shop 6"),
            Shop("7", "Shop 7", "Description for Shop 7"),
            Shop("8", "Shop 8", "Description for Shop 8"),
            Shop("9", "Shop 9", "Description for Shop 9"),
            Shop("10", "Shop 10", "Description for Shop 10"),
            Shop("11", "Shop 11", "Description for Shop 11"),
            Shop("12", "Shop 12", "Description for Shop 12"),
            Shop("13", "Shop 13", "Description for Shop 13"),
            Shop("14", "Shop 14", "Description for Shop 14"),
            Shop("15", "Shop 15", "Description for Shop 15")
        )
    }
}