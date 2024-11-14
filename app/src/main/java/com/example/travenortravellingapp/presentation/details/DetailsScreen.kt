package com.example.travenortravellingapp.presentation.details

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
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
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.travenortravellingapp.R
import com.example.travenortravellingapp.presentation.common.ButtonBox
import com.example.travenortravellingapp.presentation.nav_graph.Routes
import com.example.travenortravellingapp.presentation.util.Dimes
import kotlinx.coroutines.launch

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
        Image(
            modifier = Modifier
                .fillMaxWidth(1f)
                .fillMaxHeight(1f),
            painter = painterResource(id = R.drawable.onboard_page_1),
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
                fontWeight = FontWeight.Bold,
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

        Box(
            modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(0.6f)
                .align(alignment = Alignment.BottomCenter),
        ) {
            Image(
                modifier = Modifier
                    .fillMaxSize()
                    .align(alignment = Alignment.BottomCenter),
                painter = painterResource(id = R.drawable.box_detail),
                contentDescription = null,
                contentScale = ContentScale.Crop
            )
            Column(modifier = Modifier.fillMaxSize()) {
                Box(
                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight(0.8f),
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(12.dp)
                    ) {
                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .padding(top = 41.dp),
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            Column {
                                Text(
                                    text = "Niladri Reservoir",
                                    fontSize = 24.sp,
                                    fontWeight = FontWeight.Bold,
                                )
                                Spacer(modifier = Modifier.height(8.dp))
                                Text(
                                    text = "Tekergat, Sunamgnj",
                                    fontSize = 15.sp,
                                    color = colorResource(R.color.sub_text_color)
                                )
                            }
                            Image(
                                painter = painterResource(R.drawable.icon_user),
                                contentDescription = null,
                                contentScale = ContentScale.Crop,
                                modifier = Modifier
                                    .clip(CircleShape)
                                    .size(height = 50.dp, width = 50.dp),
                            )
                        }
                        Spacer(modifier = Modifier.height(28.dp))
                        Row(
                            modifier = Modifier
                                .fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            Row(verticalAlignment = Alignment.CenterVertically) {
                                Icon(
                                    painter = painterResource(R.drawable.icon_location),
                                    contentDescription = null,
                                    tint = colorResource(R.color.sub_text_color)
                                )
                                Spacer(modifier = Modifier.width(3.dp))
                                Text(
                                    text = "Tekergat",
                                    fontSize = 14.sp,
                                    style = MaterialTheme.typography.bodySmall,
                                    color = colorResource(R.color.sub_text_color)
                                )
                            }
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
                                    buildAnnotatedString {
                                        append("4.7")
                                        withStyle(style = SpanStyle(color = colorResource(R.color.sub_text_color))) {
                                            append("(2498)")
                                        }
                                    },
                                    fontSize = 15.sp,
                                )
                            }
                            Text(
                                buildAnnotatedString {
                                    withStyle(style = SpanStyle(color = colorResource(R.color.primary_color))) {
                                        append("\$59/")
                                    }
                                    withStyle(style = SpanStyle(color = colorResource(R.color.sub_text_color))) {
                                        append("Person")
                                    }
                                },
                                fontSize = 15.sp,
                            )

                        }
                        Spacer(modifier = Modifier.height(24.dp))
                        val itemCount = 5
                        LazyRow(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.spacedBy(24.dp),
                        ) {
                            items(minOf(itemCount, 4)) { itemIndex ->
                                Image(
                                    painter = painterResource(R.drawable.image_details),
                                    contentDescription = null,
                                    contentScale = ContentScale.Crop,
                                    modifier = Modifier
                                        .size(height = 46.dp, width = 46.dp)
                                        .clip(RoundedCornerShape(12.dp)),
                                )
                            }

                            if (itemCount > 4) {
                                item {
                                    Box {
                                        Image(
                                            painter = painterResource(R.drawable.image_details),
                                            contentDescription = null,
                                            contentScale = ContentScale.Crop,
                                            modifier = Modifier
                                                .size(height = 46.dp, width = 46.dp)
                                                .clip(RoundedCornerShape(12.dp)),
                                        )
                                        Text(
                                            text = "+${itemCount - 3}",
                                            fontSize = 16.sp,
                                            fontWeight = FontWeight.Bold,
                                            color = colorResource(R.color.sub_text_color),
                                            textAlign = TextAlign.Center,
                                            modifier = Modifier.align(Alignment.Center)
                                        )
                                    }
                                }
                            }
                        }
                        Spacer(modifier = Modifier.height(24.dp))
                        Text(
                            text = "About Destination",
                            fontSize = 20.sp,
                            fontWeight = FontWeight.SemiBold,
                        )
                        Spacer(modifier = Modifier.height(20.dp))

                        Text(
                            text = "You will get a complete travel package on the beaches. Packages in the form of airline tickets, recommended Hotel rooms, Transportation, Have you ever been on holiday to the Greek ETC... Read More",
                            fontSize = 14.sp,
                            lineHeight = 20.sp
                        )
                    }
                }
                ButtonBox(
                    text = "Book Now",
                    fontSize = Dimes.SmallTextSize,
                    height = Dimes.MediumBoxHeight,
                    textColor = colorResource(id = R.color.white),
                    borderRadius = 16.dp
                ) {

                }
            }
        }
    }
}