package com.sahil.expensex.presentation.home.components

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.KeyboardArrowDown
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.sahil.expensex.presentation.home.model.ExpenseCategory
@Preview(showSystemUi = true)
@Composable
fun ExpenseOverview() {

    val categories = listOf(
        ExpenseCategory("Food & Dining", 35f, Color(0xFF7C4DFF)),
        ExpenseCategory("Transport", 20f, Color(0xFFFF7043)),
        ExpenseCategory("Shopping", 15f, Color(0xFFFFD54F)),
        ExpenseCategory("Bills & Utilities", 15f, Color(0xFF66BB6A)),
        ExpenseCategory("Entertainment", 10f, Color(0xFFE57373)),
        ExpenseCategory("Others", 5f, Color(0xFF90A4AE))
    )

    Column {

        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {

            Text(
                "Expenses Overview",
                style = MaterialTheme.typography.titleMedium
            )

            Row(
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text("This Month")

                Icon(
                    imageVector = Icons.Outlined.KeyboardArrowDown,
                    contentDescription = null
                )
            }

        }

        Spacer(modifier = Modifier.height(20.dp))


        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(220.dp),
            contentAlignment = Alignment.Center
        ) {

            DonutChart(categories)

        }

        Spacer(modifier = Modifier.height(20.dp))

        CategoryLegend(categories)

    }

}