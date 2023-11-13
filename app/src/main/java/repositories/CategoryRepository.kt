package repositories

import models.Category
import models.Collection
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
                        Collection(1, "Collection com um nome grande 1", ""),
                        Collection(2, "Collection com um nome grande 2", ""),
                        Collection(3, "Collection com um nome grande 3", ""),
                        Collection(4, "Collection com um nome grande 4", ""),
                        Collection(5, "Collection com um nome grande 5", ""),
                        Collection(6, "Collection com um nome grande 6", ""),
                    )
                ),
                Subcategory(
                    2,
                    "Controlar a Ansiedade",
                    "destaque02",
                    listOf<Collection>(
                        Collection(1, "Collection com um nome grande 1", ""),
                        Collection(2, "Collection com um nome grande 2", ""),
                        Collection(3, "Collection com um nome grande 3", ""),
                        Collection(4, "Collection com um nome grande 4", ""),
                        Collection(5, "Collection com um nome grande 5", ""),
                        Collection(6, "Collection com um nome grande 6", ""),
                    )
                ),
                Subcategory(
                    3,
                    "Ter uma Vida Equilibrada",
                    "destaque03",
                    listOf<Collection>(
                        Collection(1, "Collection com um nome grande 1", ""),
                        Collection(2, "Collection com um nome grande 2", ""),
                        Collection(3, "Collection com um nome grande 3", ""),
                        Collection(4, "Collection com um nome grande 4", ""),
                        Collection(5, "Collection com um nome grande 5", ""),
                        Collection(6, "Collection com um nome grande 6", ""),
                    )
                ),
                Subcategory(
                    4,
                    "Dormir melhor",
                    "destaque04",
                    listOf<Collection>(
                        Collection(1, "Collection com um nome grande 1", ""),
                        Collection(2, "Collection com um nome grande 2", ""),
                        Collection(3, "Collection com um nome grande 3", ""),
                        Collection(4, "Collection com um nome grande 4", ""),
                        Collection(5, "Collection com um nome grande 5", ""),
                        Collection(6, "Collection com um nome grande 6", ""),
                    )
                ),
                Subcategory(
                    5,
                    "Amar e perdoar",
                    "destaque05",
                    listOf<Collection>(
                        Collection(1, "Collection com um nome grande 1", ""),
                        Collection(2, "Collection com um nome grande 2", ""),
                        Collection(3, "Collection com um nome grande 3", ""),
                        Collection(4, "Collection com um nome grande 4", ""),
                        Collection(5, "Collection com um nome grande 5", ""),
                        Collection(6, "Collection com um nome grande 6", ""),
                    )
                ),
                Subcategory(
                    6,
                    "Meditação para crianças",
                    "destaque06",
                    listOf<Collection>(
                        Collection(1, "Collection com um nome grande 1", ""),
                        Collection(2, "Collection com um nome grande 2", ""),
                        Collection(3, "Collection com um nome grande 3", ""),
                        Collection(4, "Collection com um nome grande 4", ""),
                        Collection(5, "Collection com um nome grande 5", ""),
                        Collection(6, "Collection com um nome grande 6", ""),
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
                        Collection(1, "Collection com um nome grande 1", ""),
                        Collection(2, "Collection com um nome grande 2", ""),
                        Collection(3, "Collection com um nome grande 3", ""),
                        Collection(4, "Collection com um nome grande 4", ""),
                        Collection(5, "Collection com um nome grande 5", ""),
                        Collection(6, "Collection com um nome grande 6", ""),
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
                        Collection(1, "Collection com um nome grande 1", ""),
                        Collection(2, "Collection com um nome grande 2", ""),
                        Collection(3, "Collection com um nome grande 3", ""),
                        Collection(4, "Collection com um nome grande 4", ""),
                        Collection(5, "Collection com um nome grande 5", ""),
                        Collection(6, "Collection com um nome grande 6", ""),
                    )
                ),
                Subcategory(
                    1, "Oceano", "sons02", listOf<Collection>(
                        Collection(1, "Collection com um nome grande 1", ""),
                        Collection(2, "Collection com um nome grande 2", ""),
                        Collection(3, "Collection com um nome grande 3", ""),
                        Collection(4, "Collection com um nome grande 4", ""),
                        Collection(5, "Collection com um nome grande 5", ""),
                        Collection(6, "Collection com um nome grande 6", ""),
                    )
                ),
                Subcategory(
                    1, "Animais", "sons03", listOf<Collection>(
                        Collection(1, "Collection com um nome grande 1", ""),
                        Collection(2, "Collection com um nome grande 2", ""),
                        Collection(3, "Collection com um nome grande 3", ""),
                        Collection(4, "Collection com um nome grande 4", ""),
                        Collection(5, "Collection com um nome grande 5", ""),
                        Collection(6, "Collection com um nome grande 6", ""),
                    )
                ),
                Subcategory(
                    1, "Floresta", "sons04", listOf<Collection>(
                        Collection(1, "Collection com um nome grande 1", ""),
                        Collection(2, "Collection com um nome grande 2", ""),
                        Collection(3, "Collection com um nome grande 3", ""),
                        Collection(4, "Collection com um nome grande 4", ""),
                        Collection(5, "Collection com um nome grande 5", ""),
                        Collection(6, "Collection com um nome grande 6", ""),
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
                        Collection(1, "Collection com um nome grande 1", ""),
                        Collection(2, "Collection com um nome grande 2", ""),
                        Collection(3, "Collection com um nome grande 3", ""),
                        Collection(4, "Collection com um nome grande 4", ""),
                        Collection(5, "Collection com um nome grande 5", ""),
                        Collection(6, "Collection com um nome grande 6", ""),
                    )
                ),
            )
        ),
    )
}