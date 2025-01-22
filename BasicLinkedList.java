package myhelloworld;

class MyNode
{
int data;
MyNode next;
// constructor to initialize a node 
public MyNode(int data)
{
    
   this.data = data;
   this.next = null;
}

}

// Linked list class to manage linked list
class MyLinkedList{

    private MyNode head;
    
    public void adddata(int data){
    MyNode newNode = new MyNode(data);

    if (head == null) {
        head = newNode;
    } else {
        MyNode temp = head;
        while (temp.next != null) { // Stop at the last node
            temp = temp.next;
        }
        temp.next = newNode; // Add the new node at the end
    }
}

    // display all nodes
    public void printnodes()
    {
       if (head == null)
       {
       System.out.println("The List is Empty!");
       return;
       }
       
       MyNode temp = head;
       while(temp != null)
       {
          System.out.print(temp.data+ "--> ");
          temp = temp.next;
       }
       System.out.println("Null");
    }
}

public class BasicLinkedList {
    public static void main(String[] args) {
        
        MyLinkedList list = new MyLinkedList();

        list.adddata(10);
        list.adddata(20);
        list.adddata(30);
        list.adddata(40);

        System.out.println("Initial List:");
        list.printnodes();
    }
}
