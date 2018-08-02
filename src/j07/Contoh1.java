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
public class Contoh1 {
    public static void main(String[] args) 
    {
        Scanner baca = new Scanner(System.in);
        
        int x;
        
        System.out.print("Masukkan bilangan sembarang: ");
        x = baca.nextInt();
        
        if ( x % 2 == 1 )
        {
            System.out.println("Bilangan ganjil");
        }
        else
        {
            System.out.println("Bilangan genap");
        }
    }
}
