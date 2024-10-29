package com.example.shoeappjc.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.shoeappjc.Screens.ProductDetailScreen
import com.example.shoeappjc.Screens.ProductScreen

@Composable
fun AppNavHost(
    modifier: Modifier = Modifier,
    startDestination:String = NavigationItem.PRODUCT
) {
    val navController: NavHostController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = startDestination
    ) {
        composable(NavigationItem.PRODUCT) {
            ProductScreen(navController)
        }
        composable(
            "${NavigationItem.PRODUCT_DETAILS}/{id}",
            arguments = listOf(navArgument("id") { type = NavType.StringType })
        ) {
            val id = it.arguments?.getString("id")
            if (id != null)
            ProductDetailScreen(id, navController)
        }
    }
}