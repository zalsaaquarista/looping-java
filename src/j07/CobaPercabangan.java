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
public class CobaPercabangan {
    public static void main(String[] args) {
        String identitas = "nama lengkap / kelas / no";
        System.out.println("Identitas : " + identitas);
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nilai a ? ");
        int a = scanner.nextInt();
        
        System.out.println("\nif.. 1");
        if(a < 5) 
            System.out.println("nilai a kurang dari 5");
        
        System.out.println("\nIF..2");
        if(a == 5)
            System.out.println("nilai a sama dengan 5");
        
        System.out.println("\nIF..3");
        if(a > 5)
            System.out.println("isi variable a : "+ a);
            System.out.println("nilai a lebih dari 5");
            
        System.out.println("\nIF..ELSE..");
        if(a < 5) {
            System.out.println("isi variable a : "+ a);
            System.out.println("nilai a kurang dari 5");
        }else 
            System.out.println("nilai a lebih dari atau sama dengan 5");
        
        System.out.println("\nIF..ELSE IF..ELSE..1");
        if(a < 5) {
            System.out.println("nilai a kurang dari 5");
        } else if(a == 5) {
            System.out.println("nilai a sama dengan 5");
        } else
            System.out.println("nilai a lebih dari 5");
        
        System.out.println("\nIF..ELSE IF..ELSE..2");
        if(a < 2) {
            System.out.println("nilai a kurang dari 2");
        } else if(a < 4) {
            System.out.println("nilai a kurang dari 4");
        } else if(a < 6) {
            System.out.println("nilai a kurang dari 6");
        } else if(a == 6) {
            System.out.println("nilai a sama dengan 6");
        } else {
            System.out.println("nilai a lebih dari 6");
            
        System.out.println("\nNested IF");
        if(a < 7) {
            System.out.println("nilai a kurang dari 7");
            if(a > 2)
                System.out.println("nilai a lebih dari 7");
            if(a < 4)
                System.out.println("nilai a kurang dari 4");
            
        System.out.println("\nSWITCH..CASE");
        switch(a) {
            case 1: System.out.println("nilai a => 1"); break;
            case 2: System.out.println("nilai a => 2"); break;
            case 3: System.out.println("nilai a => 3"); break;
            case 4: System.out.println("nilai a => 4"); break;
            case 5: System.out.println("nilai a => 5"); break;
            default: System.out.println("nilai a bukan antara 1-5");
            
        int nilai;
        System.out.print("\nNilai Anda ? ");
        nilai = scanner.nextInt();
        
        String grade = (nilai < 75) ? "belum kompeten" : "kompeten";
        System.out.println(nilai + " => " + grade);
        
        }
        }
        
        }
    }
}
