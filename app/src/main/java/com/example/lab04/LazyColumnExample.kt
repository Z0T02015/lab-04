package com.example.lab04

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun LazyColumnExample() {
    val itemsList = listOf("Película 1", "Película 2", "Película 3", "Película 4", "Película 5")
    LazyColumn(
        modifier = Modifier.fillMaxSize().padding(16.dp)
    ) {
        items(itemsList) { item ->
            Text(text = item)
        }
    }
}
