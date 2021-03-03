public class kubus {
     public double sisi;
    double r;
    
    public kubus(double s){
        sisi = s;
    }
    
    double volume(){
        double volum = sisi*sisi*sisi;
        return volum;
    }
    
    double luasAlas(){
        double luasAlas = 6*sisi*sisi;
        return luasAlas;
    }
}

