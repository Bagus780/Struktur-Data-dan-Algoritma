
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        balok[] arrayBalok = new balok[1];
        tabung[] arrayTabung = new tabung[1];
        kubus[] arrayKubus = new kubus[1];

        for (int i = 0; i < 1; i++) {

            while (i < 1) {
                System.out.println("BALOK");
                System.out.print("Input Panjang  = ");
                arrayBalok[i].panjang = sc.nextDouble();
                System.out.print("Input Lebar    = ");
                arrayBalok[i].lebar = sc.nextDouble();
                System.out.print("Input Tinggi   = ");
                arrayBalok[i].tinggi = sc.nextDouble();

                System.out.println("KUBUS");
                System.out.print("Input Sisi = ");
                arrayKubus[i].sisi = sc.nextDouble();

                System.out.println("TABUNG");
                System.out.print("Input Jari-jari = ");
                arrayTabung[i].r = sc.nextDouble();
                i++;
            }

            while (i < 1) {
                System.out.println("BALOK");
                System.out.println("Volume  : " + arrayBalok[i].volume());
                System.out.println("Luas Alas  : " + arrayBalok[i].luasAlas());

                System.out.println("KUBUS");
                System.out.println("Volume  : " + arrayKubus[i].volume());
                System.out.println("Luas Alas  : " + arrayKubus[i].luasAlas());

                System.out.println("TABUNG");
                System.out.println("Volume  : " + arrayTabung[i].volume());
                System.out.println("Luas Alas  : " + arrayTabung[i].luasAlas());
                i++;
            }

            while (i < 1) {
                System.out.println("BALOK");
                System.out.println("Panjang : " + arrayBalok[i].tinggi);
                System.out.println("Lebar   : " + arrayBalok[i].tinggi);
                System.out.println("Tinggi  : " + arrayBalok[i].tinggi);
                System.out.println("Volume  : " + arrayBalok[i].tinggi);
                System.out.println("Luas Permukaan  : " + arrayBalok[i].tinggi);
                System.out.println("-------------------------");

                System.out.println("-------------------------");
                System.out.println("Volume  : " + arrayBalok[i].volume());
                System.out.println("Luas Alas  : " + arrayBalok[i].luasAlas());

                System.out.println("KUBUS");
                System.out.println("Sisi : " + arrayKubus[i].sisi);
                System.out.println("Volume  : " + arrayKubus[i].sisi);
                System.out.println("Luas Permukaan  : " + arrayKubus[i].sisi);
                System.out.println("-------------------------");

                System.out.println("-------------------------");
                System.out.println("Volume  : " + arrayKubus[i].volume());
                System.out.println("Luas Alas  : " + arrayKubus[i].luasAlas());

                System.out.println("TABUNG");
                System.out.println("Jari Jari : " + arrayTabung[i].r);
                System.out.println("Tinggi   : " + arrayTabung[i].t);
                System.out.println("Volume  : " + arrayTabung[i].volume());
                System.out.println("Luas Permukaan  : " + arrayTabung[i].luasPermukaan());
                System.out.println("-------------------------");
                System.out.println("Volume  : " + arrayTabung[i].volume());
                System.out.println("Luas Alas  : " + arrayTabung[i].luasAlas());
                i++;
            }
        }
    }
}
