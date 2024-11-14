package com.example.travenortravellingapp.presentation.main_activity

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.example.travenortravellingapp.presentation.nav_graph.SetAuthNavGraph
import com.example.travenortravellingapp.ui.theme.TravenorTravellingAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val splashScreen = installSplashScreen()
        splashScreen.setKeepOnScreenCondition {
            Handler(Looper.getMainLooper()).postDelayed({
                splashScreen.setKeepOnScreenCondition { false }
            }, 600)
            true
        }

        setContent {
            TravenorTravellingAppTheme {
                SetAuthNavGraph()
            }
        }
    }
}
