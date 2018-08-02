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
public class Contoh5 {
    public static void main(String[] args) {
        Scanner baca = new Scanner (System.in);
        double bil1, bil2, hasil;
        char opr;
        
        System.out.print("Masukkan bilangan 1: ");
        bil1 = baca.nextDouble();
        System.out.print("Masukkan bilangan 2: ");
        bil2 = baca.nextDouble();
        System.out.print("Masukkan operator: ");
        opr = baca.next().charAt(0);
        
        switch(opr)
        {
            case '+':
                hasil = bil1 + bil2;
                System.out.println(hasil);
                
            case '-':
                hasil = bil1 - bil2;
                System.out.println(hasil);
                
            case '*':
                hasil = bil1 * bil2;
                System.out.println(hasil);
                
            case '/':
                hasil = bil1 / bil2;
                System.out.println(hasil);
                
            case '%':
                hasil = bil1 % bil2;
                System.out.println(hasil);
            default:
                System.out.println("operator tidak tersedia");
        }
    }
}
