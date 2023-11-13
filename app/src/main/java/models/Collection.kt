package models

import java.io.Serializable

class Collection (
    val id: Int,
    val name: String,
    val image: String?,
): Serializable