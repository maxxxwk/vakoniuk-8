package com.maxxxwk.catsfact

import com.google.gson.annotations.SerializedName

data class Status(
    val verified: Boolean,
    val sentCount: Int
)
data class Fact(
    val status: Status,
    @SerializedName("_id") val id: String,
    val user: String,
    val text: String,
    val deleted: Boolean,
    val used: Boolean
)
