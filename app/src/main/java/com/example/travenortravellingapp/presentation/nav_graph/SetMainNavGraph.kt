package com.example.travenortravellingapp.presentation.nav_graph

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost

@Composable
fun SetMainNavGraph(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Routes.MainRoute.route,
    ) {
        mainGraph(navController = navController)
        detailsGraph(navController = navController)
    }
}