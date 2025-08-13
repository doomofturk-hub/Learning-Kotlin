class DoubleLinkedList {
    var start: Node? = null
    var tail: Node? = null


    fun addToList(theObject: Int) {

        var newObject: Node? = Node(theObject)

        var checking = start

        if (start == null) {
            start = newObject
            tail = newObject

        } else {
            while (checking?.next != null) {
                checking = checking.next

            }
            checking?.next = newObject
            newObject?.previous = tail
            tail = newObject

        }
    }


    fun removeFromTailInList() {
        if (tail != null) {
            tail = tail!!.previous
            tail!!.next = null
        } else {
            emptyListArgument()
        }
    }


    fun removeFromStartInList() {
        if (start != null) {
            start = start?.next
            start?.previous = null
        } else {
            emptyListArgument()
        }
    }

    fun Print() {

        var checking = start

        while (checking != null) {
            println("${checking.value}")
            checking = checking.next

        }
    }
}





