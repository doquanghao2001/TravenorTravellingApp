package com.example.travenortravellingapp.presentation.nav_graph


import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.travenortravellingapp.presentation.home.HomeScreen
import com.example.travenortravellingapp.presentation.onboard.OnBoardScreen

@Composable
fun SetNavGraph() {

    val navController: NavHostController = rememberNavController()

    NavHost(navController = navController, startDestination = Routes.OnBoardScreen.route) {
        composable(route = Routes.OnBoardScreen.route) {
            OnBoardScreen(navController = navController)
        }

        composable(route = Routes.HomeScreen.route) {
            HomeScreen(navController = navController)
        }
    }
}