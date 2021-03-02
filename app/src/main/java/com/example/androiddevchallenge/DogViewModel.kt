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
package com.example.androiddevchallenge

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel
import com.example.androiddevchallenge.data.Dog
import com.example.androiddevchallenge.data.Msg

class DogViewModel : ViewModel() {

    var messageList by mutableStateOf(
        listOf(
            Msg(
                "贵宾犬",
                "选购贵宾幼犬是很多铲屎官养宠的选择，如此一来既可以陪伴宠物狗狗成长，又可以根据自己的喜好来选购贵宾幼犬，但不正规渠道选购贵宾幼犬很可能会买到不健康的“星期狗”，给自己添麻烦，因此 选购贵宾幼犬要注意很多问题。下面盘点一下选购贵宾幼犬需要注意哪几个问题。",
                R.drawable.av1,
                Dog("1", "小斌", 2f, R.drawable.av1)
            ),
            Msg(
                "蝴蝶犬",
                "蝴蝶犬由于独特的蝴蝶式耳朵而闻名，吸引了很多的宠友想要去饲养它，拥有它。尤其是生活在大都市的女性白领，对蝴蝶犬特别的情有独钟，而蝴蝶犬的价钱也会随着它的品种和血统有着不同的差别",
                R.drawable.av2,
                Dog("2", "小蝶", 1.5f, R.drawable.av2)
            ),
            Msg(
                "泰迪犬",
                "很多宠物狗被拿到室外环境后会因为免疫力低而感染病毒性疾病，而这类疾病对宠物狗来说致死率并不低，因此 主人在挑选宠物狗的时候就要注意了。",
                R.drawable.av3,
                Dog("3", "小迪", 1f, R.drawable.av3)
            ),
            Msg(
                "苏格兰牧羊犬",
                "苏格兰牧羊犬是来自于苏格兰低地的一种大型犬类，因为长相出众，又有“犬中明星”的美誉，性格沉稳又透着活泼俏皮，非常的善解人意，所以受到主人的喜爱，是一种非常适合于陪伴生活的伴侣犬。随着人们生活水平的不断发展，很多时候，人们都会选择养一只宠物狗作为生活中的陪伴，而苏格兰牧羊犬深受人们的青睐。",
                R.drawable.av4,
                Dog("4", "小苏", 1.2f, R.drawable.av4)
            ),
            Msg(
                "比熊犬",
                "贵宾犬分为九种颜色：白色，黑色，米色，香槟色，巧克力，棕色，灰色，棕色和红色。其中，灰色贵宾犬是最贵的，好的可以卖到几万，其次是巧克力，红色和香槟，价格从1000到5000多元，白色和黑色则相对便宜。",
                R.drawable.av5,
                Dog("5", "小比", 1.6f, R.drawable.av5)
            ),
            Msg(
                "贵宾犬",
                "选购贵宾幼犬是很多铲屎官养宠的选择，如此一来既可以陪伴宠物狗狗成长，又可以根据自己的喜好来选购贵宾幼犬，但不正规渠道选购贵宾幼犬很可能会买到不健康的“星期狗”，给自己添麻烦，因此 选购贵宾幼犬要注意很多问题。下面盘点一下选购贵宾幼犬需要注意哪几个问题。",
                R.drawable.av1,
                Dog("1", "小斌", 2f, R.drawable.av1)
            ),
        )
    )
}