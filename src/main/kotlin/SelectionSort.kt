fun findIndexOfSmallestElement(list: MutableList<Int>): Int {
    var smallest = list[0]
    var smallestIndex = 0

    list.forEachIndexed { index, element ->
        if (element < smallest) {
            smallest = element
            smallestIndex = index
        }
    }
    return smallestIndex
}

fun selectionSort(list: MutableList<Int>): MutableList<Int> {
    val newList = mutableListOf<Int>()


    for (i in 0..list.size) {
        if (list.isNotEmpty()) {
            val indexOfSmallest = findIndexOfSmallestElement(list)
            newList.add(list[indexOfSmallest])
            list.removeAt(indexOfSmallest)
        }
    }

    return newList
}

fun main() {
    val list = mutableListOf<Int>(1,27,3,4,9,1,5,7,22,0,35,4)
    val sortedList = selectionSort(list)
    println(sortedList)
}