package com.example.travenortravellingapp.presentation.onboard

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.pager.HorizontalPager
import androidx.compose.foundation.pager.rememberPagerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.travenortravellingapp.R
import com.example.travenortravellingapp.domain.model.listOnboardPage
import com.example.travenortravellingapp.presentation.common.ButtonBox
import com.example.travenortravellingapp.presentation.nav_graph.Routes
import com.example.travenortravellingapp.presentation.onboard.component.OnBoardingPage
import com.example.travenortravellingapp.presentation.onboard.component.PageIndicator
import com.example.travenortravellingapp.presentation.util.Dimes
import kotlinx.coroutines.launch

@Preview(
    showBackground = true,
    widthDp = 375,
    heightDp = 812
)
@Composable
fun PreviewOnBoardScreen() {
    OnBoardScreen()
}

@Composable
fun OnBoardScreen(
    navController: NavHostController = rememberNavController()
) {
    Column(
        modifier = Modifier
            .fillMaxSize(),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        val pageState = rememberPagerState(initialPage = 0) { listOnboardPage.size }
        val buttonState = when (pageState.currentPage) {
            0 -> "Get Started"
            1 -> "Next"
            2 -> "Done"
            else -> ""
        }

        HorizontalPager(state = pageState, userScrollEnabled = false) { index ->
            OnBoardingPage(
                onboardPage = listOnboardPage[index]
            )
        }

        Column(
            modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Bottom
        ) {
            val scope = rememberCoroutineScope()
            PageIndicator(pageState)
            ButtonBox(
                text = buttonState,
                fontSize = Dimes.ContentTextSize,
                height = Dimes.MediumBoxHeight,
                textColor = colorResource(id = R.color.white),
            ) {
                scope.launch {
                    if (pageState.currentPage >= pageState.pageCount - 1) {
                        navController.navigate(route = Routes.MainScreen.route)
                    } else {
                        pageState.animateScrollToPage(page = pageState.currentPage + 1)
                    }
                }
            }
            Spacer(modifier = Modifier.height(Dimes.MediumPadding))
        }
    }
}


