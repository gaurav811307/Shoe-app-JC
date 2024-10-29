package com.example.shoeappjc.Screens

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import com.example.shoeappjc.R
import com.example.shoeappjc.Screens.components.ProductItem
import com.example.shoeappjc.model.Product
import com.example.shoeappjc.navigation.NavigationItem

@Composable
fun ProductScreen(
    navController: NavController
) {
    var products: List<Product> = remember {
        getProductList()
    }
    LazyVerticalGrid(columns = GridCells.Fixed(2), modifier = Modifier.padding(18.dp)) {
        items(products) {
            ProductItem(product = it){
                navController.navigate("$NavigationItem.PRODUCT_DETAILS /{$it.id}")
            }
        }
    }

}

fun getProductList(): List<Product> {
    return listOf(
        Product(
            id = "1",
            color = Color.Blue,
            price = 1200f,
            name = "Shoes Blue",
            discountPrice = 1000f,
            rating = 4.7f,
            imageRes = R.drawable.s_1,
            size = 8
        ),
        Product(
            id = "2",
            color = Color.Green,
            price = 1200f,
            name = "Shoes Green",
            discountPrice = 1000f,
            rating = 4.7f,
            imageRes = R.drawable.s_2,
            size = 9
        ),
        Product(
            id = "3",
            color = Color.Magenta,
            price = 1200f,
            name = "Shoes Purple",
            discountPrice = 1000f,
            rating = 4.7f,
            imageRes = R.drawable.s_3,
            size = 7
        ),
        Product(
            id = "4",
            color = Color.Yellow,
            price = 1200f,
            name = "Shoes Yellow",
            discountPrice = 1000f,
            rating = 4.7f,
            imageRes = R.drawable.s_4,
            size = 8
        ),
        Product(
            id = "5",
            color = Color.Red,
            price = 1200f,
            name = "Shoes Red",
            discountPrice = 1000f,
            rating = 4.7f,
            imageRes = R.drawable.s_5,
            size = 10
        ),
        Product(
            id = "6",
            color = Color.Black,
            price = 1200f,
            name = "Shoes Black",
            discountPrice = 1000f,
            rating = 4.7f,
            imageRes = R.drawable.s_7,
            size = 9
        ),
        Product(
            id = "7",
            color = Color.Blue,
            price = 1200f,
            name = "Shoes Grey",
            discountPrice = 1000f,
            rating = 4.7f,
            imageRes = R.drawable.s_7,
            size = 8
        ),
        Product(
            id = "8",
            color = Color.Green,
            price = 1200f,
            name = "Shoes Red",
            discountPrice = 1000f,
            rating = 4.7f,
            imageRes = R.drawable.s_8,
            size = 10
        ),
        Product(
            id = "9",
            color = Color.Magenta,
            price = 1200f,
            name = "Shoes Black",
            discountPrice = 1000f,
            rating = 4.7f,
            imageRes = R.drawable.s_9,
            size = 7
        ),
        Product(
            id = "10",
            color = Color.Yellow,
            price = 1200f,
            name = "Shoes Pink",
            discountPrice = 1000f,
            rating = 4.7f,
            imageRes = R.drawable.s_5,
            size = 9
        )
    )
}