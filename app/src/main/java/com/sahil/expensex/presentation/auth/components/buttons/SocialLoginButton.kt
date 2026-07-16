package com.sahil.expensex.presentation.auth.components.buttons

import androidx.annotation.DrawableRes
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.core.R
import com.sahil.expensex.ui.theme.Primary


@Composable
fun SocialLoginButton (
    name: String,
    @DrawableRes icon: Int,
    onClick: ()-> Unit

) {

    Button(
        onClick = onClick,
        modifier= Modifier.fillMaxWidth().height(56.dp),
        shape = RoundedCornerShape(16.dp),
        border = BorderStroke(1.dp, MaterialTheme.colorScheme.outline),
//        colors = ButtonDefaults.buttonColors(containerColor = MaterialTheme.colorScheme.surface)



    ) {
        Icon(
            painter = painterResource(icon),
            contentDescription = "Icon",
            modifier=Modifier.size(22.dp)

        )

        Spacer(modifier = Modifier.width(12.dp))

        Text(
            text=name,
            style= MaterialTheme.typography.bodyMedium
        )

    }

}