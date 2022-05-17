package com.ilgiz.data.repositories

import com.ilgiz.data.repositories.base.BaseRepository
import com.ilgiz.data.remote.dtos.toDomain
import com.ilgiz.data.remote.apiservices.PeopleApiService
import com.ilgiz.domain.repositories.PeopleRepository
import javax.inject.Inject

class PeopleRepositoryImpl @Inject constructor(
    private val service: PeopleApiService
) : BaseRepository(), PeopleRepository {
    override fun fetchPeople() = doRequest {
        service.fetchPeople().map { it.toDomain() }
    }
}