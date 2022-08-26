package com.learning.compose.application.viewmodel

import androidx.compose.runtime.toMutableStateList
import androidx.lifecycle.ViewModel
import com.learning.compose.application.dataclass.Developer

class DevelopersViewModel : ViewModel() {

    private val _developers = getMeliComponentDevelopers().toMutableStateList()

    val developers: List<Developer>
        get() = _developers

    private fun getMeliComponentDevelopers(): List<Developer> {
        return listOf(
            Developer("Agustin Ferrari", "Android", "Argentina"),
            Developer("Andres Fabian Rangel Marino", "Android", "Colombia"),
            Developer("Camilo Tellez Hidalgo", "iOS", "Colombia"),
            Developer("Emiliano Mesa", "iOS", "Uruguay"),
            Developer("Ezequiel Pedro Ferrín", "Android", "Argentina"),
            Developer("Lucas Alejandro Kempe", "Android", "Argentina"),
        )
    }
}
