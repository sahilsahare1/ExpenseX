package com.sahil.expensex.presentation.home




import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding

import androidx.compose.runtime.Composable

import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sahil.expensex.presentation.home.components.BalanceCard
import com.sahil.expensex.presentation.home.components.ExpenseOverview

import com.sahil.expensex.presentation.home.components.HomeScreenHeader

@Preview(showSystemUi = true)
@Composable
fun HomeScreen() {

    Column(
        modifier = Modifier.fillMaxSize().padding(24.dp),

    ) {

//        Text(
//            text = "Home Screen",
//            style = MaterialTheme.typography.headlineLarge
//        )

        HomeScreenHeader("Sahil")

        Spacer(modifier = Modifier.height(20.dp))

        BalanceCard("24,345.00","15.43%")



    }

}