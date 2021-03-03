
public class Lingkaran {
    double jari, phi = 3.14;

    double hitungLuas(){
        double luas = phi * (jari * jari);
        return luas;
    }

    double hitungKeliling(){
        double keliling = 2 * (phi * jari);
        return keliling;
    }

    public static void main(String[] args) {
        Lingkaran lingkaran = new Lingkaran();
        lingkaran.jari = 4;

        System.out.println("Jari-jari          = " + lingkaran.jari);
        System.out.println("Luas Lingkaran     = " + lingkaran.hitungLuas());
        System.out.println("Keliling Lingkaran = " + lingkaran.hitungKeliling());
    }
} 

