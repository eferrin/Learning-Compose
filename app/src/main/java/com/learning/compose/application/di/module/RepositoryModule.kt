package com.learning.compose.application.di.module

import com.learning.compose.application.data.repository.DevelopersRepositoryImpl
import com.learning.compose.application.domain.repository.DevelopersRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    abstract fun bindDevelopersRepository(impl: DevelopersRepositoryImpl): DevelopersRepository
}
