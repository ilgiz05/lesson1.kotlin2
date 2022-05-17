package com.ilgiz.data.remote.apiservices


import com.ilgiz.data.remote.dtos.PeopleModelDto
import retrofit2.http.GET

interface PeopleApiService {

    @GET("people")
    suspend fun fetchPeople(): List<PeopleModelDto>
}