package com.sahil.expensex.presentation.home.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.DirectionsCar
import androidx.compose.material.icons.outlined.Fastfood
import androidx.compose.material.icons.outlined.Movie
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun RecentTransaction(){

    Column() {

        Row(
            modifier = Modifier
                .fillMaxWidth()
                ,
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically

        ) {

            Text(
                text = "Recent Transaction",
                style= MaterialTheme.typography.titleMedium
            )

            TextButton(onClick = {}) {
                Text(text = "View All")
            }
        }

        Spacer(modifier = Modifier.height(12.dp))

        TransactionItem(
            title = "Netflix Subscription",
            category = "Entertainment",
            amount = "-₹499",
            date = "Today",
            icon = Icons.Outlined.Movie,
            iconBackground = Color(0xFFE53935)
        )

        Spacer(modifier = Modifier.height(12.dp))

        TransactionItem(
            title = "Uber Ride",
            category = "Transport",
            amount = "-₹250",
            date = "Yesterday",
            icon = Icons.Outlined.DirectionsCar,
            iconBackground = Color(0xFF5C6BC0)
        )

        Spacer(modifier = Modifier.height(12.dp))

        TransactionItem(
            title = "Swiggy Order",
            category = "Food & Dining",
            amount = "-₹680",
            date = "May 14",
            icon = Icons.Outlined.Fastfood,
            iconBackground = Color(0xFFFF7043)
        )

    }

}