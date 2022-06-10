package list

val bookList = mutableListOf<Book>(
    Book(
        "Microsserviços prontos para produção",
        "Susan J. Fowler",
        2017,
        "novatec"
    ),
    Book(
        "Implementing Domain-Driven Design",
        "Vaughn Vernon",
        2013,
        "Addison Wesley"
    ),
    Book(
        "Clean Code",
        "Robert C. Martin",
        2008,
        "Addison Wesley"
    ),
    Book(
        "Estruturas de dados com Java Script",
        "Loiane Groner",
        2018
    ),
)

val bookListWithNull = mutableListOf<Book?>(
    null,
    Book(
        "Microsserviços prontos para produção",
        "Susan J. Fowler",
        2017,
        "novatec"
    ),
    null,
    Book(
        "Implementing Domain-Driven Design",
        "Vaughn Vernon",
        2013,
        "Addison Wesley"
    ),
    null,
    Book(
        "Clean Code",
        "Robert C. Martin",
        2008,
        "Addison Wesley"
    )
)