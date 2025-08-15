class QueueUsingLinkedList() {
    var front: Node? = null
    var rear: Node? = null

    fun push(pushValue: Int) {
        val queueNode = Node(pushValue)

        if (rear == null) {
            front = queueNode
            rear = queueNode

        } else {
            rear?.next = queueNode
            rear = queueNode
        }
    }

    fun pop(): Int? {
        if (front == null){
           emptyQueueArgument()
        }
        val popValue = front?.value
        front = front?.next
        return popValue
    }
}