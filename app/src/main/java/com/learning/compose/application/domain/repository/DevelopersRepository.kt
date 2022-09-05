package com.learning.compose.application.domain.repository

import com.learning.compose.application.data.Result
import com.learning.compose.application.domain.model.Developer

interface DevelopersRepository {
    fun getMeliComponentsDevelopers(): Result<List<Developer>>
}
