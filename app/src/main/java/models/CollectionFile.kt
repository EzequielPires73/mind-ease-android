package models

import java.io.Serializable
class CollectionFile(
    val id: Int,
    val name: String,
    val path: String,
    val type: CollectionFileType
): Serializable

enum class CollectionFileType {
    audio,
    video
}