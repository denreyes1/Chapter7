package com.denreyes.chapter7.data

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface CatsAPI {
    @GET("cats")
    suspend fun fetchCats(
        @Query("tags") tag: String,
    ): Response<List<Cat>>
}