/**********************************************************************************************************************************************************************
 *
 *  Ability to create a Stack of 56->30->70
 *  Use LinkedList to do the Stack Operations
 *  Here push will internally call add method on LinkedList.
 *  So 70 will be added first then 30 and then 56 to make 56 on top of the Stack
 *
 *  @author : Immanuvel Jeeva
 *  @Since  : 24-07-2021
 *
 *********************************************************************************************************************************************************************/
package com.company;

public class StackUc1 {

    public Node head;
    public Node tail;
    static class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }

    // Pushing new datas
    public void push(int datas){
        Node newNode = new Node(datas);
        if(head == null){
            head = newNode;
            tail = newNode;
        }
        else {
            newNode.next = head;
            head = newNode;
        }
    }

    // Display all Node With Value
    public void display() {
        Node current = head;
        if(head == null) {
            System.out.println("List is empty");
        }
        while (current != null) {
            System.out.println(current.data +" ");
            current = current.next;
        }
    }

    public static void main(String[] args) {
        StackUc1 operStack = new StackUc1();
        operStack.push(70);
        operStack.push(30);
        operStack.push(56);

        operStack.display();
    }
}
