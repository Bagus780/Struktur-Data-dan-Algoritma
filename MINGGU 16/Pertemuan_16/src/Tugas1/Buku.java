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
public class Buku {

    String Isbn;
    String Judul;
    String Terbit;
    String Penerbit;

    public Buku(String Isbn, String Judul, String Terbit, String Penerbit) {
        this.Isbn = Isbn;
        this.Judul = Judul;
        this.Terbit = Terbit;
        this.Penerbit = Penerbit;
    }

    @Override
    public String toString() {
        return "Buku{" + "Isbn=" + Isbn + ", Judul=" + Judul + ", Terbit=" + Terbit + ", Penerbit="
                + Penerbit + '}';
    }
}
