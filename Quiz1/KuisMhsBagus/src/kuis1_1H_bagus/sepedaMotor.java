package kuis1_1H_bagus;

public class sepedaMotor {

    public String merk;
    public int kecepatanMotor;
    public boolean kontakMotor = false;

    sepedaMotor() {
        
    }

    sepedaMotor(String merk) {
        this.merk = merk;
    }

    void nyalakanMotor(boolean kontak) {
        kontakMotor = kontak;
    }

    void matikanMotor(boolean kontak) {
        kontakMotor = kontak;
    }

    void tambahKecepatanMotor(int kec) {
        this.kecepatanMotor += kec;
    }

    void kurangiKecepatanMotor(int kec) {

        this.kecepatanMotor -= kec;
    }

    void info() {

        System.out.println("KECEPATAN : " + kecepatanMotor);
    }
}

