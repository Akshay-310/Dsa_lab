package myhelloworld;

import java.util.Scanner;

class MyTodoList {

    private class LinkNode {
        String task;
        LinkNode prev;
        LinkNode next;

        LinkNode(String task) {
            this.task = task;
            this.prev = null;
            this.next = null;
        }
    }

    private LinkNode head; 
    private LinkNode tail;  

    public MyTodoList() {
        head = null;
        tail = null;
    }

    // Method to add a new task at the end of the list
    public void addTask(String task) {
        LinkNode newNode = new LinkNode(task);
        if (tail == null) {  // List is empty
            head = newNode;
            tail = newNode;
        } else {  // Add to end
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
        System.out.println("Task added: " + task);
        System.out.println();
    }

    // Method to delete the first task (mark as completed)
    public void completeTask() {
        if (head == null) {  // List is empty
            System.out.println("No tasks to complete!");
            return;
        }
        System.out.println("Completed task: " + head.task);
        head = head.next;  // Move head to the next node
        if (head != null) {
            head.prev = null;
        } else {  // List is now empty
            tail = null;
        }
    }

    // Method to display all tasks in the To-Do List
    public void displayTasks() {
        if (head == null) {
            System.out.println("To-Do List is empty!");
            return;
        }
        System.out.println("To-Do List:");
        LinkNode current = head;
        while (current != null) {
            System.out.println("- " + current.task);
            current = current.next;
        }
    }
}
public class DoubleLLTodoList{
    public static void main(String[] args) {
    MyTodoList todoList = new MyTodoList();
    Scanner sc = new Scanner(System.in);

    while (true) {
        System.out.println("To-Do List Options:");
        System.out.println("1. Add a new task");
        System.out.println("2. Complete the first task");
        System.out.println("3. Display all tasks");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        sc.nextLine(); // Consume the newline character

        if (choice == 1) {
            System.out.print("Enter task description: ");
            String task = sc.nextLine();
            todoList.addTask(task);
        } else if (choice == 2) {
            todoList.completeTask();
        } else if (choice == 3) {
            todoList.displayTasks();
        } else if (choice == 4) {
            System.out.println("Exiting To-Do List.");
            sc.close();
            break;
        } else {
            System.out.println("Wrong input. Please try again.");
        }
    }
}

}
