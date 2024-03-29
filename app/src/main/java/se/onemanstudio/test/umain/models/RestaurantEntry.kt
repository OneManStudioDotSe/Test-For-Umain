package se.onemanstudio.test.umain.models

data class RestaurantEntry(
    val id: String,
    val title: String,
    val promoImageUrl: String,
    val tags: List<TagEntry>,
    val tagsInitially: List<String>,
    val rating: Double,
    val openTimeAsText: String
)
