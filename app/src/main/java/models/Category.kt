package models

data class Category(
    val id: Int,
    val name: String,
    val image: String?,
    val subcategories: List<Subcategory>?
)
