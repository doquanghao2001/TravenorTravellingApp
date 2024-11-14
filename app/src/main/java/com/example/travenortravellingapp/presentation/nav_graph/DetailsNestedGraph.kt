package com.example.travenortravellingapp.presentation.nav_graph

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.example.travenortravellingapp.presentation.details.DetailsScreen

fun NavGraphBuilder.detailsGraph(navController: NavHostController) {
    navigation(startDestination = Routes.DetailsScreen.route, route = Routes.DetailsRoute.route) {
        composable(route = Routes.DetailsScreen.route) {
            DetailsScreen(navController = navController)
        }
    }
}