import java.util.LinkedList
import java.util.Queue


fun main() {

    val busStopOne = BusStop("Oguz-1")
    val busStopTwo = BusStop("Oguz-2")
    val busStopThree = BusStop("Oguz-3")
    val busStopFour = BusStop("Oguz-4")
    val busStopFive = BusStop("HudayBerdyev-1")
    val busStopSix = BusStop("HudayBerdyev-2")
    val busStopSeven = BusStop("HudayBerdyev-3")
    // point for search
    val busStopEight = BusStop("Kotovskiy-1")


    val graphOfBusStops = hashMapOf<BusStop, List<BusStop>>()

    graphOfBusStops[busStopOne] = listOf(busStopTwo)
    graphOfBusStops[busStopTwo] = listOf(busStopOne, busStopThree)
    graphOfBusStops[busStopThree] = listOf(busStopTwo, busStopFour)
    graphOfBusStops[busStopFour] = listOf(busStopThree, busStopEight)
    graphOfBusStops[busStopFive] = listOf(busStopSix)
    graphOfBusStops[busStopSix] = listOf(busStopFive, busStopSeven)
    graphOfBusStops[busStopSeven] = listOf(busStopSix, busStopEight)
    graphOfBusStops[busStopEight] = listOf(busStopSeven, busStopFour)


    breadthFirstSearch(graphOfBusStops, busStopOne, busStopEight)

}


fun breadthFirstSearch(map: HashMap<BusStop, List<BusStop>>, startPoint: BusStop, endPoint: BusStop) {
    val searchQueue: Queue<BusStop> = LinkedList<BusStop>()
    val searchedList = arrayListOf<BusStop>()

    map[startPoint]?.forEach {
        searchQueue.add(it)
    }

    while (searchQueue.isNotEmpty()) {
        val busStop = searchQueue.remove()
        if (!searchedList.contains(busStop)) {
            if (busStop == endPoint) {
                println("We found busStop: $busStop")
            }
            else {
                map[busStop]?.forEach {
                    searchQueue.add(it)
                }
                searchedList.add(busStop)
            }
        }
    }
}

data class BusStop(
    val name: String,
)