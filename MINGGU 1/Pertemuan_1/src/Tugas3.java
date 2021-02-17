
import java.util.Scanner;


public class Tugas3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan Nilai N : ");
        int n = sc.nextInt();
        for (int i = 1; i <= n * 4; i++) {
            if (i % 2 == 0) {
                if (i % 4 > 1) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
