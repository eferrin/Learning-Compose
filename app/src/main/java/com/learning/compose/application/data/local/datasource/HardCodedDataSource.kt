package com.learning.compose.application.data.local.datasource

import com.learning.compose.application.data.local.entity.DeveloperEntity

class HardCodedDataSource {

    fun getDevelopers(): List<DeveloperEntity> {
        return listOf(
            DeveloperEntity("Agustin Ferrari", "Android", "Argentina"),
            DeveloperEntity("Andres Fabian Rangel Marino", "Android", "Colombia"),
            DeveloperEntity("Camilo Tellez Hidalgo", "iOS", "Colombia"),
            DeveloperEntity("Emiliano Mesa", "iOS", "Uruguay"),
            DeveloperEntity("Ezequiel Pedro Ferrín", "Android", "Argentina"),
            DeveloperEntity("Lucas Alejandro Kempe", "Android", "Argentina"),
        )
    }
}
