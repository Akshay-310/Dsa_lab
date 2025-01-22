package myhelloworld;

/*class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    public LinkedList() {
        head = null;
    }

    // Method to add a new node at the end of the list
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    // Method to find the length of the linked list
    public int getLength() {
        int length = 0;
        Node current = head;
        while (current != null) {
            length++;
            current = current.next;
        }
        return length;
    }

    // Method to print the middle node of the linked list using its length
    public void printMiddle() {
        if (head == null) {
            System.out.println("The list is empty.");
            return;
        }

        int length = getLength(); // Get the length of the list
        int middleIndex = length / 2; // Find the index of the middle node (0-based)

        Node current = head;
        for (int i = 0; i < middleIndex; i++) {
            current = current.next; // Traverse the list to the middle node
        }

        System.out.println("Middle node of the linked list: " + current.data);
    }

    // Method to delete the complete linked list
    public void deleteList() {
        head = null; 
        System.out.println("The linked list has been deleted.");
    }
}

public class SinglyLinked {
    public static void main(String[] args) {
        LinkedList obj = new LinkedList();

        // Adding some nodes to the linked list
        obj.insert(10);
        obj.insert(20);
        obj.insert(30);
        obj.insert(40);
        obj.insert(50);

        // Finding the length of the linked list
        System.out.println("Length of the linked list: " + obj.getLength());

        // Printing the middle node of the linked list
        obj.printMiddle();

        // Deleting the entire linked list
        obj.deleteList();

        System.out.println("Length of the linked list after deletion: " + obj.getLength());
    }
}*/
