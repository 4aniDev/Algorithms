import kotlin.random.Random

fun main() {
    val list = listOf<Int>(1, 5, 7, 2, 3, 4, 6)
    println(quickSort(list))
}

fun quickSort(list: List<Int>): List<Int> {

    if (list.size <= 1) return list

    // Random, because in this case algorithm speed == O(n * log n)
    val pivotElement = list[Random.nextInt(list.size)]
    val listLess = list.filter { it < pivotElement }
    val listGreat = list.filter { it > pivotElement }

    return quickSort(listLess) + pivotElement + quickSort(listGreat)
}