package myhelloworld;

/*class KNode{

    int data;
    KNode next;
    
    public KNode(int data)
    {
        this.data = data;
        this.next = null;
    }
}
    
class LinkedList{
    private KNode head;
    
    // method for adding the data
    public void addnumber(int data)
    {
        KNode newnode = new KNode(data);
       
        if(head == null)
        {
           head = newnode;
        }
        else{
            KNode temp = head;
           while(temp.next != null)
           {
              temp = temp.next;
           }
           temp.next = newnode;
        }
    }
    
    public void deleteend()
    {
        if(head == null)
        {
           System.out.println("The list is empty!");
        }
        
        if(head.next == null)
        {
           head = null;
        }
       
        KNode temp = head;
            while(temp.next.next != null)
            {
                temp = temp.next;
            }
          temp.next = null;
    }
    
    public void display()
    {
        if(head == null)
        {
        System.out.println("The List is empty");
        }
        else{
        KNode temp = head;
           while(temp != null)
           {
              System.out.print(temp.data+"-->");
              temp = temp.next;
           }
           System.out.println("Null");
    }
        
    }
}
public class Firstprogram {
    public static void main(String[] args) {
    
        LinkedList list = new LinkedList();
        
                list.addnumber(8);
                list.addnumber(16);
                list.addnumber(24);
                list.addnumber(32);
                list.addnumber(40);

        // Display the list
        System.out.println("Linked List:");
        list.display();
        
        list.deleteend();
        System.out.println("After deleting one element");
        list.display();
        
    }
    
}*/

