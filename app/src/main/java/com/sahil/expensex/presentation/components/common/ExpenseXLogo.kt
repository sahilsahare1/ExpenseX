package com.sahil.expensex.presentation.components.common

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sahil.expensex.R
@Preview(showSystemUi = true)
@Composable
fun ExpenseXLogo(modifier: Modifier = Modifier) {

    Image(
        painter = painterResource(id = R.drawable.expensexlogo),
        contentDescription = "Logo",
        modifier=modifier.padding(top =72.dp).size(100.dp)
    )

}