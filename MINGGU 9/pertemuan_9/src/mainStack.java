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
public class mainStack {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack st = new Stack(8);
        int menu;
        char pilih;
        do {
            System.out.println("=========Menu=======");
            System.out.println("1. Push data");
            System.out.println("2. Pop data");
            System.out.println("3. Peek data");
            System.out.println("4. Print data");
            System.out.println("=========Menu=======");
            System.out.print("Masukkan Pilihan (1-4) : ");
            menu = sc.nextInt();
            switch (menu) {
                case 1:
                    System.out.print("nomor Transaksi : ");
                    String nomorTransaksi = sc.next();
                    System.out.print("Tanggal : ");
                    String Tanggal = sc.next();
                    System.out.print("Jumlah Barang : ");
                    int jumlahBarang = sc.nextInt();
                    System.out.print("Total Harga : ");
                    int totalHarga = sc.nextInt();
                    Struk stu = new Struk(nomorTransaksi, Tanggal, jumlahBarang, totalHarga);
                    st.push(stu);
                    break;
                case 2:
                    st.pop();
                    break;
                case 3:
                    st.peek();
                    break;
                case 4:
                    st.print();
                    break;
            }
            System.out.println("Apakah Anda ingin Kembali ke Menu (y/n)? ");
            pilih = sc.next().charAt(0);
            sc.nextLine();
        } while (pilih == 'y');
    }
}
