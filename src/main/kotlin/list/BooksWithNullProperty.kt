package list

fun main() {
    bookList
        .groupBy { it.publishingCompany ?: "Unknown publisher" }
        .forEach { (publisher: String?, books: List<Book>) ->
            println("$publisher: ${books.joinToString { it.title }}")
        }
}