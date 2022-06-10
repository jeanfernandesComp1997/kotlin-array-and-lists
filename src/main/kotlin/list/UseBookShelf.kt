package list

fun main() {
    val bookShelf = BookShelf(genre = "Code", books = bookList)

    val byAuthor = bookShelf.sortByAuthor()
    val byPublishYear = bookShelf.sortByPublishYear()

    byAuthor.print()
    byPublishYear.print()
}