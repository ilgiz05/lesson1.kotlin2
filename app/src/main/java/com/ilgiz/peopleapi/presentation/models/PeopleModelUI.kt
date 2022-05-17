package com.ilgiz.peopleapi.presentation.models

import com.ilgiz.peopleapi.presentation.base.BaseDiffUtilModel
import com.ilgiz.domain.models.PeopleModel


data class PeopleModelUI(
    override val id: String,
    val name: String,
    val gender: String?,
    val age: String,
    val eye_color: String,
    val hair_color: String,
    val films: List<String>,
    val species: String,
    val url: String
) : BaseDiffUtilModel

fun PeopleModel.toUI() =
    PeopleModelUI(id, name, gender, age, eye_color, hair_color, films, species, url)