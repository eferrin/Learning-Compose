package com.learning.compose.application.data.repository

import com.learning.compose.application.data.Result
import com.learning.compose.application.data.local.datasource.HardCodedDataSource
import com.learning.compose.application.data.mapper.toDevelopers
import com.learning.compose.application.domain.model.Developer
import com.learning.compose.application.domain.repository.DevelopersRepository
import javax.inject.Inject

class DevelopersRepositoryImpl @Inject constructor(private val dataSource: HardCodedDataSource) :
    DevelopersRepository {
    override fun getMeliComponentsDevelopers(): Result<List<Developer>> {
        return try {
            val developersEntity = dataSource.getDevelopers()
            Result.Success(developersEntity.toDevelopers())
        } catch (e: Exception) {
            Result.Error(message = e.message.orEmpty())
        }
    }
}
