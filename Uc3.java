/**********************************************************************************************************************************************************************
 *
 *  Ability to create Linked List by appending 30 and 70 to 56
 * - Node with data 56 is First Created
 * - Next Append 30 to 56
 * - Finally Append 70 to 30
 * - LinkedList Sequence: 56->30->70
 *
 *  @author : Immanuvel Jeeva
 *  @Since  : 24-07-2021
 *
 *********************************************************************************************************************************************************************/
package com.company;

public class Uc3 {

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
        Node newNode = new Uc3.Node(datas);
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

    public static void main(String[] args) {
        Uc3 list = new Uc3();

        list.add(56);
        list.add(30);
        list.add(70);
        list.display();

    }
}
