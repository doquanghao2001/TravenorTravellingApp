package com.example.travenortravellingapp.presentation.nav_graph

import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavHostController
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.example.travenortravellingapp.presentation.calendar.CalendarScreen
import com.example.travenortravellingapp.presentation.details.DetailsScreen
import com.example.travenortravellingapp.presentation.home.HomeScreen
import com.example.travenortravellingapp.presentation.messages.MessagesScreen
import com.example.travenortravellingapp.presentation.profile.ProfileScreen

fun NavGraphBuilder.mainGraph(navController: NavHostController) {
    navigation(startDestination = Routes.HomeScreen.route, route = Routes.MainRoute.route) {
        composable(
            route = Routes.HomeScreen.route,
        ) {
            HomeScreen(navController = navController)
        }

        composable(route = Routes.CalendarScreen.route) {
            CalendarScreen(navController = navController)
        }

        composable(route = Routes.MessagesScreen.route) {
            MessagesScreen(navController = navController)
        }

        composable(route = Routes.ProfileScreen.route) {
            ProfileScreen(navController = navController)
        }

        composable(route = Routes.DetailsScreen.route) {
            DetailsScreen(navController = navController)
        }
    }
}