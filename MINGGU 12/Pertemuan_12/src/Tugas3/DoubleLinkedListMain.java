/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas3;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class DoubleLinkedListMain {

    public static void menu() {

        System.out.println("=============================");
        System.out.println("PENGANTRI VAKSIIN EXTRAVAGANZA");
        System.out.println("==============================");
        System.out.println("1. Tambah Data Penerima Vaksin");
        System.out.println("2. Hapus Data Pengantri Vaksin");
        System.out.println("3. Daftar Penerima Vaksin");
        System.out.println("4. Keluar");
        System.out.println("-------------------------------");
    }

    public static void main(String[] args) throws Exception {
        DoubleLinkedList dll = new DoubleLinkedList();
        Scanner sc = new Scanner(System.in);
        int menu;
        String nama;
        int no;

        do {
            menu();
            System.out.print("Pilih Data :  ");
            menu = sc.nextInt();

            switch (menu) {
                case 1:
                    System.out.println("-----------------------------");
                    System.out.println("Masukkan Data Penerima Vaksin");
                    System.out.println("-----------------------------");
                    System.out.print("Nomor Antrian : ");
                    no = sc.nextInt();
                    System.out.print("Nama Antrian : ");
                    nama = sc.next();
                    dll.Enqueue(no, nama);
                    System.out.println("-------------------");
                    dll.print();
                    break;
                case 2:
                    dll.Dequeue();
                    dll.print();
                    break;
                case 3:
                    dll.print();
                    break;
                case 4:
                    break;
            }
            System.out.print("Apakah anda ingin kembali ke menu (y/n) : ");
            menu = sc.next().charAt(0);
            sc.nextLine();
            System.out.println("");
        } while (menu == 'y');
    }
}
