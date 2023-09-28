package com.navibuddy.leadyourway.ui.auth.activities

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.navibuddy.leadyourway.ui.auth.components.BottomNavigation
import com.skydoves.landscapist.glide.GlideImage

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Preview
@Composable
fun Home() {
    val (inSearch, setInSearch) = remember { mutableStateOf(false) }

    Scaffold(
        content = {
            Text(text = "Home", modifier = Modifier.padding(16.dp))
            if (inSearch) {
                GlideImage(
                    imageModel = { "https://www.nalc.gov.uk/images/easyblog_articles/1110/bigstock--204040621.jpg" },
                    modifier = Modifier.padding(16.dp)
                )
            } else {
                Column(
                    verticalArrangement = Arrangement.SpaceAround,
                    modifier = Modifier.padding(16.dp)
                ) {
                    Text(text = "Home Page")
                }
            }
        },
        bottomBar = { BottomNavigation(inSearch, setInSearch) }
    )
}