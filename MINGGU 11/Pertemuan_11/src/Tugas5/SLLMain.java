/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas5;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
public class SLLMain {

    public static void main(String[] args) {
        SingleLinkedList singLL = new SingleLinkedList();
        Scanner ran = new Scanner(System.in);
        char pilih;
        int pilihmenu, ulangmenu;
        do {
            System.out.println("Masukkan Operasi yang diinginkan");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Print");
            System.out.println("4. Peek At");
            System.out.println("5. Peek Position");
            System.out.println("6. Peek Rear");
            System.out.println("7. Peek Biasa (Peek Front)");
            System.out.println("8. Keluar");
            System.out.print("Pilih Menu = ");
            pilihmenu = ran.nextInt();
            if (pilihmenu < 1 || pilihmenu > 8) {
                System.out.println("Pilin Menu 1 - 8, Pilih Menu Kembali");
            }
            while (pilihmenu < 1 || pilihmenu > 8);
            if (pilihmenu == 1) {
                do {
                    ran.nextLine();
                    System.out.print("Nomer Nasabah = ");
                    String nomer = ran.nextLine();
                    System.out.print("Nama Nasabah = ");
                    String nama = ran.nextLine();
                    System.out.print("Alamat = ");
                    String alamat = ran.nextLine();
                    System.out.print("Apakah Anda akan menambahkan data baru ke Stack (y/n)?");
                    pilih = ran.next().charAt(0);
                    singLL.Enqueue(nama, alamat, nomer);
                } while (pilih == 'y');
            } else if (pilihmenu == 2) {
                singLL.Dequeue();
            } else if (pilihmenu == 3) {
                singLL.print();
            } else if (pilihmenu == 4) {
                System.out.print("Masukkan Index Data yang dicari = ");
                int index = ran.nextInt();
                singLL.peekAt(index);
            } else if (pilihmenu == 5) {
                System.out.print("Masukkan Nomer Rekening Nasabah yang dicari = ");
                String cari = ran.next();
                singLL.peekPosition(cari);
            } else if (pilihmenu == 6) {
                singLL.peekRear();
            } else if (pilihmenu == 7) {
                singLL.peek();
            } else {
                break;
            }
        } while (pilihmenu > 1 || pilihmenu < 8);
    }
}
