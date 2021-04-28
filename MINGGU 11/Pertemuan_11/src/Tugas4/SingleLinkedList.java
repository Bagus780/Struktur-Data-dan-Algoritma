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
public class SingleLinkedList {

    Node head;
    Node tail;

    public boolean isEmpty() {
        return head == null;
    }

    public void print() {
        if (!isEmpty()) {
            Node tmp = head;
            int urut = 0;
            System.out.println("Isi Stack = ");
            while (tmp != null) {
                System.out.println("Nasabah ke-" + urut + " = " + tmp.nama + " " + tmp.alamat + " " + tmp.nomerRek);
                tmp = tmp.next;
                urut++;
            }
        } else {
            System.out.println("Stack Masih Kosong");
        }
    }

    public void peek() {
        if (!isEmpty()) {
            Node tmp = head;
            while (tmp != null) {
                if (tmp == tail) {
                    System.out.println("Isi Stack Teratas = \n" + tmp.nama + " " + tmp.alamat + tmp.nomerRek);
                }
                tmp = tmp.next;
            }
        } else {
            System.out.println("Stack Masih Kosong");
        }
    }

    public void push(String nama, String alamat, String nomerRek) {
        Node ndInput = new Node(nama, alamat, nomerRek, null);
        if (isEmpty()) {
            head = ndInput;
            tail = ndInput;
        } else {
            tail.next = ndInput;
            tail = ndInput;
        }
    }

    public void peekAt(int index) {
        if (isEmpty()) {
            System.out.println("Queue Masih Kosong");
        } else {
            Node tmp = head;
            for (int i = 0; i < index; i++) {
                tmp = tmp.next;
            }
            System.out.println("Data pada Index ke-" + index + " adalah " + tmp.nama + " " + tmp.nomerRek + " " + tmp.alamat);
        }
    }

    public void peekPosition(String keynomernasabah) {
        Node tmp = head;
        int index = 0;
        while (tmp != null && (!(tmp.nomerRek.equals(keynomernasabah)))) {
            tmp = tmp.next;
            index++;
        }
        if (tmp == null) {
            System.out.println("Queue Kosong");
        } else {
            System.out.println("Data " + keynomernasabah + " berada pada index ke " + index);
        }
    }

    public void pop() {
        if (isEmpty()) {
            System.out.println("Stack Masih Kosong, tidak dapat dihapus!");
        } else if (head == tail) {
            head = tail = null;
        } else {
            Node temp = head;
            while (temp.next != tail) {
                temp = temp.next;
            }
            temp.next = null;
            tail = temp;
        }
    }

    void push(String nama, String alamat, String nomer) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
