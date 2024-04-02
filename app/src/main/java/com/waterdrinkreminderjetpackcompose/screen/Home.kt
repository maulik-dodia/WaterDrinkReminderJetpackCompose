package com.waterdrinkreminderjetpackcompose.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.waterdrinkreminderjetpackcompose.R
import com.waterdrinkreminderjetpackcompose.ui.theme.lightBlue
import com.waterdrinkreminderjetpackcompose.ui.theme.oceanBlue
import com.waterdrinkreminderjetpackcompose.ui.theme.oceanBlueFont

@Composable
fun Home() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
    ) {
        Column(
            modifier = Modifier
                .weight(0.7f)
                .padding(10.dp)
        ) {
            Row(
                modifier = Modifier
                    .weight(0.2f)
                    .fillMaxSize()
                    .clip(shape = RoundedCornerShape(30.dp))
                    .background(color = lightBlue)
                    .padding(16.dp)
            ) {
                Image(
                    painter = painterResource(id = R.drawable.profile_img),
                    contentDescription = stringResource(id = R.string.profile_img_small),
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .size(50.dp)
                        .clip(shape = RoundedCornerShape(10.dp))
                )
                Column(
                    verticalArrangement = Arrangement.Center,
                    modifier = Modifier
                        .height(50.dp)
                        .padding(start = 5.dp)
                ) {
                    Text(
                        text = stringResource(id = R.string.label_good_morning),
                        fontWeight = FontWeight.Light,
                        color = Color.Black
                    )
                    Text(
                        text = stringResource(id = R.string.user_name),
                        fontWeight = FontWeight.Bold,
                        color = Color.Black
                    )
                }
            }
            Spacer(modifier = Modifier.padding(10.dp))
            Column(
                verticalArrangement = Arrangement.SpaceAround,
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .weight(0.8f)
                    .fillMaxSize()
                    .clip(shape = RoundedCornerShape(30.dp))
                    .background(color = lightBlue)
                    .padding(16.dp)
            ) {
                Text(
                    text = "Today's Goal\nDrink 4000ml",
                    fontSize = 20.sp,
                    color = Color.Black
                )
                Text(
                    text = "2000/4000",
                    fontSize = 50.sp,
                    color = Color.Black
                )
                Row(
                    horizontalArrangement = Arrangement.SpaceAround,
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Button(onClick = { /*TODO*/ }) {
                        Text(text = stringResource(id = R.string.label_100_ml), fontSize = 14.sp)
                    }
                    Button(onClick = { /*TODO*/ }) {
                        Text(text = stringResource(id = R.string.label_200_ml), fontSize = 14.sp)
                    }
                    Button(onClick = { /*TODO*/ }) {
                        Text(text = stringResource(id = R.string.label_300_ml), fontSize = 14.sp)
                    }
                    /*Button(onClick = { *//*TODO*//* }) {
                    Text(text = stringResource(id = R.string.label_400_ml), fontSize = 14.sp)}*/
                }
            }
        }

        Column(
            modifier = Modifier
                .weight(0.4f)
                .fillMaxSize()
                .clip(shape = RoundedCornerShape(30.dp))
                .background(color = lightBlue)
                .padding(20.dp)
        ) {

            Text(
                text = stringResource(id = R.string.next_schedule),
                color = oceanBlue,
                fontWeight = FontWeight.Bold,
                modifier = Modifier.padding(bottom = 15.dp)
            )

            LazyColumn {
                items(13) {
                    NextScheduleItem(
                        switch = {
                            Switch(checked = false, onCheckedChange = {

                            })
                        }
                    )
                }
            }
        }
    }
}

@Composable
fun NextScheduleItem(
    img: (@Composable () -> Unit)? = null,
    switch: (@Composable () -> Unit)? = null
) {
    Card(modifier = Modifier.padding(bottom = 5.dp)) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .background(color = Color.White)
                .padding(15.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            img?.let {
                it()
            }
            switch?.let {
                it()
            }
            Column {
                Text(
                    text = stringResource(id = R.string.label_2_pm),
                    fontWeight = FontWeight.Bold,
                    color = oceanBlueFont
                )
                Text(
                    text = stringResource(id = R.string.label_200_ml),
                    fontWeight = FontWeight.Bold,
                    color = oceanBlueFont
                )
            }
            Image(
                modifier = Modifier.size(40.dp),
                painter = painterResource(id = R.drawable.ic_more_options),
                contentDescription = stringResource(id = R.string.more_options)
            )
        }
    }
}