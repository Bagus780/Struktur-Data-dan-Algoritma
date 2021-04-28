/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas3;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
public class SLLMain {
        public static void main(String[] args) {

        SingleLinkedList singLL = new SingleLinkedList();
        Scanner ran = new Scanner(System.in);
        System.out.print("Masukkan jumlah data : ");
        int jml = ran.nextInt();
        for (int i = 0; i < jml; i++) {
            System.out.print("Data ke- " + i + " : ");
            String data = ran.next();
            ran.nextLine();
            singLL.push(data);
        }
        singLL.print();
        System.out.println("");
        System.out.println("Data pada posisi stack (top) : " + singLL.peek());
    }

}
