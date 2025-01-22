package myhelloworld;

import java.util.Scanner;

public class SingleLLTodoList {
    
    private LinkNode head;
    private static class LinkNode{
        private String description;
        private LinkNode next;

        public LinkNode(String description){
            this.description = description;
            this.next = null;
        }
    }
    // method for adding tasks
    public void addTask(String description){
        LinkNode newtask = new LinkNode(description);
        if (head==null){
            head = newtask;
            return;
        }
        LinkNode currentNode = head;
        while (currentNode.next!=null){
            currentNode = currentNode.next;
        }
        currentNode.next = newtask;
    }
    // method for displaying tasks
    public void displayTasks(){
    LinkNode current = head;
    while (current!=null){
        System.out.println(current.description);
        current = current.next;

     }
    }
    // method to delete the completed task
    public String deleteFirst() {
        if (head == null) {
            return "No tasks to delete.";
        }
        String deletedDescription = head.description;  
        head = head.next;
        return "This task is completed "+deletedDescription;
    }

    public static void main(String[] args) {
    SingleLLTodoList tasks = new SingleLLTodoList();
    Scanner sc = new Scanner(System.in);  

    while(true) {
        System.out.println("To-Do List Options:");
        System.out.println("1. Add a new task");
        System.out.println("2. Complete the first task");
        System.out.println("3. Display all tasks");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
        
        int num = sc.nextInt();
        sc.nextLine();  // consume the leftover newline character

        if (num == 1) {
            System.out.print("Enter task description: ");
            String taskInput = sc.nextLine();
            tasks.addTask(taskInput);
        } 
        else if (num == 2) {
            String print = tasks.deleteFirst();
            System.out.println(print);
        } 
        else if (num == 3) {
            tasks.displayTasks();
        } 
        else if (num == 4) {
            System.out.println("Exiting To-Do List.");
            sc.close();
            break;
        } else {
            System.out.println("Wrong input. Please try again.");
        }
    }
}
}