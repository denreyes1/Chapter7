package com.denreyes.chapter7.data

interface PetsRepository {
    suspend fun getPets(): NetworkResult<List<Cat>>
}