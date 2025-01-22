package myhelloworld;

public class CircularLinked {
    
    Node head;

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // Insert at head
    public void insertAtHead(int data) {
        Node newNode = new Node(data);

        if (head == null) 
        {                   // if the List is empty
            head = newNode;
            newNode.next = head;     // Circular link
            return;
        }

        Node temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }

        newNode.next = head;
        head = newNode;
        temp.next = head; // Maintain circular link
    }

    // Insert after a specific node
    public void insertAfter(Node prev_node, int newdata) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node newNode = new Node(newdata);
        newNode.next = prev_node.next;
        prev_node.next = newNode;
    }

    // Insert at end
    public void insertAtEnd(int newdata) {
        Node newNode = new Node(newdata);

        if (head == null) { // List is empty
            head = newNode;
            newNode.next = head; // Circular link
            return;
        }

        Node temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }

        temp.next = newNode;
        newNode.next = head; // Maintain circular link
    }

    // Delete from start
    public void deleteFromStart() {
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }

        if (head.next == head) { // Only one node
            head = null;
            return;
        }

        Node temp = head;
        while (temp.next != head) {
            temp = temp.next;
        }

        head = head.next;
        temp.next = head; // Maintain circular link
    }

    // Delete from end
    public void deleteFromEnd() {
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }

        if (head.next == head) { // Only one node
            head = null;
            return;
        }

        Node temp = head;
        while (temp.next.next != head) {
            temp = temp.next;
        }

        temp.next = head; // Maintain circular link
    }

    // Delete from specified position
    public void deleteFromPosition(int position) {
        if (head == null) {
            System.out.println("The list is empty");
            return;
        }

        if (position == 1) { // Delete from start
            deleteFromStart();
            return;
        }

        Node temp = head;
        for (int i = 1; i < position - 1 && temp.next != head; i++) {
            temp = temp.next;
        }

        if (temp.next == head) { // Position out of bounds
            System.out.println("Position out of bounds");
            return;
        }

        temp.next = temp.next.next; // Bypass the node
    }

    // Print the list
    public void printList() {
        if (head == null) {
            System.out.println("No node added yet, List is empty");
            return;
        }

        Node temp = head;
        do {
            System.out.print(temp.data + " --> ");
            temp = temp.next;
        } while (temp != head);

        System.out.println("(back to head)");
    }

    public static void main(String[] args) {
        CircularLinked list = new CircularLinked();

        // Insert at the end
        list.insertAtEnd(10);
        list.insertAtEnd(20);
        list.insertAtEnd(30);
        System.out.println("List after inserting nodes at the end:");
        list.printList();

        // Insert at the head
        list.insertAtHead(5);
        System.out.println("List after inserting 5 at the head:");
        list.printList();

        // Insert after a specific node
        list.insertAfter(list.head.next, 15); // Insert 15 after the second node
        System.out.println("List after inserting 15 after the second node:");
        list.printList();

        // Delete from start
        list.deleteFromStart();
        System.out.println("List after deleting from start:");
        list.printList();

        // Delete from end
        list.deleteFromEnd();
        System.out.println("List after deleting from end:");
        list.printList();

        // Delete from a specific position
        list.deleteFromPosition(2); // Delete the second node
        System.out.println("List after deleting node at position 2:");
        list.printList();
    }
}
