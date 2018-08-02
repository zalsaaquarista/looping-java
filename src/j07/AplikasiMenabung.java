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
public class AplikasiMenabung {
    public static void main(String[] args) {
        
        String identitas = "nama lengkap / kelas / no";
        System.out.println("Identitas :"+ identitas);
        
        Scanner baca = new Scanner(System.in);
        String uang;
        
        System.out.println("Masukkan jenis uang: ");
        uang = baca.nextLine();
        
        if(uang.equals("koin")) {
            System.out.println("Jenis uang: Koin");
        }
        else
             System.out.print("Jenis uang: Kertas");
      
    }
}
