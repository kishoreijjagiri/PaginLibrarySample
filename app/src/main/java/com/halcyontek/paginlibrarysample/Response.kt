package com.halcyontek.paginlibrarysample
import com.google.gson.annotations.SerializedName

data class Response(   @SerializedName("articles") val news: List<News>)

data class News(@SerializedName("title") val title: String,@SerializedName("urlToImage") val urlToImage:String)