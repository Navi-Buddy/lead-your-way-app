package com.navibuddy.leadyourway.ui.auth.activities

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.navibuddy.leadyourway.ui.auth.components.BottomNavigation

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Preview
@Composable
fun Home() {
    Scaffold(
        content = {
            Text(text = "Home", modifier = Modifier.padding(16.dp))
        },
        bottomBar = { BottomNavigation() }
    )
}