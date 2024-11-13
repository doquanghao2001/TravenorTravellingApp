package com.example.travenortravellingapp.presentation.common

import androidx.compose.animation.core.animateFloatAsState
import androidx.compose.animation.core.tween
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.ripple.rememberRipple
import androidx.compose.material3.MaterialTheme
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
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import com.example.travenortravellingapp.R
import com.example.travenortravellingapp.presentation.util.Dimes

@Preview
@Composable
fun PreviewButtonBox() {

}


@Composable
fun ButtonBox(
    text: String,
    padding: Dp = Dimes.SmallPadding,
    containerColor: Color = colorResource(id = R.color.primary_color),
    textColor: Color = colorResource(id = R.color.black),
    fontSize: TextUnit = Dimes.MediumTextSize,
    fraction: Float = 1f,
    height: Dp = Dimes.SmallBoxHeight,
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
        )
    ) {
        Box(
            modifier = Modifier
                .padding(padding)
                .clickable(
                    interactionSource = interactionSource, indication = null
                ) { onButtonClick() }
                .fillMaxWidth(fraction)
                .height(height)
                .clip(RoundedCornerShape(Dimes.LargeCornerRadius))
                .background(containerColor),
            contentAlignment = Alignment.Center,
        ) {
            Text(
                text = text,
                fontSize = fontSize,
                style = MaterialTheme.typography.labelMedium.copy(fontWeight = FontWeight.SemiBold),
                color = textColor
            )
        }
    }
}