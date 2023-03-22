package com.example.data.remote.apiservices.manga

import com.example.data.dtos.anime.DataItemDto
import com.example.data.dtos.anime.MangaResponseDto
import retrofit2.http.GET

interface MangaApiService {

    @GET("manga")
    suspend fun fetchManga(
    ): MangaResponseDto<DataItemDto>
}