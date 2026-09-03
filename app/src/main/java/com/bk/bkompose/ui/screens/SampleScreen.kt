package com.bk.bkompose.ui.screens

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.bk.bkompose.ui.components.BaseScreen
import com.bk.bkompose.ui.theme.BKomposeTheme
import com.bk.bkompose.ui.theme.Theme

@Composable
fun SampleScreen() {
    BaseScreen(title = "Sample Animation") {
        Box(
            modifier = Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "Animation content will go here",
                style = MaterialTheme.typography.headlineMedium,
                color = Theme.colors.primary
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun SampleScreenPreview() {
    BKomposeTheme {
        SampleScreen()
    }
}
