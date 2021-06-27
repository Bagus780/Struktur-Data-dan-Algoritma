/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class LinkedList_bagus {
    Node_bagus head;
    int size;
    Kendaraan_bagus data1[];
    Pajak_bagus data2[];
                    
    public LinkedList_bagus() {
        head = null;
        size = 0;
    }
    
    public boolean isEmpty_bagus() {
        return head == null;
    }
    
    public void addFirst_bagus(Kendaraan_bagus data1, Pajak_bagus data2) {
        if (isEmpty_bagus()) {
            head = new Node_bagus(null, data1, data2, null);
        } else {
            Node_bagus newNode = new Node_bagus(null, data1, data2, head);
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }
    

    public void removeLast_bagus() throws Exception {
        if (isEmpty_bagus()) {
            throw new Exception("Linked List Masih Kosong");
        } else if (head.next == null) {
            head = null;
            size--;
            System.out.println("Node berhasil di hapus");
            return;
        }
      
    }
    
    public void printKendaraan_bagus() {
        if (!isEmpty_bagus()) {
            Node_bagus tmp = head;
            while (tmp != null) {
                System.out.println("| "+tmp.data1.TNKB + "\t| " + tmp.data1.nama+"\t| " + tmp.data1.jenis +"\t| " + tmp.data1.cc +"\t| " + tmp.data1.tahun +"\t| " + tmp.data1.bulanBayar +"\t| ");
                tmp = tmp.next;
            }
            System.out.println();
        } else {
            System.out.println("Linked List Kosong");
        }
    }
    
    public void printPajak_bagus() {
        if (!isEmpty_bagus()) {
            Node_bagus tmp = head;
            while (tmp != null) {
                System.out.println("| "+tmp.data2.kode + "\t| " + tmp.data2.nominal+"\t| " + tmp.data2.denda +"\t| " + tmp.data2.blnBayar);
                tmp = tmp.next;
            }
            System.out.println();
        } else {
            System.out.println("Linked List Kosong");
        }
    }
}
