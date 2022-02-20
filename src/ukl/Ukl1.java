package ukl;
public class Ukl1 {
    public static void main(String[] args) {
        int sukuPertama = 16;
        int beda = 4;
        int sukuSaatIni;
        int total = 0;
        int awal = 11;
        
        for(int i =1; i <= 3; i++){
            for(int j = 3 ; j >= i; j--){
                sukuSaatIni = sukuPertama + (awal - 1) * beda;
                sukuPertama += beda;
                total += sukuSaatIni;
                System.out.print(sukuSaatIni + "\t");
            }
                System.out.println("");
        }
        
        for(int i =1; i <= 2; i++){
            for(int j = 0 ; j <= i; j++){
                sukuSaatIni = sukuPertama + (awal - 1) * beda;
                sukuPertama += beda;
                total += sukuSaatIni;
                System.out.print(sukuSaatIni + "\t");
            }
                System.out.println("");
        }
            System.out.println("Total = " + total);
    }
}
