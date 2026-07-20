package com.sahil.expensex.presentation.home.components



import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.unit.dp
import com.sahil.expensex.presentation.home.model.ExpenseCategory

@Composable
fun CategoryLegend(
    categories: List<ExpenseCategory>
) {

    Column(
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {

        categories.forEach { category ->

            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {

                Box(
                    modifier = Modifier
                        .size(13.dp)
                        .clip(CircleShape)
                        .background(category.color)
                )

                Spacer(modifier = Modifier.width(8.dp))

                Text(
                    text = category.name,
                    modifier = Modifier.weight(1f),
                    style = MaterialTheme.typography.bodyMedium
                )

                Text(
                    text = "${category.percentage.toInt()}%",
                    style = MaterialTheme.typography.bodyMedium
                )

            }

        }

    }

}