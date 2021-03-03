public class tabung {
    public double r,t;
    
    public tabung(double r){
        this.r = r;
    }
    
    double volume(){
        double v = 3.14*r*r*t;
        return v;
    }
    
    double luasAlas(){
        double l = 2*3.14*r*(r*t);
        return l;
    }

    String luasPermukaan() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
}
