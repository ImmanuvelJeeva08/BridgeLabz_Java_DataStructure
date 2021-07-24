/*********************************************************************************************************************************************************************
 *
 *  Ability to insert 40 after 30 to the Linked List sequence of 56->30->70
 * - Write Junit Test Case as demonstrated in class
 * - Search LinkedList to get Node with key value 30
 * - Then Insert 40 to 30
 * - Final Sequence: 56->30->40->70
 *
 *  @author : Immanuvel Jeeva
 *  @Since  : 24-07-2021
 *
 ********************************************************************************************************************************************************************/
package com.company;

public class Uc8 {
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

    // Insert the newNode With given index
    public void insert(int c){
        Node newNode = new Node(c);
        Node temp = head;
        boolean b = true;
        while(b) {
            if(temp.data == 30){
                newNode.next = temp.next;
                temp.next=newNode;
                break;
            }
            temp = temp.next;
            b =true;
        }
    }

    // Display the allNodes with value
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
        Uc8 uc8 = new Uc8();

        uc8.add(56);
        uc8.add(30);
        uc8.add(70);
        uc8.insert(40);

        uc8.display();
    }
}
