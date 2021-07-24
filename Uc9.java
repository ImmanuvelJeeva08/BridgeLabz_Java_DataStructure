/*********************************************************************************************************************************************************************
 *
 *  Ability to delete 40 from the Linked List sequence of 56->30->40->70 and show the size of LinkedList is 3
 * - Write Junit Test Case as demonstrated in class
 * - Search LinkedList to find node with key value 40
 * - Delete the node
 * - Implement size() and show the Linked List size is 3
 * - Final Sequence: 56->30->70
 *
 *  @author : Immanuvel Jeeva
 *  @Since  : 24-07-2021
 *
 ********************************************************************************************************************************************************************/
package com.company;

public class Uc9 {
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
            tail.next = newNode;
            tail = newNode;
        }
    }

    // Display the allNodes with value
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

    // Delete the Node With value
    public void delete(int key){
        Node prev = null;
        Node current = head;

        while (current != null) {
            if (current.data == key) {
                if (current == head) {
                    head = head.next;
                    current = head;
                } else {
                    prev.next = current.next;
                    current = current.next;
                }
            } else {
                prev = current;
                current = current.next;
            }
        }
    }

    public static void main(String[] args) {
        Uc9 uc9 = new Uc9();
        uc9.add(56);
        uc9.add(30);
        uc9.add(40);
        uc9.add(70);
        uc9.delete(40);
        uc9.display();

    }
}
