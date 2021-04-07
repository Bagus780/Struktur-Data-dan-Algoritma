/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Tiket {

    public String maskapai;
    public int harga;
    public String asal;
    public String tujuan;

    Tiket(String m, int h, String a, String t) {
        //konstruktor berparameter
        maskapai = m;
        harga = h;
        asal = a;
        tujuan = t;
    }

    void tampilAll() {
        //method
        System.out.println("Nama maskapai : " + maskapai);
        System.out.println("harga Tiket :" + harga);
        System.out.println("Asal Bandara :" + asal);
        System.out.println("Bandara yang dituju :" + tujuan);
    }
}
