fun main(args: Array<String>) {
    val emptyMap = mapOf<String, Int>()
    args.sorted()
        .groupingBy { it }
        .eachCount()
        .forEach {(key, value) -> println("$key $value") }
}