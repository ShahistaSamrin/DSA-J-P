/*OUTPUT:
===== ADD FIRST =====
30 -> 20 -> 10 -> null

===== INSERT AT END =====
30 -> 20 -> 10 -> 40 -> 50 -> null

===== INSERT AT INDEX =====
30 -> 20 -> 99 -> 10 -> 40 -> 50 -> null

===== COUNT NODES =====
Count = 6

===== SEARCH =====
Search 99 -> Index: 2
Search 200 -> Index: -1

===== DELETE BY INDEX =====
30 -> 20 -> 10 -> 40 -> 50 -> null

===== DELETE BY VALUE =====
30 -> 20 -> 10 -> 50 -> null

===== REVERSE LIST =====
50 -> 10 -> 20 -> 30 -> null */
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class ListOfFunctions {
    Node head;

    // Insert at beginning
    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Insert at end
    public void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Insert at given index
    public void indexInsert(int data, int index) {
        if (index < 0) {
            System.out.println("Invalid index.");
            return;
        }
        if (index == 0) {
            addFirst(data);
            return;
        }

        Node temp = head;
        for (int i = 0; temp != null && i < index - 1; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Index out of bounds.");
            return;
        }

        Node newNode = new Node(data);
        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Count nodes
    public int count() {
        int c = 0;
        Node temp = head;
        while (temp != null) {
            c++;
            temp = temp.next;
        }
        return c;
    }

    // Display list
    public void display() {
        Node temp = head;
        if (temp == null) {
            System.out.println("List is empty");
            return;
        }
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Reverse list
    public void reverse() {
        Node prev = null, current = head, nextNode;

        while (current != null) {
            nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }

        head = prev;
    }

    // Search key (return index)
    public int search(int key) {
        Node temp = head;
        int index = 0;

        while (temp != null) {
            if (temp.data == key)
                return index;
            temp = temp.next;
            index++;
        }
        return -1;
    }

    // Delete by index
    public void deleteIndex(int index) {
        if (head == null) {
            System.out.println("List empty.");
            return;
        }

        if (index < 0) {
            System.out.println("Invalid index.");
            return;
        }

        if (index == 0) {
            head = head.next;
            return;
        }

        Node temp = head;
        for (int i = 0; temp != null && i < index - 1; i++) {
            temp = temp.next;
        }

        if (temp == null || temp.next == null) {
            System.out.println("Index out of bounds.");
            return;
        }

        temp.next = temp.next.next;
    }

    // Delete by value
    public boolean deleteByValue(int value) {
        if (head == null) return false;

        if (head.data == value) {
            head = head.next;
            return true;
        }

        Node temp = head;
        while (temp.next != null && temp.next.data != value) {
            temp = temp.next;
        }

        if (temp.next == null) return false;

        temp.next = temp.next.next;
        return true;
    }
}


public class SinglyLL {
    public static void main(String[] args) {

        ListOfFunctions ll = new ListOfFunctions();

        System.out.println("===== ADD FIRST =====");
        ll.addFirst(10);
        ll.addFirst(20);
        ll.addFirst(30);
        ll.display();

        System.out.println("\n===== INSERT AT END =====");
        ll.insert(40);
        ll.insert(50);
        ll.display();

        System.out.println("\n===== INSERT AT INDEX =====");
        ll.indexInsert(99, 2);
        ll.display();

        System.out.println("\n===== COUNT NODES =====");
        System.out.println("Count = " + ll.count());

        System.out.println("\n===== SEARCH =====");
        System.out.println("Search 99 -> Index: " + ll.search(99));
        System.out.println("Search 200 -> Index: " + ll.search(200));

        System.out.println("\n===== DELETE BY INDEX =====");
        ll.deleteIndex(2);   // deletes 99
        ll.display();

        System.out.println("\n===== DELETE BY VALUE =====");
        ll.deleteByValue(40);
        ll.display();

        System.out.println("\n===== REVERSE LIST =====");
        ll.reverse();
        ll.display();
    }
}
