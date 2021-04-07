/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class praktikum1Dan2Dan3 {
    String namaMhs;
    int nilaiTugas, nilaiKuis, nilaiUTS, nilaiUAS;

    double hitungTotalNilai() {
        double total;
        total = (0.3 * nilaiTugas) + (0.2 * nilaiKuis) + (0.2 * nilaiUTS) + (0.3 * nilaiUAS);
        return total;
    }

    double rata2(double arr[], int banyaknya) {
        double total = 0;
        for (int i = 0; i < banyaknya; i++) {
            total = total + arr[i];
        }
        return total / banyaknya;
    }

}
