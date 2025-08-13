import java.util.LinkedList

fun main() {

    val linkedList = DoubleLinkedList()
    linkedList.addToList(1)
    linkedList.addToList(2)
    linkedList.addToList(3)
    linkedList.addToList(4)
    linkedList.addToList(5)
    linkedList.addToList(6)




    var newNode = linkedList.start

    repeat(10) {
        if(newNode != null){
            print("Node: ${newNode.value}")
            println(" | Previous Node : ${newNode.previous?.value}")
            newNode = newNode.next
        }
    }
}