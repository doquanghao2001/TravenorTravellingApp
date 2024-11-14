package com.example.travenortravellingapp.presentation.main_screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.travenortravellingapp.R
import com.example.travenortravellingapp.presentation.common.IconButtonBox
import com.example.travenortravellingapp.presentation.nav_graph.Routes
import com.example.travenortravellingapp.presentation.nav_graph.SetMainNavGraph
import com.example.travenortravellingapp.presentation.util.Dimes

@Preview(
    showBackground = true, widthDp = 375, heightDp = 812
)
@Composable
fun PreviewMainScreen() {
    MainScreen()
}

@Composable
fun MainScreen() {
    val navControllerMainScreen = rememberNavController()
    val selected = remember {
        mutableStateOf(R.drawable.icon_home)
    }

    Column(
        modifier = Modifier
            .fillMaxSize(1f)
            .background(Color.White),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.9f)
        ) {
            SetMainNavGraph(navControllerMainScreen)
        }

        val screens = listOf(
            Routes.HomeScreen.route,
            Routes.CalendarScreen.route,
            Routes.MessagesScreen.route,
            Routes.ProfileScreen.route,
        )

        val navBackStackEntry by navControllerMainScreen.currentBackStackEntryAsState()
        val currentDestination = navBackStackEntry?.destination

        val bottomBarDestination = screens.any { it == currentDestination?.route }

        if (bottomBarDestination) {
        val shadowColor = Color(color = R.color.black).copy(alpha = 1f)
        Box(
            modifier = Modifier
                .shadow(
                    elevation = 12.dp,
                    spotColor = shadowColor,
                    ambientColor = shadowColor,
                    shape = RoundedCornerShape(topStart = 30.dp, topEnd = 30.dp)
                )
                .background(Color.White)
                .fillMaxWidth()
                .padding(Dimes.VerySmallPadding),
            contentAlignment = Alignment.TopCenter
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {

                IconButtonBox(
                    text = "Home",
                    icon = R.drawable.icon_home,
                    borderRadius = 0.dp,
                    iconColor = if (selected.value == R.drawable.icon_home) colorResource(R.color.primary_color) else colorResource(
                        R.color.sub_text_color
                    ),
                    textColor = if (selected.value == R.drawable.icon_home) colorResource(R.color.primary_color) else colorResource(
                        R.color.sub_text_color
                    ),
                ) {
                    if (selected.value != R.drawable.icon_home) {
                        selected.value = R.drawable.icon_home
                        navControllerMainScreen.navigate(Routes.HomeScreen.route) {
                            popUpTo(0)
                        }
                    }
                }
                IconButtonBox(
                    text = "Calendar", icon = R.drawable.icon_calendar, borderRadius = 0.dp,
                    iconColor = if (selected.value == R.drawable.icon_calendar) colorResource(R.color.primary_color) else colorResource(
                        R.color.sub_text_color
                    ),
                    textColor = if (selected.value == R.drawable.icon_calendar) colorResource(R.color.primary_color) else colorResource(
                        R.color.sub_text_color
                    ),
                ) {
                    if (selected.value != R.drawable.icon_calendar) {
                        selected.value = R.drawable.icon_calendar
                        navControllerMainScreen.navigate(Routes.CalendarScreen.route) {
                            popUpTo(0)
                        }
                    }
                }

                IconButtonBox(
                    icon = R.drawable.icon_search,
                    borderRadius = 100.dp,
                    containerColor = colorResource(R.color.primary_color),
                    iconColor = colorResource(R.color.white),
                    sizeBox = 50.dp,

                    ) {

                }

                IconButtonBox(
                    text = "Messages", icon = R.drawable.icon_messages, borderRadius = 0.dp,
                    iconColor = if (selected.value == R.drawable.icon_messages) colorResource(R.color.primary_color) else colorResource(
                        R.color.sub_text_color
                    ),
                    textColor = if (selected.value == R.drawable.icon_messages) colorResource(R.color.primary_color) else colorResource(
                        R.color.sub_text_color
                    ),
                ) {
                    if (selected.value != R.drawable.icon_messages) {
                        selected.value = R.drawable.icon_messages
                        navControllerMainScreen.navigate(Routes.MessagesScreen.route) {
                            popUpTo(0)
                        }
                    }
                }

                IconButtonBox(
                    text = "Profile", icon = R.drawable.icon_profile, borderRadius = 0.dp,
                    iconColor = if (selected.value == R.drawable.icon_profile) colorResource(R.color.primary_color) else colorResource(
                        R.color.sub_text_color
                    ),
                    textColor = if (selected.value == R.drawable.icon_profile) colorResource(R.color.primary_color) else colorResource(
                        R.color.sub_text_color
                    ),
                ) {
                    if (selected.value != R.drawable.icon_profile) {
                        selected.value = R.drawable.icon_profile
                        navControllerMainScreen.navigate(Routes.ProfileScreen.route) {
                            popUpTo(0)
                        }
                    }
                }
            }
        }
        }
    }
}