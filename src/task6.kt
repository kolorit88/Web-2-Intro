import java.util.Scanner

fun main(args: Array<String>) {
    val input =
        if (args.isNotEmpty()) args
        else Scanner(System.`in`).nextLine().split(" ").toTypedArray()


    input.groupingBy { it }
        .eachCount()
        .toList()
        .sortedWith(compareByDescending<Pair<String, Int>> { it.first }
            .thenByDescending { it.second })
        .forEach { (key, value) -> println("$key $value") }
}