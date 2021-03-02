/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge.ui.view

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.compose.navigate
import com.example.androiddevchallenge.DogViewModel
import com.example.androiddevchallenge.data.Msg

@Composable
fun DogList(navController: NavController) {
    val viewModel: DogViewModel = viewModel()
    Column(
        Modifier
            .fillMaxSize()
    ) {
        Bar("领养列表")
        DogList(viewModel.messageList, navController)
    }
}

@Composable
fun DogList(list: List<Msg>, navController: NavController) {
    LazyColumn(Modifier.fillMaxWidth()) {
        itemsIndexed(list) { index, msg ->
            DogItem(msg, Modifier.clickable {
                navController.navigate("detail/$index")
            })
        }
    }
}

@Composable
fun DogItem(meg: Msg, modifier: Modifier) {
    Row(
        modifier
            .padding(top = 10.dp, start = 20.dp, end = 20.dp, bottom = 10.dp)
    ) {
        Card(
            Modifier
                .height(80.dp)
                .fillMaxWidth(), shape = RoundedCornerShape(6.dp)
        ) {
            Row(verticalAlignment = Alignment.CenterVertically) {
                Image(
                    ImageBitmap.Companion.imageResource(meg.dog.avatar), "", modifier = Modifier
                        .fillMaxHeight()
                        .width(80.dp), contentScale = ContentScale.Crop
                )
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(10.dp)
                ) {
                    Text(meg.title)
                    Text(
                        meg.detail,
                        color = Color.Gray,
                        fontSize = 12.sp,
                        maxLines = 2,
                        overflow = TextOverflow.Ellipsis,
                        modifier = Modifier.padding(top = 3.dp)
                    )
                }
            }
        }
    }

}
