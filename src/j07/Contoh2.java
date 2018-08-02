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
public class Contoh2 {
    public static void main(String[] args) 
    {
         Scanner baca = new Scanner(System.in);
        
        int x;
        
        System.out.print("Masukkan wajib KTP: ");
        x = baca.nextInt();
        
        if (usia >= 17)
        {
            System.out.println("Wajib mengurus KTP: ");
        }
        else
        {
            System.out.println("Belum wajib mengurus KTP: ");
        }
    }
}

