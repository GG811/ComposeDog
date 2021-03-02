package com.example.androiddevchallenge.data

import androidx.annotation.DrawableRes

data class Dog(
    val id: String,
    val name: String,
    val age: Float,
    @DrawableRes val avatar: Int
)