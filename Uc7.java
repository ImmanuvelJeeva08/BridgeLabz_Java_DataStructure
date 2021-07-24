/*********************************************************************************************************************************************************************
 *
 *  Ability to search LinkedList to find Node with value 30
 *
 *  Write Junit Test Case as demonstrated in class
 *  Loop through LinkedList to find node with key 30
 *
 *  @author : Immanuvel Jeeva
 *  @Since  : 24-07-2021
 *
 *********************************************************************************************************************************************************************/
package com.company;

public class Uc7 {

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

    // Search the Element
    public int search(int element) {
        if (head == null) {
            return -1;
        }
        int index = 0;
        Node temp = head;

        while (temp != null) {
            if (temp.data == element) {
                return index;
            }
            index++;
            temp = temp.next;
        }
        return -1;
    }

    public static void main(String[] args) {
        Uc7 uc7 = new Uc7();

        uc7.add(56);
        uc7.add(30);
        uc7.add(70);

        int Searchelement = 20;
        int ans = uc7.search(Searchelement);
        if (ans == -1) {
            System.out.println("Element not found in the Linked List");
        }
        else
            System.out.println("Element found in the Linked List at "+ans);
    }
}
