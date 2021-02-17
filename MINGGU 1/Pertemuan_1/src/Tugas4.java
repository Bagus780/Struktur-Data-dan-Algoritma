import java.util.Scanner;
public class Tugas4 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        menu();
    }

    static void menu() {
        int pilihan;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Menu");
            System.out.println("1.Luas Segitiga");
            System.out.println("2.Luas Persegi");
            System.out.println("3.Luas Lingkaran");
            System.out.print("Masukkan Pilihan : ");
            pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                    luasSegitiga();
                    break;
                case 2:
                    luasPersegi();
                    break;
                case 3:
                    luasLingkaran();
            }
        } while (pilihan == 1);
        System.out.println();

    }

    static void luasSegitiga() {
        Scanner sc = new Scanner(System.in);
        int a, t;
        double luas;

        System.out.print("Masukan Alas : ");
        a = sc.nextInt();
        System.out.print("Masukan Tinggi : ");
        t = sc.nextInt();
        luas = 0.5 * a * t;
        System.out.println("Luas Segitiga : " + luas);
    }

    static void luasPersegi() {
        Scanner sc = new Scanner(System.in);
        int panjang, lebar, luas;

        System.out.println("PROGRAM JAVA MENGHITUNG LUAS PERSEGI PANJANG : ");
        System.out.println("-----------------------------------------------");
        System.out.print("Masukan Panjang : ");
        panjang = sc.nextInt();
        System.out.print("Masukan Lebar : ");
        lebar = sc.nextInt();

        luas = panjang * lebar;
        System.out.println("Luas Persegi Panjang : " + luas);
    }

    static void luasLingkaran() {
        //Inisialisasi objek input dari class scanner
        Scanner input = new Scanner(System.in);
        //Deklarasi variabel
        double luas, phi = 3.14;
        int r;
        //Input nilai jari-jari
        System.out.print("Masukan Jari-jari : ");
        r = input.nextInt();
        //Menghitung luas lingkaran
        luas = phi * r * r;
        //Tampilkan hasil
        System.out.println("Luas Lingkaran = " + luas);
    }
}

