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
    public void insertnode(int data) {
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

    // Method to print the linked list
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    // Method to merge two sorted linked lists
    public static LinkedList merge(LinkedList new1, LinkedList new2) {
        LinkedList mergedList = new LinkedList();
        Node p1 = new1.head;
        Node p2 = new2.head;

        // Create a dummy node to simplify the merge process
        Node dummy = new Node(0);
        Node current = dummy;

        // Merge the two lists
        while (p1 != null && p2 != null) {
            if (p1.data < p2.data) {
                current.next = p1;
                p1 = p1.next;
            } else {
                current.next = p2;
                p2 = p2.next;
            }
            current = current.next;
        }

        // If any nodes are left in list1, append them
        if (p1 != null) {
            current.next = p1;
        }

        // If any nodes are left in list2, append them
        if (p2 != null) {
            current.next = p2;
        }

        // Set the head of the merged list
        mergedList.head = dummy.next;

        return mergedList;
    }
}

public class MergeSorted {
    public static void main(String[] args) {
        LinkedList new1 = new LinkedList();
        LinkedList new2 = new LinkedList();

        // Adding nodes to the first sorted list (1, 2, 3)
        new1.insertnode(1);
        new1.insertnode(2);
        new1.insertnode(3);

        // Adding nodes to the second sorted list (4, 5, 6)
        new2.insertnode(4);
        new2.insertnode(5);
        new2.insertnode(6);

        // Before merging
        System.out.println("List 1:");
        new1.printList();
        System.out.println("List 2:");
        new2.printList();

        // Merging the two sorted linked lists
        LinkedList mergedList = LinkedList.merge(new1, new2);

        // After merging
        System.out.println("Merged List:");
        mergedList.printList();
    }
}*/

