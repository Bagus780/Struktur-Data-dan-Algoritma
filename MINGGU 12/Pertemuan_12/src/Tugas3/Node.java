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
public class Node {

    int data, no;
    String nama;
    Node prev;
    Node next;

    Node(Node prev, int no, String nama, Node next) {
        this.prev = prev;
        this.data = data;
        this.next = next;
        this.no = no;
        this.nama = nama;
    }
}
