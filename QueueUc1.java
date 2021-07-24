/**********************************************************************************************************************************************************************
 *
 *  Ability to create a Queue of 56->30->70
 *  Use LinkedList to do the Queue Operations
 *  Here enqueu will internally call append method on LinkedList.
 *  So 56 will be added first then 30 and then 70 to make 56 on top of the Stack
 *
 *  @author : Immanuvel Jeeva
 *  @Since  : 24-07-2021
 *
 **********************************************************************************************************************************************************************/
package com.company;

public class QueueUc1 {
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

    public static void main(String[] args) {
        QueueUc1 operQueue = new QueueUc1();
        operQueue.append(70);
        operQueue.append(30);
        operQueue.append(56);

        operQueue.display();
    }

}
