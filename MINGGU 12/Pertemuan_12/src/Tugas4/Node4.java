/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas4;

/**
 *
 * @author ASUS
 */
public class Node4 {

    Mahasiswa data;
    Node4 prev, next;

    Node4(Node4 prev, Mahasiswa dt, Node4 next) {
        this.prev = prev;
        data = dt;
        this.next = next;
    }
}
