package com.sahil.expensex.presentation.home.components

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sahil.expensex.presentation.home.model.ExpenseCategory

@Composable
fun DonutChart(
    categories: List<ExpenseCategory>,
    modifier: Modifier = Modifier
){

    Box(
        modifier = Modifier.size(180.dp),
        contentAlignment = Alignment.Center
    ){

        Column(
            modifier=Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ) {
            Text(
                text = "₹14,250",
                fontSize = 28.sp,
                fontWeight = FontWeight.Bold

            )

            Text(
                text = "Spent",
                fontSize = 16.sp,
                fontWeight = FontWeight.SemiBold,
                color = Color.Gray

            )

        }

        Canvas(
            modifier = Modifier.size(180.dp)
            ) {



            var startAngle = -90f

            categories.forEach { category ->
                val sweepAngle = (category.percentage / 100f) * 360f

                drawArc(
                    color = category.color,
                    startAngle=startAngle,
                    sweepAngle=sweepAngle,
                    useCenter = false,
                    style = Stroke(width = 72f, cap = StrokeCap.Round),


                )

                startAngle+=sweepAngle
            }


        }

    }
}