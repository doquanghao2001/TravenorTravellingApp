package com.example.travenortravellingapp.presentation.details

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.BiasAlignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.travenortravellingapp.R
import com.example.travenortravellingapp.presentation.util.Dimes

@Preview(
    showBackground = true,
    widthDp = 375,
    heightDp = 812
)
@Composable
fun PreviewDetailsScreen() {
    DetailsScreen()
}

@Composable
fun DetailsScreen(navController: NavController = rememberNavController()) {
    Box(modifier = Modifier.fillMaxSize()) {
        Image(painter = painterResource(id = R.drawable.detail), contentDescription = null)

        Column(modifier = Modifier.fillMaxSize(), verticalArrangement = Arrangement.Top) {

            Image(
                modifier = Modifier
                    .fillMaxWidth(1f)
                    .fillMaxHeight(0.5f),
                painter = painterResource(id = R.drawable.image_card_2),
                contentDescription = null,
                contentScale = ContentScale.Crop
            )

            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .padding(20.dp)
                    .fillMaxWidth()
            ) {
                Box(
                    modifier = Modifier
                        .size(height = 46.dp, width = 46.dp)
                        .clip(
                            RoundedCornerShape(Dimes.LargeCornerRadius)
                        )
                ) {
                    Image(
                        painter = painterResource(R.drawable.icon_back),
                        contentDescription = null,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .clip(CircleShape)
                            .size(height = 46.dp, width = 46.dp),
                    )
                }
                Text(
                    text = "Details",
                    fontSize = Dimes.SmallTextSize,
                    style = MaterialTheme.typography.bodyLarge,
                    color = colorResource(R.color.white)
                )
                Box(
                    modifier = Modifier
                        .size(height = 46.dp, width = 46.dp)
                        .clip(
                            RoundedCornerShape(Dimes.LargeCornerRadius)
                        )
                ) {
                    Image(
                        painter = painterResource(R.drawable.icon_book),
                        contentDescription = null,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .clip(CircleShape)
                            .size(height = 46.dp, width = 46.dp),
                    )
                }
            }
        }
    }
}