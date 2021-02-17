
import java.util.Scanner;


public class Tugas2 {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int saldoAwal = 1000000;
        int targetSaldo = 1500000;
        int totalSaldo = saldoAwal;
        int bulan = 0;
        for(int i=0; totalSaldo <= targetSaldo; i++){
            totalSaldo = totalSaldo + (totalSaldo*2/100);
            bulan++;
        }
        System.out.println("=======================================================");
        System.out.println("saldo Awal :"+saldoAwal);
        System.out.println("Bunga Setiap bulan : 2%");
        System.out.println("Saldo akan mencapai 1500000 pada Bulang ke :"+bulan);
        System.out.println("Saldo Akhir :"+totalSaldo);
        
        System.out.println("=======================================================");
    }
}
