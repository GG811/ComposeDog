package com.example.androiddevchallenge.ui.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.example.androiddevchallenge.DogViewModel
import com.example.androiddevchallenge.data.Msg

@Composable
fun DogDetail(navController: NavController, index: Int) {
    val viewModel: DogViewModel = viewModel()
    Column(
        Modifier
            .fillMaxSize()
    ) {
        Bar("领养详情")
        Body(viewModel.messageList[index])
    }
}


@Composable
fun Body(msg: Msg) {

    val image: ImageBitmap = ImageBitmap.Companion.imageResource(msg.img)
    MaterialTheme {
        val typography = MaterialTheme.typography
        Column(
            modifier = Modifier.padding(16.dp)
        ) {
            val imageModifier = Modifier
                .height(180.dp)
                .fillMaxWidth()
                .clip(shape = RoundedCornerShape(4.dp))
            Image(image, "", modifier = imageModifier, contentScale = ContentScale.Crop)
            Spacer(Modifier.height(10.dp))
            Text(
                msg.title,
                style = typography.h6,
                maxLines = 2,
                overflow = TextOverflow.Ellipsis
            )
            Text("年龄：${msg.dog.age}", style = typography.body2)
            Text(msg.detail, style = typography.body2)
        }
    }
}