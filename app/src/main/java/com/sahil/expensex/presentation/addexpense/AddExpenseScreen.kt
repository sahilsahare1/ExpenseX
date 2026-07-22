package com.sahil.expensex.presentation.addexpense

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sahil.expensex.presentation.addexpense.components.AddExpenseHeader
import com.sahil.expensex.presentation.addexpense.components.TransactionTypeSelector


@Composable
fun AddExpenseScreen() {

    var isExpense by rememberSaveable() { mutableStateOf(true) }

    Column() {

        AddExpenseHeader()
        Spacer(modifier = Modifier.height(8.dp))
        TransactionTypeSelector(isExpense = isExpense, onExpenseClick = {isExpense=true}, onIncomeClick = { isExpense=false })

    }


}










@Preview(showBackground = true)
@Composable
private fun AddExpenseScreenPreview() {
    AddExpenseScreen()
}