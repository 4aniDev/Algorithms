//  two solutions
fun main() {
    //  first solution
    val listOfInt = mutableListOf<Int>(1, 2, 3, 4, 5)
    println(sum(listOfInt))

    //  second solution
    val arrInt = intArrayOf(1, 2, 3, 4, 5)
    println(sumArray(arrInt))
}

//  first solution
fun sum(listOfInt: MutableList<Int>): Int {
    // Base case
    return if (listOfInt.size == 1) {
        listOfInt[0]
    } else {
        // Recursive case
        val firstInt = listOfInt[0]
        listOfInt.removeAt(0)
        firstInt + sum(listOfInt)
    }
}

//  second solution
fun sumArray(arrInt: IntArray): Int = when {
    arrInt.isEmpty() -> 0
    else -> arrInt[0] + sumArray(arrInt.copyOfRange(1, arrInt.size))
}