package list

data class BookShelf(
    val genre: String,
    val books: List<Book>
) {

    fun sortByAuthor(): List<Book> = books.sortedBy { it.author }

    fun sortByPublishYear(): List<Book> = books.sortedBy { it.publishYear }
}