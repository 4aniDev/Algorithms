private const val LIST_IS_NOT_CONTAINS_SEARCH_VALUE = -111111111

fun main(args: Array<String>) {
    val listInt = arrayListOf(1,2,3,4,5,6,7,8,9,10,11)
    val result = binSearchForInt(listInt, 8)
    println(result)
}


fun binSearchForInt(listInt: List<Int>, searchValue: Int): Int {
    var minItem = 0
    var maxItem = listInt.size - 1

    while (minItem <= maxItem) {
        val midItem = (minItem + maxItem) / 2
        val guess = listInt[midItem]

        if (listInt[guess] == searchValue) {
            return listInt[guess]
        }
        if (listInt[guess] > searchValue) {
            maxItem = midItem - 1
        } else {
            minItem = midItem + 1
        }
    }

    return LIST_IS_NOT_CONTAINS_SEARCH_VALUE
}

