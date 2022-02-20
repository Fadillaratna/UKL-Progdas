package ukl;

import java.util.Scanner;

public class ukl3 {

    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
       int id [] = {1, 2, 3, 4};
       String nama [] = {"Galuh", "Indro", "Jedi", "Kenu"};
       int golongan [] = {1, 3, 2, 3};
        String alamat [] = {"Sawojajar", "Kedung Kandang", "Ijen", "Dinoyo"};
        int ketGol = 0;
        int tarif = 0;
        
        System.out.print("Input ID Pelanggan : ");
        int inputID  = a.nextInt();
        
        System.out.print("Input Pemakaian Listrik (kWh) : ");
        int pemakaian = a.nextInt();
        
        switch(golongan[inputID-1]){
            case 1:
                ketGol = 450;
                tarif = 1000;
            break;
            
            case 2:
                ketGol = 1300;
                tarif = 1300;
           break;
           
            case 3:
                ketGol = 2200;
                tarif = 1500;
        }
        
        int pembayaran;
        pembayaran = pemakaian * tarif  + 13000;
        
        if(pembayaran < 50000){
            pembayaran = 50000;
        }
        
        
        System.out.println("\n ============ Print Tagihan Listrik =====================");
        System.out.println("ID Pelanggan : " + inputID);
        System.out.println("Nama Pelanggan : " + nama[inputID-1]);
        System.out.println("Alamat : "  + alamat [inputID-1]);
        System.out.println("Golongan : " + golongan[inputID-1]);
        System.out.println("Keterangan Golongan Listrik : " + ketGol +" VA");
        System.out.println("Pemakaian Listrik : " + pemakaian + "kWh");
        System.out.println("Tarif Listrik : Rp" + tarif + ",-/kwh");
        System.out.println("Pembayaran : Rp" + pembayaran + ",-");
       
    }
    
}
