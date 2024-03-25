package com.waterdrinkreminderjetpackcompose.screen

import android.annotation.SuppressLint
import android.net.wifi.hotspot2.pps.HomeSp
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.waterdrinkreminderjetpackcompose.R

@Composable
fun Home() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        Row(modifier = Modifier
            .weight(0.1f)
            .background(color = Color.Gray)){
            Image(
                painter = painterResource(id = R.drawable.profile_img),
                contentDescription = stringResource(id = R.string.profile_img_small),
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(50.dp)
                    .clip(shape = RoundedCornerShape(10.dp)))
            Column(verticalArrangement = Arrangement.Center
                ,modifier = Modifier
                    .height(50.dp)
                    .padding(start = 5.dp)) {
                Text(
                    text = stringResource(id = R.string.label_good_morning),
                    fontWeight = FontWeight.Light
                )
                Text(
                    text = stringResource(id = R.string.user_name),
                    fontWeight = FontWeight.Bold
                )
            }
        }
        Column(modifier = Modifier
            .weight(0.5f)
            .background(color = Color.Green)) {
            Text(text = "Maulik")
        }
        Column(modifier = Modifier
            .weight(0.5f)
            .background(color = Color.Green)) {
            Text(text = "Maulik")
        }
    }
}