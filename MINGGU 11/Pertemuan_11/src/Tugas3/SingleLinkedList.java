/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas3;

/**
 *
 * @author ASUS
 */
public class SingleLinkedList {

    Node head;
    Node tail;

    public boolean isEmpty() {
        return head == null;
    }

    public void print() {
        if (!isEmpty()) {
            Node tmp = head;
            System.out.println("=================================");
            System.out.println("Isi Linked List:");
            while (tmp != null) {
                System.out.println(tmp.data + "\t");
                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("Linked List Kosong");
        }
    }

    public void push(String input) {
        Node ndInput = new Node(input, null);
        ndInput.data = input;
        ndInput.next = head;
        head = ndInput;
    }

    public String peek() {
        if (head == null) {
            System.out.println("Linked list kosong ! ");
            Node tmp = head;
        } else {
            String lst = head.data;
            return lst;
        }
        return null;
    }
}
