package com.example.compose.middleexam.data

import androidx.compose.ui.graphics.Color
import com.example.compose.middleexam.R.drawable.*

data class News(
    val id: Int,
    val name: String,
    val views: Int,
    val cover: Int,
    val details: String,
    val color: Color
)

data class Novel(
    val id: Int,
    val name: String,
    val amount: Int,
    val cover: Int,
    val details: String,
    val color: Color
)

object UserData {
    val new : MutableList<News> = mutableListOf(
        News(
            1,
            "123",
            999,
            inside,
            "123",
            Color(0xFF39c5aa)
        ),
        News(
            2,
            "填新闻名称",
            999,
            填图片名称,
            "",
            Color(0xFF39c5aa)
        )
    )
    val novel : MutableList<Novel> = mutableListOf(
        Novel(
            1,
            "填小说名称",
            100,
            填图片名称,
            "填小说简介",
            Color(0xFF39c5aa)
        ),
        Novel(
            2,
            "123",
            99999,
            sensei,
            "123",
            Color(0xFF39c5aa)
        )
    )
}

