package com.sahil.expensex.presentation.home.components

import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.unit.dp
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
                    style = Stroke(width = 72f),


                )

                startAngle+=sweepAngle
            }


        }

    }
}