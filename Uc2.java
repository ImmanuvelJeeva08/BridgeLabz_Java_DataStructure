/**********************************************************************************************************************************************************************
 *
 * Ability to create Linked List by adding 30 and 56 to 70
 * - Node with data 70 is First Created
 * - Next 30 is added to 70
 * - Finally 56 is added to 30
 * - LinkedList Sequence: 56->30->70
 *
 *  @author : Immanuvel Jeeva
 *  @Since  : 24-07-2021
 *
 *********************************************************************************************************************************************************************/
package com.company;

public class Uc2 {

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
    public static void main(String[] args) {
        Uc2 list = new Uc2();

        list.add(70);
        list.add(30);
        list.add(56);
        list.display();

    }
}
