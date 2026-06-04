package com.bk.bkompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.bk.bkompose.navigation.AppNavigation
import com.bk.bkompose.ui.theme.BKomposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BKomposeTheme {
                AppNavigation()
            }
        }
    }
}
