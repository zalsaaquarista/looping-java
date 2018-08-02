/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j07;
import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Contoh3 {
    public static void main(String[] args) 
    {
        Scanner baca = new Scanner(System.in);
        int bilangan;
        
        System.out.print("Masukkan bilangan sembarang");
        bilangan = baca.nextInt();    
        
        if (bilangan == 0)
        {
            System.out.println("Bilangan Nol");
        }
        else if (bilangan > 0)
        {
            System.out.println("Bilangan positif");
        }
        else 
        {
            System.out.println("Bilangan negatif");
        }
    }
}

