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
public class Node {

    String nama, alamat, nomerRek;
    Node next;

    public Node(String nama, String alamat, String nomerRek, Node berikutnya) {
        this.nama = nama;
        this.alamat = alamat;
        this.nomerRek = nomerRek;
        this.next = berikutnya;
    }

}
