package com.sahil.expensex.presentation.auth.components.textfields


import android.graphics.drawable.Icon
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import androidx.compose.ui.unit.dp
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.IconButton
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation


@Composable
fun PasswordTextField(
    value: String,
    onValueChange: (String) -> Unit,
    label: String

) {

    var visiblePassword by remember(){ mutableStateOf(false) }



    OutlinedTextField(
        value = value,
        onValueChange = onValueChange,
        modifier = Modifier.fillMaxWidth(),
        label = {
            Text(text=label)
        },
        singleLine = true,
        shape = RoundedCornerShape(16.dp),
        colors = OutlinedTextFieldDefaults.colors(),

        visualTransformation = if(visiblePassword) VisualTransformation.None else PasswordVisualTransformation(),

        trailingIcon = {
            IconButton(
                onClick = {visiblePassword= !visiblePassword}
            ) {
                Icon(
                    imageVector = if(visiblePassword) Icons.Default.VisibilityOff else Icons.Default.Visibility ,
                    contentDescription = null
                )
            }

        }





    )

}