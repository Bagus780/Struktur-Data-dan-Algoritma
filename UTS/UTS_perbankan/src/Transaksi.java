/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class Transaksi {
    public double saldo,saldoAwal,saldoAkhir;
    public String tanggalTransaksi;
    
    Transaksi(double saldo, double saldoAwal,double saldoAkhir,String tanggalTransaksi){
        this.saldo = saldo;
        this.saldoAwal = saldoAwal;
        this.saldoAkhir = saldoAkhir;
        this.tanggalTransaksi = tanggalTransaksi;
    }
    void tampi(){
        System.out.println(saldo+"\t"+saldoAwal+"\t"+saldoAkhir+"\t"+tanggalTransaksi);
    }
}
