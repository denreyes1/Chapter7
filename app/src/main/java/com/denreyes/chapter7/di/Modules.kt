package com.denreyes.chapter7.di

import com.denreyes.chapter7.PetsViewModel
import com.denreyes.chapter7.data.CatsAPI
import com.denreyes.chapter7.data.PetsRepository
import com.denreyes.chapter7.data.PetsRepositoryImpl
import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import kotlinx.coroutines.Dispatchers
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.create

val appModules = module {
    single<PetsRepository> { PetsRepositoryImpl(get(), get()) }
    single { Dispatchers.IO }
    single { PetsViewModel(get()) }
    single {
        val contentType = "application/json".toMediaType()
        Retrofit.Builder()
            .addConverterFactory(Json { ignoreUnknownKeys = true }.asConverterFactory(contentType)) // Kotlinx serialization converter
            .baseUrl("https://cataas.com/api/")
            .build()
    }
    single { get<Retrofit>().create(CatsAPI::class.java) }
}