/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class DoubleLinkedListMain {

    static int index;

    public static void menu() throws Exception {
        int data = 0;
        System.out.println("===================================================");
        System.out.println("PROGRAM PENGOLAHAN ANGKA DENGAN DOUBLE LINKED LIST");
        System.out.println("===================================================");
        System.out.println("1. Tambah Head");
        System.out.println("2. Tambah Tail");
        System.out.println("3. Tambah Data");
        System.out.println("4. Hapus Data Pertama");
        System.out.println("5. Hapus Data Tertntu");
        System.out.println("6. Hapus Data Terahir");
        System.out.println("7. Cetak");
        System.out.println("8. Cari");
        System.out.println("9. urut Data");
        System.out.println("10. Keluar");
        System.out.println("");
        System.out.print("Pilih Data :  ");

    }

    public static void main(String[] args) throws Exception {
        DoubleLinkedList dll = new DoubleLinkedList();
        Scanner sc = new Scanner(System.in);
        int menu = 0;
        int data;
        int index;

        while (menu != 10) {
            menu();

            menu = sc.nextInt();
            System.out.println("=====================================");

            try {
                if (menu == 1) {
                    System.out.print("Masukkan Data Head : ");
                    data = sc.nextInt();
                    dll.addFirst(data);
                } else if (menu == 2) {
                    System.out.print("Masukkan Data Tail : ");
                    data = sc.nextInt();
                    dll.addLast(data);
                } else if (menu == 3) {
                    System.out.print("Masukkan Data : ");
                    data = sc.nextInt();
                    System.out.print("Masukkan Data pada Index ke- : ");
                    index = sc.nextInt();
                    dll.add(data, index);
                } else if (menu == 4) {
                    dll.removeFirst();
                } else if (menu == 5) {
                    dll.removeLast();
                } else if (menu == 6) {
                    System.out.print("Masukkan data yang ingin dihapus di index ke-: ");
                    index = sc.nextInt();
                    dll.remove(index);
                } else if (menu == 7) {
                    dll.print();
                    System.out.println("Size : " + dll.size);
                } else if (menu == 8) {
                    System.out.print("Masukkan data yang Dicari : ");
                    data = sc.nextInt();
                    dll.cari(data);
                } else if (menu == 9) {
                    dll.sort();
                    dll.print();
                } else {
                    System.out.println("Keluar");
                }
                System.out.println();
            } catch (Exception e) {

            }
        }
    }
}
