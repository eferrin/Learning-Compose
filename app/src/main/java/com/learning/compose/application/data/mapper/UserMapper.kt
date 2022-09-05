package com.learning.compose.application.data.mapper

import com.learning.compose.application.data.local.entity.DeveloperEntity
import com.learning.compose.application.domain.model.Developer

fun DeveloperEntity.toDeveloper(): Developer {
    return Developer(
        name = name,
        technology = technology,
        country = country
    )
}

fun List<DeveloperEntity>.toDevelopers(): List<Developer> {
    val developers: MutableList<Developer> = ArrayList()
    this.forEach {
        developers.add(it.toDeveloper())
    }
    return developers
}