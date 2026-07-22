package com.sahil.expensex.presentation.addexpense

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.tooling.preview.Preview
import com.sahil.expensex.presentation.addexpense.components.TransactionTypeSelector


@Composable
fun AddExpenseScreen() {

    var isExpense by rememberSaveable() { mutableStateOf(true) }

    Column() {

        TransactionTypeSelector(isExpense = isExpense, onExpenseClick = {isExpense=true}, onIncomeClick = { isExpense=false })

    }


}










@Preview(showBackground = true)
@Composable
private fun AddExpenseScreenPreview() {
    AddExpenseScreen()
}