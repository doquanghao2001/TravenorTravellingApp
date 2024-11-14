package com.example.travenortravellingapp.presentation.home

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
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
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardColors
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.travenortravellingapp.R
import com.example.travenortravellingapp.presentation.nav_graph.Routes
import com.example.travenortravellingapp.presentation.util.Dimes

@Preview(
    showBackground = true, widthDp = 375, heightDp = 812 - 64
)
@Composable
fun PreviewHomeScreen() {
    HomeScreen()
}

@SuppressLint("ResourceAsColor")
@Composable
fun HomeScreen(navController: NavHostController = rememberNavController()) {
    Box(modifier = Modifier.background(color = colorResource(R.color.white))) {
        LazyColumn(
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
                                start = Dimes.SmallPadding, end = Dimes.SmallPadding
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
                        val shadowColor = Color(color = R.color.black).copy(alpha = 0.3f)
                        items(minOf(300, 20)) { itemIndex ->
                            Box(
                                modifier = Modifier
                                    .shadow(
                                        elevation = 8.dp,
                                        spotColor = shadowColor,
                                        ambientColor = shadowColor,
                                        shape = RoundedCornerShape(24.dp)
                                    )
                                    .clickable {
                                        navController.navigate(Routes.DetailsScreen.route)
                                    }
                                    .background(Color.White)
                                    .size(
                                        width = Dimes.LargeCardWidth, height = Dimes.LargeCardHeight
                                    )
                                    .padding(Dimes.SmallPadding),
                                contentAlignment = Alignment.TopCenter,

                                ) {
                                Column(
                                    modifier = Modifier.fillMaxSize(),
                                    verticalArrangement = Arrangement.SpaceBetween
                                ) {
                                    Image(
                                        painter = painterResource(R.drawable.image_card_1),
                                        contentDescription = null,
                                        contentScale = ContentScale.Crop,
                                        modifier = Modifier
                                            .size(
                                                width = Dimes.SmallImageCardWidth,
                                                height = Dimes.SmallImageCardHeight
                                            )
                                            .clip(
                                                shape = RoundedCornerShape(14.dp)
                                            )
                                    )
                                    Row(
                                        modifier = Modifier.fillMaxWidth(),
                                        horizontalArrangement = Arrangement.SpaceBetween,
                                        verticalAlignment = Alignment.CenterVertically
                                    ) {
                                        Text(
                                            text = "Niladri Reservoir",
                                            fontSize = 18.sp,
                                            style = MaterialTheme.typography.bodyLarge,
                                        )
                                        Row(verticalAlignment = Alignment.CenterVertically) {
                                            Icon(
                                                modifier = Modifier.size(
                                                    width = 20.dp, height = 20.dp
                                                ),
                                                painter = painterResource(R.drawable.baseline_star_24),
                                                contentDescription = null,
                                                tint = colorResource(R.color.yellow_color)
                                            )
                                            Text(
                                                text = "4.7",
                                                fontSize = 15.sp,
                                            )
                                        }
                                    }
                                    Row(
                                        modifier = Modifier.fillMaxWidth(),
                                        horizontalArrangement = Arrangement.SpaceBetween,
                                        verticalAlignment = Alignment.CenterVertically
                                    ) {
                                        Row(verticalAlignment = Alignment.CenterVertically) {
                                            Icon(
                                                painter = painterResource(R.drawable.icon_location),
                                                contentDescription = null,
                                                tint = colorResource(R.color.sub_text_color)
                                            )
                                            Text(
                                                text = "Tekergat, Sunamgnj",
                                                fontSize = 14.sp,
                                                style = MaterialTheme.typography.bodySmall,
                                                color = colorResource(R.color.sub_text_color)
                                            )
                                        }

                                        val itemCount = 5

                                        LazyRow(
                                            horizontalArrangement = Arrangement.spacedBy((-12).dp),
                                        ) {
                                            items(minOf(itemCount, 3)) { itemIndex ->
                                                Image(
                                                    painter = painterResource(R.drawable.icon_user),
                                                    contentDescription = null,
                                                    contentScale = ContentScale.Crop,
                                                    modifier = Modifier
                                                        .clip(CircleShape)
                                                        .size(height = 24.dp, width = 24.dp)
                                                        .border(
                                                            width = 0.4.dp,
                                                            color = colorResource(R.color.sub_text_color),
                                                            shape = CircleShape
                                                        ),
                                                )
                                            }

                                            if (itemCount > 3) {
                                                item {
                                                    Box(
                                                        modifier = Modifier
                                                            .size(24.dp)
                                                            .background(
                                                                color = colorResource(R.color.primary_color_1),
                                                                CircleShape
                                                            )
                                                            .border(
                                                                width = 0.4.dp,
                                                                color = colorResource(R.color.sub_text_color),
                                                                shape = CircleShape
                                                            )
                                                    ) {
                                                        Text(
                                                            text = "+${itemCount - 3}",
                                                            fontSize = 11.sp,
                                                            fontWeight = FontWeight.Bold,
                                                            color = colorResource(R.color.dark_blue_grey),
                                                            textAlign = TextAlign.Center,
                                                            modifier = Modifier.align(Alignment.Center)
                                                        )
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    Spacer(modifier = Modifier.height(12.dp))
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(
                                start = Dimes.SmallPadding, end = Dimes.SmallPadding
                            ),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            text = "Explore more",
                            fontSize = Dimes.SmallTextSize,
                            style = MaterialTheme.typography.bodySmall
                        )
                        Text(
                            text = "View all",
                            fontSize = 14.sp,
                            color = colorResource(R.color.orange)
                        )
                    }
                }
            }

            val shadowColor = Color(color = R.color.black).copy(alpha = 0.3f)

            items(minOf(300, 20)) { itemIndex ->
                Box(modifier = Modifier.padding(start = 24.dp, end = 24.dp)) {
                    Box(
                        modifier = Modifier
                            .shadow(
                                elevation = 8.dp,
                                spotColor = shadowColor,
                                ambientColor = shadowColor,
                                shape = RoundedCornerShape(24.dp)
                            )
                            .background(Color.White)
                            .height(116.dp)
                            .fillMaxWidth()
                            .clickable {
                                navController.navigate(Routes.DetailsScreen.route)
                            }
                            .padding(Dimes.VerySmallPadding),
                        contentAlignment = Alignment.TopCenter
                    ) {
                        Row(
                            modifier = Modifier.fillMaxSize(),
                            horizontalArrangement = Arrangement.SpaceBetween,
                            verticalAlignment = Alignment.CenterVertically
                        ) {
                            Image(
                                painter = painterResource(R.drawable.image_card_2),
                                contentDescription = null,
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .size(
                                        width = Dimes.VerySmallImageCardWidth,
                                        height = Dimes.VerySmallImageCardHeight
                                    )
                                    .clip(
                                        shape = RoundedCornerShape(20.dp)
                                    )
                            )
                            Column(
                                modifier = Modifier.fillMaxSize(),
                                horizontalAlignment = Alignment.End,
                                verticalArrangement = Arrangement.SpaceEvenly
                            ) {
                                Text(
                                    text = "Niladri Reservoir",
                                    fontSize = Dimes.ContentTextSize,
                                    style = MaterialTheme.typography.bodyLarge,
                                )
                                Row(verticalAlignment = Alignment.CenterVertically) {
                                    Icon(
                                        painter = painterResource(R.drawable.icon_location),
                                        contentDescription = null,
                                        tint = colorResource(R.color.sub_text_color),
                                        modifier = Modifier.size(12.dp)
                                    )
                                    Text(
                                        text = "Tekergat, Sunamgnj",
                                        fontSize = Dimes.IconTextSize,
                                        style = MaterialTheme.typography.bodySmall,
                                        color = colorResource(R.color.sub_text_color)
                                    )
                                }

                                val itemCount = 5

                                LazyRow(
                                    horizontalArrangement = Arrangement.spacedBy((-17).dp),
                                ) {
                                    items(minOf(itemCount, 3)) { itemIndex ->
                                        Image(
                                            painter = painterResource(R.drawable.icon_user),
                                            contentDescription = null,
                                            contentScale = ContentScale.Crop,
                                            modifier = Modifier
                                                .clip(CircleShape)
                                                .size(height = 34.dp, width = 34.dp)
                                                .border(
                                                    width = 0.4.dp,
                                                    color = colorResource(R.color.sub_text_color),
                                                    shape = CircleShape
                                                )
                                        )
                                    }

                                    if (itemCount > 3) {
                                        item {
                                            Box(
                                                modifier = Modifier
                                                    .size(34.dp)
                                                    .background(
                                                        color = colorResource(R.color.primary_color_1),
                                                        CircleShape
                                                    )
                                                    .border(
                                                        width = 0.4.dp,
                                                        color = colorResource(R.color.sub_text_color),
                                                        shape = CircleShape
                                                    )
                                            ) {
                                                Text(
                                                    text = "+${itemCount - 3}",
                                                    fontSize = 11.sp,
                                                    fontWeight = FontWeight.Bold,
                                                    color = colorResource(R.color.dark_blue_grey),
                                                    textAlign = TextAlign.Center,
                                                    modifier = Modifier.align(Alignment.Center)
                                                )
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
