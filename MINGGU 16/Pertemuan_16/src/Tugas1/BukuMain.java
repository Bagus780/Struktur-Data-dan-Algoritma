/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
import java.util.Stack;

public class BukuMain {

    public static void main(String[] args) {
        Scanner ran = new Scanner(System.in);
        Stack<Buku> BukuStack = new Stack<>();
        Buku buku;
        int pilih;
        do {
            System.out.println("======Daftar Buku Perpustakaan======");
            System.out.println("1. Entry Judul Buku");
            System.out.println("2. Ambil Buku Teratas");
            System.out.println("3. Cek Buku Teratas");
            System.out.println("4. Info Semua Judul Buku");
            System.out.println("5. Keluar");
            System.out.println("====================================");
            System.out.print("Pilih : ");
            pilih = ran.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("Masukkan Isbn Buku : ");
                    String Isbn = ran.next();
                    System.out.print("Masukkan Judul Buku : ");
                    String Judul = ran.next();
                    System.out.print("Masukkan Tahun Terbit : ");
                    String Terbit = ran.next();
                    System.out.print("Masukkan Penerbit : ");
                    String Penerbit = ran.next();
                    buku = new Buku(Isbn, Judul, Terbit, Penerbit);
                    BukuStack.push(buku);
                    break;
                case 2:
                    System.out.printf("Buku{isbn : %s,judul : %s,terbit : %s,penerbit : %s}\n",
                            BukuStack.peek().Isbn, BukuStack.peek().Judul,
                            BukuStack.peek().Terbit, BukuStack.peek().Penerbit);
                    BukuStack.pop();
                    break;
                case 3:
                    System.out.printf("Buku{isbn : %s,judul : %s,terbit : %s,penerbit : %s}\n",
                            BukuStack.peek().Isbn, BukuStack.peek().Judul,
                            BukuStack.peek().Terbit, BukuStack.peek().Penerbit);
                case 4:
                    BukuStack.forEach(e -> System.out.printf("Buku{isbn : %s,judul : %s,terbit :%s,penerbit:%}\n", e.Isbn, e.Judul, e.Terbit, e.Penerbit));
                    break;
            }
        } while (pilih >= 1 && pilih
                <= 4);
    }

}
