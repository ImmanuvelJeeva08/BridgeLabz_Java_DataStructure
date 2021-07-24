/**********************************************************************************************************************************************************************
 *
 *  Ability to dequeue From the beginning
 *  Use LinkedList to do the Queue Operations
 *
 *  @author : Immanuvel Jeeva
 *  @Since  : 24-07-2021
 *
 *********************************************************************************************************************************************************************/
package com.company;

public class QueueUc2 {
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

    // Append datas One By One
    public void append(int datas){
        Node newNode = new Node(datas);
        if(head == null){
            head = newNode;
            tail = newNode;
        }
        else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    // Display all the Node with value
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

    // Dequeue all the elements
    public void dequeue() {
        Node current = head;
        while (current != null) {
            if (current == head) {
                head = head.next;
                current = head;
            }
        }
    }
    public static void main(String[] args) {
        QueueUc2 operQueue = new QueueUc2();
        operQueue.append(70);
        operQueue.append(30);
        operQueue.append(56);

        operQueue.display();
        operQueue.dequeue();
        operQueue.display();

    }
}
