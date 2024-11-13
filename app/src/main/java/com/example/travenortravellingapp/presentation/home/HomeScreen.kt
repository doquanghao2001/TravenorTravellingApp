package com.example.travenortravellingapp.presentation.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.BiasAlignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.travenortravellingapp.R
import com.example.travenortravellingapp.presentation.util.Dimes

@Preview(
    showBackground = true,
    widthDp = 375,
    heightDp = 812 - 64
)
@Composable
fun PreviewHomeScreen() {
    HomeScreen()
}

@Composable
fun HomeScreen(navController: NavController = rememberNavController()) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
    ) {
        Image(
            painter = painterResource(R.drawable.ui),
            contentDescription = null,
            contentScale = ContentScale.Crop
        )
        LazyColumn(
            modifier = Modifier
                .fillMaxSize(),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            item {
                Column(modifier = Modifier.padding(Dimes.SmallPadding)) {
                    Row(
                        horizontalArrangement = Arrangement.SpaceBetween,
                        modifier = Modifier
                            .padding(top = 8.dp)
                            .fillMaxSize()
                    ) {
                        Box(
                            modifier = Modifier
                                .size(height = 44.dp, width = 124.dp)
                                .clip(
                                    RoundedCornerShape(Dimes.LargeCornerRadius)
                                )
                                .background(color = colorResource(R.color.white_gray))
                        ) {
                            Row(
                                modifier = Modifier.align(alignment = BiasAlignment(-1f, 0f)),
                            ) {
                                Spacer(modifier = Modifier.width(4.dp))
                                Image(
                                    painter = painterResource(R.drawable.icon_user),
                                    contentDescription = null,
                                    contentScale = ContentScale.Crop,
                                    modifier = Modifier
                                        .clip(CircleShape)
                                        .size(height = 37.dp, width = 37.dp),
                                )
                                Spacer(modifier = Modifier.width(4.dp))
                                Text(
                                    text = "Leonardo",
                                    modifier = Modifier.align(alignment = Alignment.CenterVertically),
                                    fontSize = Dimes.ContentTextSize,
                                )
                            }
                        }
                        Box(
                            modifier = Modifier
                                .size(height = 44.dp, width = 44.dp)
                                .clip(
                                    RoundedCornerShape(Dimes.LargeCornerRadius)
                                )
                                .background(color = colorResource(R.color.white_gray)),
                        ) {
                            Image(
                                painter = painterResource(R.drawable.icon_notifi),
                                contentDescription = null,
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .clip(CircleShape)
                                    .size(height = 44.dp, width = 44.dp),
                            )
                        }
                    }
                    Spacer(modifier = Modifier.height(26.dp))
                    Image(
                        painter = painterResource(R.drawable.image_tile),
                        contentDescription = null,
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .size(height = 102.dp, width = 300.dp)
                            .padding(start = 6.dp),
                    )
                }
            }

            item {
                Column {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(
                                start = Dimes.SmallPadding,
                                end = Dimes.SmallPadding
                            ),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "Best Destination",
                            fontSize = Dimes.SmallTextSize,
                            style = MaterialTheme.typography.bodySmall
                        )
                        Text(
                            text = "View all",
                            fontSize = 14.sp,
                            color = colorResource(R.color.orange)
                        )
                    }
                    LazyRow(
                        horizontalArrangement = Arrangement.spacedBy(24.dp),
                        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 16.dp)
                    ) {

                        items(2) { itemIndex ->
                            ElevatedCard(
                                colors = CardDefaults.cardColors(
                                    containerColor = colorResource(R.color.black) // Màu nền của Card
                                ),
                                elevation = CardDefaults.cardElevation(
                                    defaultElevation = 0.dp
                                ),
                                modifier = Modifier
                                    .size(width = 268.dp, height = 384.dp)
                            ) {

                            }
                        }
                    }
                }
            }
        }
    }
}
