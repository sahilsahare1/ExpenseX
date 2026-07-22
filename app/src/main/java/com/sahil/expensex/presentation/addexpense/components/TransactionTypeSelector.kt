package com.sahil.expensex.presentation.addexpense.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.google.android.play.integrity.internal.b
import java.nio.channels.Selector


@Composable
fun TransactionTypeSelector(
    isExpense: Boolean,
    onExpenseClick: () -> Unit,
    onIncomeClick: () -> Unit
) {


    Surface(
        modifier = Modifier.fillMaxWidth(),
        shape = RoundedCornerShape(16.dp),
        color = Color(0xFFF3F0FF)
    ) {

        Row(modifier = Modifier.padding(4.dp)) {

            SelectorItem(
                "Expense",
                isExpense,Modifier.weight(1f),
                onExpenseClick
            )
            SelectorItem(
                "Income",
                !isExpense,Modifier.weight(1f),
                onIncomeClick
            )
        }

    }


}



@Composable
fun SelectorItem(
    title: String,
    selected: Boolean,
    modifier: Modifier,
    onClick: () -> Unit
){

    val background = if(selected) Color(0xFF6C5CE7) else Color.Transparent

    val textColor = if(selected) Color.White else Color.DarkGray

    Box(
        modifier = modifier

            .clip(RoundedCornerShape(10.dp))
            .background(background)
            .clickable { onClick() }
            .padding(vertical = 14.dp),
        contentAlignment = Alignment.Center
    ) {
        Text(
            text = title,
            color = textColor,
            fontWeight = FontWeight.SemiBold
        )
    }

}

//@Preview(showBackground = true)
//@Composable
//fun PreviewS(){
//    SelectorItem("Expense",true,modifier=Modifier,{})
//}


@Preview(showBackground = true)
@Composable
private fun Preview() {

    TransactionTypeSelector(true,{},{})

}