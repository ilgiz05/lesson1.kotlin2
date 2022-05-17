package com.ilgiz.domain.repositories

import com.ilgiz.domain.either.Either
import com.ilgiz.domain.models.PeopleModel
import kotlinx.coroutines.flow.Flow

interface PeopleRepository {
    fun fetchPeople(): Flow<Either<String, List< PeopleModel>>>
}