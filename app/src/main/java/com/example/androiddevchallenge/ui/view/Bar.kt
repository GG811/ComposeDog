package com.example.androiddevchallenge.ui.view

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.androiddevchallenge.R

@Composable
fun Bar(title: String, onBack: (() -> Unit)? = null) {
    Box(
        Modifier
            .height(48.dp)
            .fillMaxWidth()
            .background(Color(0xFF477C7C))
    ) {
        if (onBack != null) {
            Icon(
                painterResource(R.drawable.ic_back),
                null,
                Modifier
                    .clickable(onClick = onBack)
                    .size(36.dp)
                    .padding(8.dp),
            )
        }

        Text(title, Modifier.align(Alignment.Center),color = Color.White)
    }
}