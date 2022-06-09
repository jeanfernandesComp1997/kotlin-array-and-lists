package list

data class Book(
    val title: String,
    val author: String,
    val publishYear: Long,
    val publishingCompany: String? = null
)