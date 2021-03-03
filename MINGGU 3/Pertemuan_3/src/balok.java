
public class balok {
    public double panjang, lebar, tinggi;
    
    public balok(double p, double l, double t){
        panjang = p;
        lebar = l;
        tinggi = t;
    }
    
    double volume(){
        double volum = panjang*lebar*tinggi;
        return volum;
    }
    
    double luasAlas(){
        double luasAlas = 2*((panjang*lebar + panjang*tinggi + lebar*tinggi));
        return luasAlas;
    }
}
