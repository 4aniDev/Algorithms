fun main() {
    val list = listOf<Int>(1, 2, 3, 105, 4, 5, 20, 13, 19)
    println(maxInt(list))
}

fun maxInt(list: List<Int>): Int {
    return when (list.size) {
        2 -> if (list[0] > list[1]) list[0] else list[1]

        else -> {
            val subMaxInt = maxInt(list.subList(1, list.size))
            if (list[0] > subMaxInt) list[0] else subMaxInt
        }
    }
}