/*OUTPUT:
Queue: 10 5 20 15 
Peek: 10
Poll: 10
Queue: 5 20 15
Poll: 5
Queue: 20 15
Peek: 20   */
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
    public void insert(int data) {
        Node newNode = new Node(data);
        if (rear == null) { // queue is empty
            front = rear = newNode;
            return;          // important: return so we don't run the rest
        }
        rear.next = newNode;
        rear = newNode;
    }
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
    // Poll → remove highest priority (smallest value)
    public Integer poll() {
        if (front == null) {
            System.out.println("Queue is empty! Nothing to poll.");
            return null;
        }

        int value = front.data;
        front = front.next;
        return value;
    }

    // Peek → return highest priority value
    public Integer peek() {
        if (front == null) {
            System.out.println("Queue is empty!");
            return null;
        }
        return front.data;
    }
}
public class Priorityqueue {
    public static void main(String[] args) {
        QueueMethods pq = new QueueMethods();

        pq.insert(10);
        pq.insert(5);
        pq.insert(20);
        pq.insert(15);

        pq.display();   // Expected: 5 10 15 20

        System.out.println("Peek: " + pq.peek());  

        System.out.println("Poll: " + pq.poll());  
        pq.display();   
        System.out.println("Poll: " + pq.poll());  
        pq.display();   

        System.out.println("Peek: " + pq.peek());  
    }
}
