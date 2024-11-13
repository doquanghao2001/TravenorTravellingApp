package com.example.travenortravellingapp.presentation.onboard.component

import androidx.compose.animation.core.animateDpAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.pager.PagerState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import com.example.travenortravellingapp.R
import com.example.travenortravellingapp.presentation.util.Dimes

@Composable
fun PageIndicator(pageState: PagerState) {
    Row(
        modifier = Modifier
            .wrapContentHeight()
            .fillMaxWidth()
            .padding(bottom = 31.dp),
        horizontalArrangement = Arrangement.Center
    ) {
        repeat(pageState.pageCount) { iteration ->
            val indicatorSize by animateDpAsState(
                targetValue = when (iteration) {
                    pageState.currentPage -> 35.dp
                    pageState.currentPage + 1 -> 15.dp
                    else -> 7.dp
                },
                animationSpec = tween(durationMillis = 300),
                label = ""
            )

            val color =
                if (pageState.currentPage == iteration) R.color.primary_color else R.color.primary_color_1
            Box(
                modifier = Modifier
                    .padding(2.dp)
                    .size(height = 7.dp, width = indicatorSize)
                    .border(
                        Dimes.SmallBorderWidth,
                        color = colorResource(color),
                        RoundedCornerShape(Dimes.SmallBorderWidth)
                    )
            )
        }
    }
}