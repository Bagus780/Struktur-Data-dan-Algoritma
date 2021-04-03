/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pil;
        boolean kondisi = true;

        hn.inputDataRekening();
        hn.inputDataTransaksi();

        System.out.println("---------- Sistem Perbankan UTS ----------");
        System.out.println("--------------- Semester II --------------");
        do {
            System.out.println("Menu Utama : ");
            System.out.println("1. Tampilkan Data Rekening");
            System.out.println("2. Tampilkan Data Transaksi");
            System.out.println("3. Mencari Saldo > 500000");
            System.out.println("4. Sorting by Name");
            System.out.println("5. Keluar");
            System.out.print("Masukkan Pilihan anda : ");
            pil = sc.nextInt();
            System.out.println();
            switch (pil) {
                case 1:
                    System.out.println("Nomer Rekening \t Nama \t Nama Ibu \t Phone \t\t Email");
                    hn.tampilRekening();
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Nomer Rekening \t Saldo \t\t Saldo Awal \t Saldo Akhir \t Tanggal Transaksi");
                    hn.tampilTransaksi();
                    System.out.println();
                    break;
                case 3:
                    System.out.println("Nomer Rekening \t Saldo \t\t Saldo Awal \t Saldo Akhir \t Tanggal Transaksi");
                    hn.tampilLebihDari();
                    System.out.println();
                    break;
                case 4:
                    System.out.println("Nomer Rekening \t Nama \t Nama Ibu \t Phone \t\t Email");
                    hn.sortByName();
                    hn.tampilRekening();
                    System.out.println();
                    break;
                case 5:
                    kondisi = false;
                    System.out.println();
                    break;
                default:
                    System.out.println("Data yang anda masukkan salah!");
                    break;
            }
        } while (kondisi);
    }

    private static class hn {

        public hn() {
            
        }
    }
}
