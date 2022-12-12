fun main() {
    val list = mutableListOf<Any>(1,2,3,4,5,6,7,8)
    println(countOfElementsInList(list))
}

fun countOfElementsInList(list: MutableList<Any>): Int = when {
    list.isEmpty() -> 0
    else -> {
        list.removeAt(0)
        1 + countOfElementsInList(list)
    }
}