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
public class MainTanah {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input jumlah tanah : ");
        int n = sc.nextInt();
        Tanah[] tanahArray = new Tanah[n];

        for(int i=0;i<n;i++){
            System.out.println("TANAH ke-" + (i+1));
            System.out.print("Panjang = ");
            tanahArray[i].panjang =  sc.nextInt();
            System.out.print("Lebar   = ");
            tanahArray[i].lebar =  sc.nextInt();
        }

        for(int i=0;i<n;i++){
            System.out.println("Luas = " + tanahArray[i].luas());
        }
    }
}
