/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j07;

/**
 *
 * @author ASUS
 */
import java.util.Scanner;
public class SaranBahan2Resep {
    public static void main(String[] args) {
        String identitas = "nama lengkap / kelas / no";
        System.out.println("Identitas : " + identitas);
        
        System.out.print("\nSaran Resep dari Bahan Milik Anda\n");
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Bahan pertama: ");
        System.out.println("1. Pisang");
        System.out.println("2. Telur");
        System.out.println("Masukkan no pilihan anda :");
        int bahan1 = scanner.nextInt();
        
        if(bahan1 == 1 || bahan1 == 2)
        {
            System.out.println("Bahan Kedua: ");
            if(bahan1 == 1) {
                System.out.println("1. Susu");
                System.out.println("2. Minyak Goreng");
                System.out.println("3. Tidak ada");
            } else{
                System.out.println("1. Minyak goreng");
                System.out.println("2. Roti");
                System.out.println("3. Tidak ada");
            }
            System.out.print("Masukkan no pilihan Anda :");
            
        }else 
            System.out.println("Mohon Maaf, pilihan tidak ditemukan, " 
                    + "tidak dapat memberikan saran resep");
        
        int bahan2 = scanner.nextInt();
        if(bahan2 >= 1 && bahan2 <= 3) 
        {
            if(bahan1==1)
                switch(bahan2)
                {
                    case 1: System.out.println(
                            "Anda dapat membuat milk shake banana"); break;
                    case 2: System.out.println(
                            "Anda dapat membuat pisang goreng"); break;
                    case 3: System.out.println(
                            "Anda dapat membuat pisang rebus"); break;
                }
            else
                switch(bahan2)
                {
                    case 1: System.out.println(
                            "Anda dapat membuat telur mata sapi"); break;
                    case 2: System.out.println(
                            "Anda dapat membuat sandwich telur"); break;
                    case 3: System.out.println(
                            "Anda dapat membuat telur rebus"); break;
                }
        }else
            System.out.println("Mohon Maaf, pilihan tidak ditemukan, "
                + "tidak dapat memberikan saran resep");
               
                                    
                                    
            
        }
    }

    
    

