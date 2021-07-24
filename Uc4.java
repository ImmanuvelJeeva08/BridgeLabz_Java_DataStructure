/**********************************************************************************************************************************************************************
 *
 *  Ability to insert 30 between 56 and 70
 *  Final Sequence: 56->30->70
 *
 *  @author : Immanuvel Jeeva
 *  @Since  : 24-07-2021
 *
 *********************************************************************************************************************************************************************/
package com.company;

public class Uc4 {

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

    // Adding new Node with data
    public void add(int datas){
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

    // Display the Node with value
    public void display() {
        Node current = head;
        if(head == null) {
            System.out.println("List is empty");
        }
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    // Insert the value between Given position
    public void insert(int c,int position){
        Node newNode = new Node(c);
        Node temp = head;
        for (int i=1; i < position-1; i++) {
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next=newNode;

        System.out.println("30 Added sucessfully between 56 and 70\n");
    }

    public static void main(String[] args) {
        Uc4 list = new Uc4();

        list.add(56);
        list.add(70);
        list.insert(30,2);
        list.display();

    }
}
