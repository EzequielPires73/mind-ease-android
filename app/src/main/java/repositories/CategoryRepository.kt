package repositories

import models.Category
import models.Collection
import models.CollectionFile
import models.CollectionFileType
import models.Subcategory

class CategoryRepository {
    val categories = listOf<Category>(
        Category(
            1,
            "Destaques",
            null,
            listOf<Subcategory>(
                Subcategory(
                    1,
                    "Diminuir o Stress",
                    "destaque01",
                    listOf<Collection>(
                        Collection(1, "Collection Diminuir o Stress 1", null, listOf<CollectionFile>(
                            CollectionFile(1, "Audio 1", "file", CollectionFileType.audio),
                            CollectionFile(2, "Audio 2", "file", CollectionFileType.audio),
                            CollectionFile(3, "Video 1", "file", CollectionFileType.video),
                        )),
                        Collection(2, "Collection Diminuir o Stress 2", null, null),
                        Collection(3, "Collection Diminuir o Stress 3", null, null),
                        Collection(4, "Collection Diminuir o Stress 4", null, null),
                        Collection(5, "Collection Diminuir o Stress 5", null, null),
                        Collection(6, "Collection Diminuir o Stress 6", null, null),
                    )
                ),
                Subcategory(
                    2,
                    "Controlar a Ansiedade",
                    "destaque02",
                    listOf<Collection>(
                        Collection(1, "Collection com um nome grande 1", null, null),
                        Collection(2, "Collection com um nome grande 2", null, null),
                        Collection(3, "Collection com um nome grande 3", null, null),
                        Collection(4, "Collection com um nome grande 4", null, null),
                        Collection(5, "Collection com um nome grande 5", null, null),
                        Collection(6, "Collection com um nome grande 6", null, null),
                    )
                ),
                Subcategory(
                    3,
                    "Ter uma Vida Equilibrada",
                    "destaque03",
                    listOf<Collection>(
                        Collection(1, "Collection com um nome grande 1", null, null),
                        Collection(2, "Collection com um nome grande 2", null, null),
                        Collection(3, "Collection com um nome grande 3", null, null),
                        Collection(4, "Collection com um nome grande 4", null, null),
                        Collection(5, "Collection com um nome grande 5", null, null),
                        Collection(6, "Collection com um nome grande 6", null, null),
                    )
                ),
                Subcategory(
                    4,
                    "Dormir melhor",
                    "destaque04",
                    listOf<Collection>(
                        Collection(1, "Collection com um nome grande 1", null, null),
                        Collection(2, "Collection com um nome grande 2", null, null),
                        Collection(3, "Collection com um nome grande 3", null, null),
                        Collection(4, "Collection com um nome grande 4", null, null),
                        Collection(5, "Collection com um nome grande 5", null, null),
                        Collection(6, "Collection com um nome grande 6", null, null),
                    )
                ),
                Subcategory(
                    5,
                    "Amar e perdoar",
                    "destaque05",
                    listOf<Collection>(
                        Collection(1, "Collection com um nome grande 1", null, null),
                        Collection(2, "Collection com um nome grande 2", null, null),
                        Collection(3, "Collection com um nome grande 3", null, null),
                        Collection(4, "Collection com um nome grande 4", null, null),
                        Collection(5, "Collection com um nome grande 5", null, null),
                        Collection(6, "Collection com um nome grande 6", null, null),
                    )
                ),
                Subcategory(
                    6,
                    "Meditação para crianças",
                    "destaque06",
                    listOf<Collection>(
                        Collection(1, "Collection com um nome grande 1", null, null),
                        Collection(2, "Collection com um nome grande 2", null, null),
                        Collection(3, "Collection com um nome grande 3", null, null),
                        Collection(4, "Collection com um nome grande 4", null, null),
                        Collection(5, "Collection com um nome grande 5", null, null),
                        Collection(6, "Collection com um nome grande 6", null, null),
                    )
                ),
            )
        ),
        Category(
            2,
            "Técnicas de respiração",
            null,
            listOf<Subcategory>(
                Subcategory(
                    1, "Respiração profunda guiada", "respiracao01", listOf<Collection>(
                        Collection(1, "Collection com um nome grande 1", null, null),
                        Collection(2, "Collection com um nome grande 2", null, null),
                        Collection(3, "Collection com um nome grande 3", null, null),
                        Collection(4, "Collection com um nome grande 4", null, null),
                        Collection(5, "Collection com um nome grande 5", null, null),
                        Collection(6, "Collection com um nome grande 6", null, null),
                    )
                ),
            )
        ),
        Category(
            3,
            "Sons para dormir",
            null,
            listOf(
                Subcategory(
                    1, "Chuva", "sons01", listOf<Collection>(
                        Collection(1, "Collection com um nome grande 1", null, null),
                        Collection(2, "Collection com um nome grande 2", null, null),
                        Collection(3, "Collection com um nome grande 3", null, null),
                        Collection(4, "Collection com um nome grande 4", null, null),
                        Collection(5, "Collection com um nome grande 5", null, null),
                        Collection(6, "Collection com um nome grande 6", null, null),
                    )
                ),
                Subcategory(
                    1, "Oceano", "sons02", listOf<Collection>(
                        Collection(1, "Collection com um nome grande 1", null, null),
                        Collection(2, "Collection com um nome grande 2", null, null),
                        Collection(3, "Collection com um nome grande 3", null, null),
                        Collection(4, "Collection com um nome grande 4", null, null),
                        Collection(5, "Collection com um nome grande 5", null, null),
                        Collection(6, "Collection com um nome grande 6", null, null),
                    )
                ),
                Subcategory(
                    1, "Animais", "sons03", listOf<Collection>(
                        Collection(1, "Collection com um nome grande 1", null, null),
                        Collection(2, "Collection com um nome grande 2", null, null),
                        Collection(3, "Collection com um nome grande 3", null, null),
                        Collection(4, "Collection com um nome grande 4", null, null),
                        Collection(5, "Collection com um nome grande 5", null, null),
                        Collection(6, "Collection com um nome grande 6", null, null),
                    )
                ),
                Subcategory(
                    1, "Floresta", "sons04", listOf<Collection>(
                        Collection(1, "Collection com um nome grande 1", null, null),
                        Collection(2, "Collection com um nome grande 2", null, null),
                        Collection(3, "Collection com um nome grande 3", null, null),
                        Collection(4, "Collection com um nome grande 4", null, null),
                        Collection(5, "Collection com um nome grande 5", null, null),
                        Collection(6, "Collection com um nome grande 6", null, null),
                    )
                ),
            )
        ),
        Category(
            4,
            "Técnicas de mindfulness",
            null,
            listOf<Subcategory>(
                Subcategory(
                    1, "Sessão mindfulness guiada", "mindfulness", listOf<Collection>(
                        Collection(1, "Collection com um nome grande 1", null, null),
                        Collection(2, "Collection com um nome grande 2", null, null),
                        Collection(3, "Collection com um nome grande 3", null, null),
                        Collection(4, "Collection com um nome grande 4", null, null),
                        Collection(5, "Collection com um nome grande 5", null, null),
                        Collection(6, "Collection com um nome grande 6", null, null),
                    )
                ),
            )
        ),
    )
}