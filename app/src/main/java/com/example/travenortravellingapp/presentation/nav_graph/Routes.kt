package com.example.travenortravellingapp.presentation.nav_graph

import com.example.travenortravellingapp.presentation.util.RoutesKeyName


sealed class Routes(val route: String) {
    data object OnBoardScreen : Routes(route = RoutesKeyName.ROUTE_KEY_BOARD_SCREEN)
    data object HomeScreen : Routes(route = RoutesKeyName.ROUTE_KEY_HOME_SCREEN)
    data object CalendarScreen : Routes(route = RoutesKeyName.ROUTE_KEY_CALENDAR_SCREEN)
    data object MessagesScreen : Routes(route = RoutesKeyName.ROUTE_KEY_MESSAGES_SCREEN)
    data object ProfileScreen : Routes(route = RoutesKeyName.ROUTE_KEY_PROFILE_SCREEN)
    data object MainScreen : Routes(route = RoutesKeyName.ROUTE_KEY_MAIN_SCREEN)
    data object DetailsScreen : Routes(route = RoutesKeyName.ROUTE_KEY_DETAILS_SCREEN)
    data object MainRoute : Routes(route = RoutesKeyName.ROUTE_KEY_MAIN_ROUTE)
    data object DetailsRoute : Routes(route = RoutesKeyName.ROUTE_KEY_DETAILS_ROUTE)
}
