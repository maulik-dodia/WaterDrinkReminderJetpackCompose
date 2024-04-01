package com.waterdrinkreminderjetpackcompose.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.Role.Companion.Image
import androidx.compose.ui.unit.dp
import com.waterdrinkreminderjetpackcompose.R

@Composable
fun History() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(10.dp)
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Center
        ) {
            val selectedValue = remember {
                mutableStateOf("Week")
            }
            RadioButton(selected = selectedValue.value == stringResource(id = R.string.label_week), onClick = {
                selectedValue.value = "Week"
            })
            Text(text = stringResource(id = R.string.label_week))
            RadioButton(selected = selectedValue.value == stringResource(id = R.string.label_Month), onClick = {
                selectedValue.value = "Month"
            })
            Text(text = stringResource(id = R.string.label_Month))
        }
        LazyColumn {
            items(13) {
                NextScheduleItem(
                    img = {
                        Image(
                            modifier = Modifier.size(40.dp),
                            painter = painterResource(id = R.drawable.ic_water_drank),
                            contentDescription = stringResource(id = R.string.more_options)
                        )
                    }
                )
            }
        }
    }
}