/**********************************************************************************************************************************************************************
 *
 *  Ability to create Ordered Linked List in ascending order of data entered in following sequence 56, 30, 40, and 70
 * - Refactor the code to create SortedLinkedList Class
 * - Create Node that takes data that is Comparable
 * - Perform Sorting during the add method call
 * - Final Sequence: 30->40->56->70
 *
 *  @author : Immanuvel Jeeva
 *  @Since  : 24-07-2021
 *
 *********************************************************************************************************************************************************************/
package com.company;

public class Uc10 {
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

    // Sort the LinkedList
    public void sortList() {
        Node current = head, temp = null;
        int index;
        if (head == null) {
            System.out.println("LinkedList is Empty");
        }
        else {
            while (current != null) {
                temp = current.next;

                while (temp != null) {
                    if (current.data > temp.data) {
                        index = current.data;
                        current.data = temp.data;
                        temp.data = index;
                    }
                    temp = temp.next;
                }
                current = current.next;
            }
        }
    }

    public static void main(String[] args) {
        Uc10 uc10 = new Uc10();
        uc10.add(56);
        uc10.add(30);
        uc10.add(40);
        uc10.add(70);
        uc10.sortList();
        uc10.display();
    }
}
