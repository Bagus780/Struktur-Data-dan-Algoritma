
public class Tugas1 {
    public static void main(String[] args) {
        int tarifPerKg = 4500;
        int [] bajuMasuk = new int[4];
        bajuMasuk[0]=4;
        bajuMasuk[1]=15;
        bajuMasuk[2]=6;
        bajuMasuk[3]=11;
        
        int i=0;
        int totalHarga=0;
        for(i=0; i<4; i++){
            if(bajuMasuk[i]<=10){
                totalHarga += bajuMasuk[i]*4500;
            }else{
                totalHarga += bajuMasuk[i]*4500*5/100;
            }
        }
        System.out.println("Total pendapatan :"+totalHarga);
    }
}
