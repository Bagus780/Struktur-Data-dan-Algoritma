
import java.util.Scanner;

public class main_mhsw {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mahasiswa[] mhsw = new Mahasiswa[4];
        for (int i = 1; i < 4; i++) {
            mhsw[i] = new Mahasiswa();
            System.out.println("Mahasiswa ke-" + i);
            System.out.println("Masukkan nama   : ");
            mhsw[i].nama = sc.next();
            System.out.println("Masukkan NIM   : ");
            mhsw[i].NIM = sc.nextInt();
            System.out.println("Masukkan Jenis Kelamin   : ");
            mhsw[i].jenisKelamin = sc.next().charAt(0);
            System.out.println("Masukkan nilai IPK   : ");
            mhsw[i].ipk = sc.nextDouble();
            System.out.println("");
        }
        for (int i=1;i<=3;i++){
            System.out.print("Data Mahasiswa ke " +i);
            System.out.print("\nNama        : " + mhsw[i].nama);
            System.out.print("\nNIM        : " + mhsw[i].NIM);
            System.out.println("Jenis Kelamin: " + mhsw[i].jenisKelamin);
            System.out.println("Nilai IPK   ; " + mhsw[i].ipk);
        }
    }

}
