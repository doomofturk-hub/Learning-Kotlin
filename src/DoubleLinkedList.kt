class DoubleLinkedList {
    var start: Node? = null
    var tail: Node? = null


    fun addToList(theObject: Int) {

        val newObject = Node(theObject)

        var checking = tail

        if (start == null) {
            start = newObject
            tail = newObject

        } else {
            while (checking?.next != null) {
                checking = checking.next
            }

            tail?.next = newObject
            newObject.previous = tail
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

    fun addRangeNumbers(rangeNumbers: IntArray) {
        for (i in 0 until rangeNumbers.size) {
            val newObject = Node(rangeNumbers[i])
            if (start == null) {
                start = newObject
                tail = newObject
            } else {
                tail?.next = newObject
                newObject.previous = tail
                tail = newObject

            }

        }
    }

}


