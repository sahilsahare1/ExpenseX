package com.sahil.expensex.presentation.home.components

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sahil.expensex.presentation.home.HomeScreen

@Composable
fun BottomNavButton(
    title: String,
    icon: ImageVector,
    selected: Boolean,
    onClick: () -> Unit
){
    val tint = if (selected) {
        Color(0xFF6C5CE7)
    } else {
        Color.Gray
    }
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.clickable{onClick()}.size(width = 64.dp, height = 45.dp)
    ) {
        Icon(
            imageVector = icon,
            contentDescription = null,
            modifier = Modifier.size(24.dp),
            tint = tint

        )

        Spacer(modifier = Modifier.height(4.dp))

        Text(
            text = title,
            fontSize = 12.sp
        )
    }

}

@Preview(showBackground = true)
@Composable
private fun BottomNavButtonPreview () {

    BottomNavButton("Home",Icons.Default.Home,false,{})

}