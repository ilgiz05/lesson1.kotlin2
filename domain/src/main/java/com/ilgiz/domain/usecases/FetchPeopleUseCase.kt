package com.ilgiz.domain.usecases

import com.ilgiz.domain.repositories.PeopleRepository
import javax.inject.Inject

class FetchPeopleUseCase @Inject constructor(
    private val repository: PeopleRepository
) {
    operator fun invoke() = repository.fetchPeople()
}