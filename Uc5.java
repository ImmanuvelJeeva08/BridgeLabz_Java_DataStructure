/**********************************************************************************************************************************************************************
 *
 *  Ability to delete the first element in the LinkedList of sequence 56->30->70
 *  Write pop method
 *  Note there is new head
 *  Final Sequence: 30->70
 *
 *  @author : Immanuvel Jeeva
 *  @Since  : 24-07-2021
 *
 *********************************************************************************************************************************************************************/
package com.company;

public class Uc5 {

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

    // Adding new Node with values
    public void add(int datas){
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

    // Display the Node with value
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

    // Deleting the FirstNode with Value
    public void pop(){
        Node current = head;
        if(current == head){
            head = head.next;
            current = head;
        }
    }

    public static void main(String[] args) {
        Uc5 list = new Uc5();

        list.add(70);
        list.add(30);
        list.add(56);
        list.display();
        list.pop();
        list.display();
    }
}
