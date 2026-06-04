package com.bk.bkompose.ui.screens

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.tooling.preview.Preview
import com.bk.bkompose.ui.components.BaseScreen
import com.bk.bkompose.ui.theme.BKomposeTheme

@Composable
fun MainScreen(
    onNavigateToSample: () -> Unit
) {
    BaseScreen(title = "BKompose Animations") {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(16.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Button(
                onClick = onNavigateToSample,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(text = "Basic Animation Sample")
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MainScreenPreview() {
    BKomposeTheme {
        MainScreen(onNavigateToSample = {})
    }
}
