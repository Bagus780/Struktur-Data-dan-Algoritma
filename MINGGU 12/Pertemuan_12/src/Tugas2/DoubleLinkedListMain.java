/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas2;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class DoubleLinkedListMain {

    static int index;
    static String keluar;
    int data = 0;

    public static void menu() {

        System.out.println("====================================");
        System.out.println("Data Buku Perpusatakaan");
        System.out.println("====================================");
        System.out.println("1. Entry Judul Buku");
        System.out.println("2. Ambil Buku Teratas");
        System.out.println("3. Cek Judul Buku Teratas");
        System.out.println("4. Info Semua Judul Buku");
        System.out.println("5. Keluar");
        System.out.println("");

    }

    public static void main(String[] args) throws Exception {
        DoubleLinkedList dll = new DoubleLinkedList();
        Scanner sc = new Scanner(System.in);
        int menu;
        int data;
        int index;
        char akhir;

        do {
            menu();
            System.out.print("Pilih Data :  ");
            menu = sc.nextInt();
            switch (menu) {
                case 1:
                    if (menu == 1) {

                        sc.nextLine();
                        System.out.println("-------------------");
                        System.out.print("Masukkan Judul Buku : ");

                        String namajudul = sc.nextLine();
                        dll.push(namajudul);
                    }
                    break;
                case 2:
                    if (menu == 2) {
                        if (dll.isEmpty()) {
                            System.out.println("Linked List Masih Kosong");
                        } else {
                            dll.removeFirst();
                            menu();
                            System.out.print("Pilih Data :  ");
                            menu = sc.nextInt();
                            break;

                        }
                    }
                case 3:

                    if (menu == 3) {
                        if (dll.isEmpty()) {
                            System.out.println("Linked List Masih Kosong");
                        } else {
                            System.out.println("DJudul Buku Teratas : " + dll.dataatas());
                            menu();
                            System.out.print("Pilih Data :  ");
                            menu = sc.nextInt();
                        }
                        break;
                    }
                case 4:
                    if (menu == 4) {
                        dll.print();
                        menu();
                        System.out.print("Pilih Data :  ");
                        menu = sc.nextInt();
                        break;
                    }

                case 5:
                    System.exit(0);
            }
            System.out.print("Apakah anda ingin kembali ke menu (y/n) :  ");
            menu = sc.next().charAt(0);
            sc.nextLine();
            System.out.println("");
        } while (menu == 'y');
    }
}
