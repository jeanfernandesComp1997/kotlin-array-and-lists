package list

fun List<Book?>.print() {
    val formattedText = this
        .filterNotNull()
        .joinToString(separator = "\n") {
            " - ${it?.title} by ${it?.author}"
        }

    println(" #### Books List #### \n$formattedText")
}