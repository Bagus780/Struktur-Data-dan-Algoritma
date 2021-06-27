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
public class Nilai {

    String kodenilai;
    String kodematkul;
    String nimmhs;
    Float nilai;

    //membuat konstruktor default

    public Nilai() {
    }

    //membuat konstruktor berparameter

    Nilai(String kodenilai, float nilai, String kodematkul, String nimmhs) {
        this.kodenilai = kodenilai;
        this.nilai = nilai;
        this.kodematkul = kodematkul;
        this.nimmhs = nimmhs;
    }

}
