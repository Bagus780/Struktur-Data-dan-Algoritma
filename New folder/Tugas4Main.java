/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package toha;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Tugas4Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Scanner input = new Scanner(System.in);
        DoubleLinkedList dll = new DoubleLinkedList();

        char pilih = 0;
        do {
            int menu, idx;
            String nim, nama;
            double ipk;
            System.out.println("====================================");
            System.out.println("SISTEM PENGOLAHAN DATA MAHASISWA");
            System.out.println("====================================");
            System.out.println("1. Tambah Data Mahasiswa");
            System.out.println("2. Tambah Data Mahasiswa Posisi Awal");
            System.out.println("3. Tambah Data Mahasiswa Posisi Akhir");
            System.out.println("4. Hapus Data Mahasiswa");
            System.out.println("5. Hapus Data Mahasiswa Posisi Awal");
            System.out.println("6. Hapus Data Mahasiswa Posisi Akhir");
            System.out.println("7. Cetak Data Mahasiswa");
            System.out.println("8. Temukan Data Mahasiswa Urutan Pertama");
            System.out.println("9. Cari Data Mahasiswa berdasarkan NIM");
            System.out.println("10.Urutkan Data Mahasiswa berdasarkan IPK");
            System.out.println("====================================");
            System.out.print("Masukkan Pilihan Menu\t: ");
            menu = sc.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("Masukkan Data Mahasiswa");
                    System.out.print("NIM\t: ");
                    nim = input.nextLine();
                    System.out.print("Nama\t: ");
                    nama = input.nextLine();
                    System.out.print("IPK\t: ");
                    ipk = sc.nextDouble();
                    Mahasiswa d = new Mahasiswa(nim, nama, ipk);
                    System.out.print("Data Mahasiswa ini akan dimasukkan di indeks ke-");
                    idx = sc.nextInt();
                    dll.add(d, idx);
                    pilih = 'y';
                    break;
                case 2:
                    System.out.println("Masukkan Data Mahasiswa Posisi Awal : ");
                    System.out.print("NIM\t: ");
                    nim = input.nextLine();
                    System.out.print("Nama\t: ");
                    nama = input.nextLine();
                    System.out.print("IPK\t: ");
                    ipk = sc.nextDouble();
                    Mahasiswa data = new Mahasiswa(nim, nama, ipk);
                    dll.addFirst(data);
                    pilih = 'y';
                    break;
                case 3:
                    System.out.println("Masukkan Data Mahasiswa Posisi Akhir : ");
                    System.out.print("NIM\t: ");
                    nim = input.nextLine();
                    System.out.print("Nama\t: ");
                    nama = input.nextLine();
                    System.out.print("IPK\t: ");
                    ipk = sc.nextDouble();
                    Mahasiswa dt = new Mahasiswa(nim, nama, ipk);
                    dll.addLast(dt);
                    pilih = 'y';
                    break;
                case 4:
                    System.out.print("Masukkan posisi indeks : ");
                    idx = sc.nextInt();
                    dll.remove(idx);
                    pilih = 'y';
                    break;
                case 5:
                    dll.removeFirst();
                    pilih = 'y';
                    break;
                case 6:
                    dll.removeLast();
                    pilih = 'y';
                    break;
                case 7:
                    System.out.println("Cetak Data");
                    dll.print();
                    pilih = 'y';
                    break;
                case 8:
                    System.out.println("\nDATA MAHASISWA URUTAN PERTAMA: ");
                    System.out.println("==================================");
                    dll.showfirst();
                    pilih = 'y';
                    break;
                case 9:
                    System.out.println("Cari Data");
                    System.out.print("Masukkan NIM yang dicari : ");
                    nim = input.nextLine();
                    dll.cariData(nim);
                    pilih = 'y';
                break;
                case 10:
                    dll.sortLinkedList();
                    System.out.println("Data berhasil diurutkan secara descending!");
                    pilih = 'y';
                    break;
            }
        } while (pilih == 'y');
    }
}
