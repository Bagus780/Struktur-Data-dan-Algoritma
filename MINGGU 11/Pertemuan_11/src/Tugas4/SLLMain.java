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
import java.util.Scanner;
public class SLLMain {

    public static void main(String[] args) {
        SingleLinkedList singLL = new SingleLinkedList();
        Scanner ran = new Scanner(System.in);
        char pilih;
        int pilihmenu, ulangmenu;
        do {
            System.out.println("Menu = ");
            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Peek At");
            System.out.println("5. Peek Position");
            System.out.println("6. Print");
            System.out.println("7. Keluar");
            System.out.print("Pilih Menu = ");
            pilihmenu = ran.nextInt();
            if (pilihmenu < 1 || pilihmenu > 6) {
                System.out.println("Pilin Menu 1 - 6, Pilih Menu Kembali");
            }
            while (pilihmenu < 1 || pilihmenu > 6);
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
                    singLL.push(nama, alamat, nomer);
                } while (pilih == 'y');
            } else if (pilihmenu == 2) {
                singLL.pop();
            } else if (pilihmenu == 3) {
                singLL.peek();
            } else if (pilihmenu == 4) {
                System.out.print("Masukkan Index Data yang dicari = ");
                int index = ran.nextInt();
                singLL.peekAt(index);
            } else if (pilihmenu == 5) {
                System.out.print("Masukkan Nomer Rekening Nasabah yang dicari = ");
                String cari = ran.next();
                singLL.peekPosition(cari);
            } else if (pilihmenu == 6) {
                singLL.print();
            } else {
                break;
            }
            System.out.print("Ingin Mengulang Menu ? (1 = ya / 2 = tidak) => ");
            ulangmenu = ran.nextInt();
        } while (ulangmenu == 1);
    }

}
