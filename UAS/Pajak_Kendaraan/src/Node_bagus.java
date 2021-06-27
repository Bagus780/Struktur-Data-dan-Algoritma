/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Node_bagus {

    Kendaraan_bagus data1;
    Pajak_bagus data2;
    Node_bagus prev;
    Node_bagus next;

    Node_bagus(Node_bagus prev, Kendaraan_bagus data1, Pajak_bagus data2, Node_bagus next) {
        this.prev = prev;
        this.data1 = data1;
        this.data2 = data2;
        this.next = next;
    }
}
