package models

import java.io.Serializable

class Subcategory (
    val id: Int,
    val name: String,
    val image: String?,
    val collections: List<Collection>?
) : Serializable
