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
    private Node head;

    // Add a new node to the list
    public void add(int data) {
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

    // Print the list
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Clone the list
    public LinkedList cloneList() {
        LinkedList clone = new LinkedList();
        Node temp = head;
        while (temp != null) {
            clone.add(temp.data);
            temp = temp.next;
        }
        return clone;
    }

    // Reverse the list
    public void reverse() {
        Node prev = null;
        Node current = head;
        while (current != null) {
            Node nextNode = current.next;
            current.next = prev;
            prev = current;
            current = nextNode;
        }
        head = prev;
    }

    public Node getHead() {
        return head;
    }
}

public class ReverseList {
    public static void main(String[] args) {
        // Original list
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        System.out.println("Original List:");
        list.printList();

        // Clone the original list
        LinkedList clonedList = list.cloneList();

        // Reverse the cloned list
        clonedList.reverse();

        System.out.println("Reversed Copy of the List:");
        clonedList.printList();

        // Print the original list again to confirm it is unchanged
        System.out.println("Original List after reversing (unchanged):");
        list.printList();
    }
}*/

