package com.sahil.expensex.presentation.home




import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Scaffold

import androidx.compose.runtime.Composable

import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.sahil.expensex.presentation.home.components.BalanceCard
import com.sahil.expensex.presentation.home.components.BottomNavigationBar
import com.sahil.expensex.presentation.home.components.ExpenseOverview

import com.sahil.expensex.presentation.home.components.HomeScreenHeader
import com.sahil.expensex.presentation.home.components.RecentTransaction


@Preview(showSystemUi = true)
@Composable

fun HomeScreen() {

    Scaffold(
        bottomBar = { BottomNavigationBar() },


    )  {
        innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(24.dp)
                .padding(innerPadding)
                .verticalScroll(rememberScrollState()),

            ) {

//        Text(
//            text = "Home Screen",
//            style = MaterialTheme.typography.headlineLarge
//        )

            HomeScreenHeader("Sahil")

            Spacer(modifier = Modifier.height(20.dp))

            BalanceCard("24,345.00","15.43%")

            Spacer(modifier = Modifier.height(20.dp))

            ExpenseOverview()

            RecentTransaction()





        }

    }

}