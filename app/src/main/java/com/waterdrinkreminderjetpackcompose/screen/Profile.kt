package com.waterdrinkreminderjetpackcompose.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.waterdrinkreminderjetpackcompose.R

@Composable
fun ProfileScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
            .padding(16.dp)
    ) {
        Column(
            modifier = Modifier
                .weight(1f),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.profile_img),
                contentDescription = stringResource(id = R.string.profile_img),
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(140.dp)
                    .clip(shape = CircleShape),
            )
            Text(
                text = stringResource(id = R.string.user_name),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 10.dp),
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )
            Text(
                text = stringResource(id = R.string.user_email),
                modifier = Modifier.fillMaxWidth(),
                textAlign = TextAlign.Center,
                fontWeight = FontWeight.Light,
                color = Color.Black
            )
        }
        Column(
            modifier = Modifier
                .padding(top = 20.dp)
                .weight(2f),
            horizontalAlignment = Alignment.Start
        ) {
            Text(
                text = stringResource(id = R.string.label_profile_details),
                textAlign = TextAlign.Start,
                fontWeight = FontWeight.Bold,
                color = Color.Blue,
                modifier = Modifier.padding(
                    top = 10.dp,
                    bottom = 10.dp
                )
            )
            Row(
                horizontalArrangement = Arrangement.Absolute.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        start = 16.dp,
                        top = 5.dp
                    )
            ) {
                Text(
                    textAlign = TextAlign.Start,
                    text = stringResource(id = R.string.label_gender),
                    color = Color.Black
                )
                var genderState by remember {
                    mutableStateOf("")
                }
                TextField(modifier = Modifier.width(140.dp),
                    placeholder = {
                        Text(
                            text = stringResource(id = R.string.label_gender)
                        )
                    },
                    value = genderState, onValueChange = {
                        genderState = it
                    },
                    keyboardOptions = KeyboardOptions(imeAction = ImeAction.Next),
                    keyboardActions = KeyboardActions(
                        onNext = {

                        }
                    )
                )
            }
            Row(
                horizontalArrangement = Arrangement.Absolute.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        start = 16.dp,
                        top = 5.dp
                    )
            ) {
                Text(
                    textAlign = TextAlign.Start,
                    text = stringResource(id = R.string.label_weight),
                    color = Color.Black
                )
                var weightState by remember {
                    mutableStateOf("")
                }
                TextField(modifier = Modifier.width(140.dp),
                    placeholder = {
                        Text(
                            text = stringResource(id = R.string.label_weight)
                        )
                    },
                    value = weightState, onValueChange = {
                        weightState = it
                    },
                    keyboardOptions = KeyboardOptions(imeAction = ImeAction.Next),
                    keyboardActions = KeyboardActions(
                        onNext = {

                        }
                    ))
            }
            Row(
                horizontalArrangement = Arrangement.Absolute.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        start = 16.dp,
                        top = 5.dp
                    )
            ) {
                Text(
                    textAlign = TextAlign.Start,
                    text = stringResource(id = R.string.label_height),
                    color = Color.Black
                )
                var heightState by remember {
                    mutableStateOf("")
                }
                TextField(modifier = Modifier.width(140.dp),
                    placeholder = {
                        Text(
                            text = stringResource(id = R.string.label_height)
                        )
                    },
                    value = heightState, onValueChange = {
                        heightState = it
                    },
                    keyboardOptions = KeyboardOptions(imeAction = ImeAction.Next),
                    keyboardActions = KeyboardActions(
                        onNext = {

                        }
                    ))
            }
            Row(
                horizontalArrangement = Arrangement.Absolute.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        start = 16.dp,
                        top = 5.dp
                    )
            ) {
                Text(
                    textAlign = TextAlign.Start,
                    text = stringResource(id = R.string.label_wake_up_time),
                    color = Color.Black
                )
                var wakeUpTimeState by remember {
                    mutableStateOf("")
                }
                TextField(modifier = Modifier.width(140.dp),
                    placeholder = {
                        Text(
                            text = stringResource(id = R.string.label_wake_up_time)
                        )
                    },
                    value = wakeUpTimeState, onValueChange = {
                        wakeUpTimeState = it
                    },
                    keyboardOptions = KeyboardOptions(imeAction = ImeAction.Next),
                    keyboardActions = KeyboardActions(
                        onNext = {

                        }
                    ))
            }
            Row(
                horizontalArrangement = Arrangement.Absolute.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        start = 16.dp,
                        top = 5.dp
                    )
            ) {
                Text(
                    textAlign = TextAlign.Start,
                    text = stringResource(id = R.string.label_bed_time),
                    color = Color.Black
                )
                var bedTimeState by remember {
                    mutableStateOf("")
                }
                TextField(modifier = Modifier.width(140.dp),
                    placeholder = {
                        Text(
                            text = stringResource(id = R.string.label_bed_time)
                        )
                    },
                    value = bedTimeState, onValueChange = {
                        bedTimeState = it
                    },
                    keyboardOptions = KeyboardOptions(imeAction = ImeAction.Next),
                    keyboardActions = KeyboardActions(
                        onNext = {

                        }
                    ))
            }
            Row(
                horizontalArrangement = Arrangement.Absolute.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(
                        start = 16.dp,
                        top = 5.dp
                    )
            ) {
                Text(
                    textAlign = TextAlign.Start,
                    text = stringResource(id = R.string.label_goal),
                    color = Color.Black
                )
                var goalState by remember {
                    mutableStateOf("")
                }
                TextField(modifier = Modifier.width(140.dp),
                    placeholder = {
                        Text(
                            text = stringResource(id = R.string.label_goal)
                        )
                    },
                    value = goalState, onValueChange = {
                        goalState = it
                    },
                    keyboardOptions = KeyboardOptions(imeAction = ImeAction.Done),
                    keyboardActions = KeyboardActions(
                        onDone = {

                        }
                    ))
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun Preview() {
    ProfileScreen()
}