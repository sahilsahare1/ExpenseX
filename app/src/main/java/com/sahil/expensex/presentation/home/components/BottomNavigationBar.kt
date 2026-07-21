package com.sahil.expensex.presentation.home.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Analytics
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Money
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.outlined.Add
import androidx.compose.material.icons.outlined.Analytics
import androidx.compose.material.icons.outlined.Home
import androidx.compose.material.icons.outlined.Menu
import androidx.compose.material.icons.outlined.Person
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Surface

import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp


@Composable
fun BottomNavigationBar(
    selectedIndex: Int=0,
    onHomeClick: () -> Unit ={},
    onTransactionClick: () -> Unit ={},
    onAddClick: () -> Unit ={},
    onAnalysisClick: () -> Unit ={},
    onProfileClick: () -> Unit ={},



){

    Surface(
        shadowElevation = 12.dp,
        shape = RoundedCornerShape(topStart = 24.dp, topEnd = 24.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp)
                .height(80.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically

        ) {

            BottomNavButton(
                "Home",
                Icons.Outlined.Home,
                true,
                { onHomeClick() }
            )

            BottomNavButton(
                "Transactions", Icons.Outlined.Menu,
                false,
                { onTransactionClick() }
            )

            FloatingActionButton(
                { onAddClick() },
                containerColor = Color(0xFF6C5CE7)
            ) {
                Icon(
                    Icons.Outlined.Add,
                    null,
                    tint = Color.White
                )
            }

            BottomNavButton(
                "Analytics",
                Icons.Outlined.Analytics,
                false,
                { onAnalysisClick() }
            )

            BottomNavButton(
                "Profile", Icons.Outlined.Person,
                false,
                { onProfileClick() }
            )


        }
    }
}

@Preview(showBackground = true)
@Composable
private fun BottomNavigationBarPreview() {
    BottomNavigationBar()
    
}