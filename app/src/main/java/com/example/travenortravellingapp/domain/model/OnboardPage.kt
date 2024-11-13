package com.example.travenortravellingapp.domain.model

import androidx.annotation.DrawableRes
import com.example.travenortravellingapp.R

data class OnboardPage(
    @DrawableRes val imageTitle: Int, val description: String, @DrawableRes val imageBackground: Int
)

val listOnboardPage = listOf(
    OnboardPage(
        imageTitle = R.drawable.onboard_image_title_1,
        description = "At Friends tours and travel, we customize reliable and trutworthy educational tours to destinations all over the world",
        imageBackground = R.drawable.onboard_page_1
    ),
    OnboardPage(
        imageTitle = R.drawable.onboard_image_title_2,
        description = "To get the best of your adventure you just need to leave and go where you like. we are waiting for you",
        imageBackground = R.drawable.onboard_page_2
    ),
    OnboardPage(
        imageTitle = R.drawable.onboard_image_title_3,
        description = "To get the best of your adventure you just need to leave and go where you like. we are waiting for you",
        imageBackground = R.drawable.onboard_page_3
    ),
)
