package com.example.androiddevchallenge.data

import androidx.annotation.DrawableRes
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.runtime.mutableStateOf

data class Msg(
    val title: String,
    val detail: String,
    @DrawableRes val img: Int,
    val dog: Dog
) {
    var adoption: Boolean by mutableStateOf(false)
}