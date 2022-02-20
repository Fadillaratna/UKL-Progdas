package ukl;

public class ukl2 {

    public static void main(String[] args) {
        int mA1 [] [] = {{1, 2, 3}, {4, 5, 6}};
        int mA2 [] [] = {{2, 4, 6, 8, 9}, {1, 2, 3, 4, 5}};
        int mA [] [] = {{1,2}, {3, 4}};
        
        int hasilKali [] []= new int [mA1.length][mA2[0].length];
        
        for(int a = 0; a < mA1.length; a++){
            for(int b = 0; b < mA2[0].length; b++){
                for(int c = 0; c < mA.length; c++){
                    hasilKali [a][b] += mA1[a][c] * mA2[c][b] * mA[a][c] ;
                }
                System.out.print(hasilKali[a][b]+"\t");
            }
            
                System.out.println("");
        }
        
        
    }
    
}
