package com.navibuddy.leadyourway.ui.auth.components

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.DirectionsBike
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.InsertComment
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview
@Composable
fun BottomNavigation(inSearch: Boolean, setInSearch: (Boolean) -> Unit) {

    BottomAppBar{
        Spacer(modifier = Modifier.weight(1f))
        FloatingActionButton(
            onClick = {
                setInSearch(true)
            },
            elevation = FloatingActionButtonDefaults.elevation(0.dp)
        ) {
            Icon(Icons.Filled.Search, "Search Section")
        }
        Spacer(modifier = Modifier.padding(8.dp))
        FloatingActionButton(
            onClick = {
                setInSearch(false)
            },
            elevation = FloatingActionButtonDefaults.elevation(0.dp)
        ) {
            Icon(Icons.Filled.Favorite, "Favorite bikes")
        }
        Spacer(modifier = Modifier.padding(8.dp))
        FloatingActionButton(
            onClick = {
                setInSearch(false)
            },
            elevation = FloatingActionButtonDefaults.elevation(0.dp)
        ) {
            Icon(Icons.Filled.DirectionsBike, "Rented bikes")
        }
        Spacer(modifier = Modifier.padding(8.dp))
        FloatingActionButton(
            onClick = {
                setInSearch(false)
            },
            elevation = FloatingActionButtonDefaults.elevation(0.dp)
        ) {
            Icon(Icons.Filled.InsertComment, "Inbox of messages")
        }
        Spacer(modifier = Modifier.padding(8.dp))
        FloatingActionButton(
            onClick = {
                setInSearch(false)
            },
            elevation = FloatingActionButtonDefaults.elevation(0.dp)
        ) {
            Icon(Icons.Filled.AccountCircle, "Profile")
        }
        Spacer(modifier = Modifier.weight(1f))
    }
}
