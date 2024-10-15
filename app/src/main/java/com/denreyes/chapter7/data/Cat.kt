package com.denreyes.chapter7.data

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Cat(
    @SerialName("_id")
    val id: String,
    @SerialName("tags")
    val tags: List<String>,

//    @SerialName("owner")
//    val owner: String,
//    @SerialName("createdAt")
//    val createdAt: String,
//    @SerialName("updatedAt")
//    val updatedAt: String,

    @SerialName("mimetype")
    val mimeType: String,
    @SerialName("size")
    val size: Int,
)