package com.example.travenortravellingapp.presentation.common

import androidx.annotation.DrawableRes
import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import com.example.travenortravellingapp.R
import com.example.travenortravellingapp.presentation.util.Dimes

@Composable
fun IconButtonBox(
    text: String = "",
    @DrawableRes icon: Int,
    containerColor: Color = colorResource(id = R.color.white),
    iconColor: Color = colorResource(id = R.color.primary_color),
    textColor: Color = colorResource(id = R.color.primary_color),
    fontSize: TextUnit = Dimes.IconTextSize,
    iconSize: Dp = Dimes.SmallIconSize,
    borderRadius: Dp = Dimes.LargeCornerRadius,
    sizeBox: Dp = 60.dp,
    onButtonClick: () -> Unit,
) {
    val interactionSource = remember { MutableInteractionSource() }

    val isPressed by interactionSource.collectIsPressedAsState()

    val scale by animateFloatAsState(
        targetValue = if (isPressed) 0.98f else 1f,
        animationSpec = tween(durationMillis = 150),
        label = "",
    )

    val opacity by animateFloatAsState(
        targetValue = if (isPressed) 0.95f else 1f,
        animationSpec = tween(durationMillis = 150),
        label = ""
    )

    Box(
        modifier = Modifier.graphicsLayer(
            scaleX = scale, scaleY = scale, alpha = opacity
        ),
        contentAlignment = Alignment.Center
    ) {
        Box(
            modifier = Modifier
                .clickable(
                    interactionSource = interactionSource, indication = null
                ) { onButtonClick() }
                .clip(RoundedCornerShape(borderRadius))
                .background(containerColor)
                .size(sizeBox),
            contentAlignment = Alignment.Center,
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Center
            ) {
                Icon(
                    painter = painterResource(icon),
                    contentDescription = null,
                    tint = iconColor,
                    modifier = Modifier.size(iconSize)
                )
                if (text.isNotEmpty())
                    Text(
                        text = text,
                        fontSize = fontSize,
                        color = textColor
                    )
            }
        }
    }
}