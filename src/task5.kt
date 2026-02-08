fun main(args: Array<String>) {
    args.groupingBy { it }
        .eachCount()
        .toList()
        .sortedWith(compareByDescending<Pair<String, Int>> { it.first }
            .thenByDescending { it.second })
        .forEach { (key, value) -> println("$key $value") }
}