package list

fun main() {
    val book1 = Book(
        "Microsserviços prontos para produção",
        "Susan J. Fowler",
        2017,
        "novatec"
    )

    val book2 = Book(
        "Implementing Domain-Driven Design",
        "Vaughn Vernon",
        2013,
        "Addison Wesley"
    )

    val book3 = Book(
        "Clean Code",
        "Robert C. Martin",
        2008,
        "Addison Wesley"
    )

    val books = mutableListOf(book1, book2, book3)

    books.add(
        Book(
            "Clean Architecture",
            "Robert C. Martin",
            2017,
            "Addison Wesley"
        )
    )

    println(books)

    books.remove(book1)
    println(books)

    books.print()
}

fun MutableList<Book>.print() {
    val formattedText = this.joinToString(separator = "\n") {
        " - ${it.toString()}"
    }

    println(" #### Books List #### \n$formattedText")
}