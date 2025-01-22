package myhelloworld;

/*class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class RLinkedList {
    Node head;
    
    public RLinkedList() {
        head = null;
    }

    // Method to add a new node at the end of the list
    public void rappend(int data) {
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

    // Method to remove duplicates from the sorted linked list
    public void removeDuplicates() {
        if (head == null) {
            return;         // List is empty, nothing to remove
        }

        Node current = head;

        // Traverse the list
        while (current != null && current.next != null) 
        {
            
            if (current.data == current.next.data) 
            {
                current.next = current.next.next; 
            } else {
                current = current.next; 
            }
        }
    }

    // Method to print the linked list
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class RemoveDuplicates {
    public static void main(String[] args) {
        
        RLinkedList obj3 = new RLinkedList();

        // Adding nodes to the linked list (with duplicates)
        obj3.rappend(10);
        obj3.rappend(10);
        obj3.rappend(20);
        obj3.rappend(20);
        obj3.rappend(30);
        obj3.rappend(30);
        obj3.rappend(40);

        // Before removing duplicates
        System.out.println("Original List:");
        obj3.printList();

        // Remove duplicates from the sorted linked list
        obj3.removeDuplicates();

        // After removing duplicates
        System.out.println("List after removing duplicates:");
        obj3.printList();
    }
}
*/
