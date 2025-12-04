/*OUTPUT:
Queue: 10 20 30 
Front value: 10
Dequeued: 10
Queue: 20 30
Queue: 20 30 40
Dequeued: 20
Dequeued: 30
Dequeued: 40
Queue is empty!
Dequeued: -1
Queue is empty! */
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class QueueMethods {
    private Node front = null;
    private Node rear = null;

    // Insert element at rear (FIFO)
    public void enqueue(int data) {
        Node newNode = new Node(data);
        if (rear == null) { // queue is empty
            front = rear = newNode;
            return;          // important: return so we don't run the rest
        }
        rear.next = newNode;
        rear = newNode;
    }

    // Remove element from front and return its value
    public int dequeue() {
        if (front == null) {
            System.out.println("Queue is empty!");
            return -1;
        }

        int value = front.data;
        front = front.next;          // move front forward

        if (front == null) {         // if queue becomes empty
            rear = null;
        }

        return value;
    }

    // Return front value without removing it
    public int frontValue() {
        if (front == null) {
            System.out.println("Queue is empty!");
            return -1;
        }
        return front.data;
    }

    // Check if queue is empty
    public boolean isEmpty() {
        return front == null;
    }

    // Display queue contents
    public void display() {
        if (front == null) {
            System.out.println("Queue is empty!");
            return;
        }

        Node temp = front;
        System.out.print("Queue: ");
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class Queue {
    public static void main(String[] args) {
        QueueMethods qm = new QueueMethods();

        qm.enqueue(10);
        qm.enqueue(20);
        qm.enqueue(30);

        qm.display(); // Queue: 10 20 30

        System.out.println("Front value: " + qm.frontValue()); // Front value: 10

        System.out.println("Dequeued: " + qm.dequeue()); // Dequeued: 10
        qm.display(); // Queue: 20 30

        qm.enqueue(40);
        qm.display(); // Queue: 20 30 40

        System.out.println("Dequeued: " + qm.dequeue()); // Dequeued: 20
        System.out.println("Dequeued: " + qm.dequeue()); // Dequeued: 30
        System.out.println("Dequeued: " + qm.dequeue()); // Dequeued: 40
        System.out.println("Dequeued: " + qm.dequeue()); // Queue is empty! -> -1

        qm.display(); // Queue is empty!
    }
}
