fun main() {

    val linkedList = DoubleLinkedList()
//    linkedList.addToList(1)
//    linkedList.addToList(2)
//    linkedList.addToList(3)
//    linkedList.addToList(4)
//    linkedList.addToList(5)
//    linkedList.addToList(6)

//    linkedList.removeFromStartInList()

    val rangeNumbers = intArrayOf(1,2,3,4,5,6,7,8,9,10,11,12)
    linkedList.addRangeNumbers(rangeNumbers)
    var newNode = linkedList.start


    repeat(6) {
        if (newNode != null) {
            print("Node: ${newNode.value}")
            println(" | Previous Node : ${newNode.previous?.value}")
            newNode = newNode.next
        }
    }
}