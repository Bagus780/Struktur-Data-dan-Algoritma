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

public class mainPraktikum1Dan2Dan3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner scString = new Scanner(System.in);
        System.out.println("=====================================================");
        System.out.print("Masukkan jumlah mahasiswa : ");
        int jmlMahasiswa = sc.nextInt();
        praktikum1Dan2Dan3[] na = new praktikum1Dan2Dan3[jmlMahasiswa];
        for (int i = 0; i < jmlMahasiswa; i++) {
            na[i] = new praktikum1Dan2Dan3();
            System.out.print("Masukkan nama mahassiswa ke-" + (i + 1) + " : ");
            na[i].namaMhs = scString.nextLine();
            System.out.print("Masukkan nilai Tugas mahasiswa ke-" + (i + 1) + " : ");
            na[i].nilaiTugas = sc.nextInt();
            System.out.print("Masukkan nilai Kuis mahasiswa ke-" + (i + 1) + " : ");
            na[i].nilaiKuis = sc.nextInt();
            System.out.print("Masukkan nilai UTS mahasiswa ke-" + (i + 1) + " : ");
            na[i].nilaiUTS = sc.nextInt();
            System.out.print("Masukkan nilai UAS mahasiswa ke-" + (i + 1) + " : ");
            na[i].nilaiUAS = sc.nextInt();
        }
        double Arr[] = new double[jmlMahasiswa];
        for (int i = 0; i < jmlMahasiswa; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1) + " dengan nama " + na[i].namaMhs + " = " + na[i].hitungTotalNilai());
            Arr[i] = na[i].hitungTotalNilai();
        }
        na[0] = new praktikum1Dan2Dan3();
        System.out.println("Rata-rata nilai total seluruh mahasiswa : " + na[0].rata2(Arr, jmlMahasiswa));
    }

}
