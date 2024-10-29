package com.denreyes.chapter7.data

import okhttp3.ResponseBody
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface CatsAPI {
    @GET("cats")
    suspend fun fetchCats(
        @Query("tags") tag: String,
    ): Response<List<Cat>>

    @GET("cats")
    suspend fun fetchCatsGeneric(
        @Query("tags") tag: String,
    ): Response<ResponseBody>
}