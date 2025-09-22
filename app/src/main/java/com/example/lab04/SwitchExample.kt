package com.example.lab04

import androidx.compose.material3.Switch
import androidx.compose.runtime.*

@Composable
fun SwitchExample() {
    var checked by remember { mutableStateOf(true) } // antes estaba en false
    Switch(
        checked = checked,
        onCheckedChange = { checked = it }
    )
}
