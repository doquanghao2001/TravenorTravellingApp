package com.example.travenortravellingapp.presentation.nav_graph

import com.example.travenortravellingapp.presentation.util.RoutesKeyName


sealed class Routes(val route: String) {
    data object OnBoardScreen : Routes(route = RoutesKeyName.ROUTE_KEY_BOARD_SCREEN)
    data object HomeScreen : Routes(route = RoutesKeyName.ROUTE_KEY_HOME_SCREEN)
}
