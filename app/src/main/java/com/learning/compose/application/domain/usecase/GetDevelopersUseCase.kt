package com.learning.compose.application.domain.usecase

import com.learning.compose.application.data.Result
import com.learning.compose.application.domain.model.Developer
import com.learning.compose.application.domain.repository.DevelopersRepository
import javax.inject.Inject

class GetDevelopersUseCase @Inject constructor(
    private val developersRepository: DevelopersRepository,
) {

    operator fun invoke(): Result<List<Developer>> {
        return developersRepository.getMeliComponentsDevelopers()
    }
}
