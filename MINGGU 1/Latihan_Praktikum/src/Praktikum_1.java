
import java.util.Scanner;


public class Praktikum_1 {
    double phi=3.14,r;
  
    
   Scanner input = new Scanner(System.in);
    double hitungLuas(){
         System.out.print("Masukan Jari-jari : ");
        r = input.nextInt();
       
        r = phi * r * r;
       
        return r;
    }
    double hitungKeliling(){
        System.out.print("Masukan Jari-jari : ");
        phi = input.nextInt();
        // rumus lingkaran
        // 2*phi*r
        phi=2*phi*r;
        return phi;
    }
    public static void main(String[] args) {
        
    }
}
