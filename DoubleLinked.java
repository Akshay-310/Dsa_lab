package myhelloworld;

public class DoubleLinked{
    
    Node head;
    Node tail;

    static class Node {
        int data;
        Node prev;
        Node next;

        public Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    // Method to add a new node at the end
    public void insertAtEnd(int data) {
        Node newNode = new Node(data);

        if (head == null) 
        {                      // if List is empty
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    // Method to insert a node at a specified position
    public void insertAtPos(int position, int data) {
        Node newNode = new Node(data);
        if (position == 1) { // Insert at the beginning
            newNode.next = head;
            if (head != null) {
                head.prev = newNode;
            }
            head = newNode;
            if (tail == null) 
            { // If the list was empty, update the tail
                tail = newNode;
            }
            return;
        }

        Node current = head;
        for (int i = 1; i < position - 1 && current != null; i++) {
            current = current.next;
        }

        if (current == null) 
        {            
            insertAtEnd(data);
        } else {
            newNode.next = current.next;
            if (current.next != null) 
            {
                current.next.prev = newNode;
            }
            current.next = newNode;
            newNode.prev = current;
            
            if (newNode.next == null) 
            { // Update tail if it's the last node
                tail = newNode;
            }
        }
    }

    // Method to delete a node from a specified position
    public void deleteFromPos(int position) {
        if (head == null) 
        {                      // For Empty list
            System.out.println("List is empty.");
            return;
        }

        if (position == 1) 
        {                     // Delete the first node
            head = head.next;
            if (head != null) {
                head.prev = null;
            } else {         // If the list becomes empty, update tail
                tail = null;
            }
            return;
        }

        Node current = head;
        for (int i = 1; i < position && current != null; i++) {
            current = current.next;
        }

        if (current == null) {
            System.out.println("Position out of bounds.");
        } else {
            if (current.next != null) {
                current.next.prev = current.prev;
            } else { // If it's the last node, update tail
                tail = current.prev;
            }
            current.prev.next = current.next;
        }
    }
    
    // Method to print the list
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " --> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        DoubleLinked list = new DoubleLinked();

        // Insert nodes at the end
        list.insertAtEnd(20);
        list.insertAtEnd(40);
        list.insertAtEnd(80);
        list.insertAtEnd(100);

        // Print the list
        System.out.println("List after inserting at the end:");
        list.printList(); 

        // Insert node at a specified position
        list.insertAtPos(3, 60);
        System.out.println("List after inserting a element at position 3:");
        list.printList();

        // Delete node from a specified position
        list.deleteFromPos(2);
        System.out.println("List after deleting node at position 2:");
        list.printList();
    }
}

