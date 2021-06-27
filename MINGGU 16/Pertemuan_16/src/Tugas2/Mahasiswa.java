/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas2;

/**
 *
 * @author ASUS
 */
public class Mahasiswa {

    String nim;
    String nama;
    String no_telp;

    // konstruktor default
    public Mahasiswa() {
    }

    // konstruktor berparameter
    public Mahasiswa(String nim, String nama, String no_telp) {
        this.nim = nim;
        this.nama = nama;
        this.no_telp = no_telp;
    }

    @Override
    public String toString() {
        return "Nim{" + "nim=" + nim + ", nim=" + nim + ", Nama=" + nama + ", telf=" + no_telp + '}';
    }
}

