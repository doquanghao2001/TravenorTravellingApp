package com.example.travenortravellingapp.presentation.onboard.component

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.travenortravellingapp.domain.model.OnboardPage
import com.example.travenortravellingapp.domain.model.listOnboardPage
import com.example.travenortravellingapp.presentation.util.Dimes

@Preview(
    showBackground = true,
    widthDp = 375,
    heightDp = 812
)
@Composable
fun PreviewOnBoardingPagePone() {
    OnBoardingPage(
        modifier = Modifier
            .fillMaxSize(),
        onboardPage = listOnboardPage[0]
    )
}


@Composable
fun OnBoardingPage(
    modifier: Modifier = Modifier,
    onboardPage: OnboardPage
) {
    Column(modifier = modifier) {
        Image(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.545f)
                .clip(
                    RoundedCornerShape(
                        bottomStart = Dimes.MediumCornerRadius,
                        bottomEnd = Dimes.MediumCornerRadius
                    )
                ),
            painter = painterResource(onboardPage.imageBackground),
            contentDescription = null,
            contentScale = ContentScale.Crop
        )
        Spacer(modifier = Modifier.height(41.dp))
        Image(
            modifier = Modifier
                .fillMaxWidth(0.83f)
                .align(alignment = Alignment.CenterHorizontally),
            painter = painterResource(onboardPage.imageTitle),
            contentDescription = null,
            contentScale = ContentScale.Inside,
        )
        Text(
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = Dimes.MediumPadding, top = 12.dp, end = Dimes.MediumPadding),
            text = onboardPage.description,
            textAlign = TextAlign.Center,
            fontSize = Dimes.ContentTextSize,
            lineHeight = Dimes.MediumLineHeight
        )
    }
}