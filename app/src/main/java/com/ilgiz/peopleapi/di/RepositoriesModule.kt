package com.ilgiz.peopleapi.di

import com.ilgiz.data.repositories.PeopleRepositoryImpl
import com.ilgiz.domain.repositories.PeopleRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoriesModule {

    @Binds
    abstract fun providePeopleRepository(repository: PeopleRepositoryImpl): PeopleRepository
}