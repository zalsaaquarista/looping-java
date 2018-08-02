/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j06;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class KalkulatorAritmatika {

    private static Object baca;
    public static void main(String[] args) {
        Scanner baca = new Scanner(System.in);
        double bil1;
        double bil2;
        char opr;
        System.out.println();
        
        bil1 = baca.nextDouble();
        opr = baca.next().charAt(0);
        bil2 = baca.nextDouble();
        System.out.println();
        
        if (opr == '+')
        {
            System.out.println("Hasil: " + (bil1 + bil2));
        }
        else if(opr == '-')
        {
            System.out.println("Hasil: " + (bil1 - bil2));
        }
        if (opr == 'x')
        {
            System.out.println("Hasil: " + (bil1 * bil2));
        }
          else if (opr == '/')
        {
            System.out.println("Hasil: " + (bil1 / bil2));
        }
        if (opr == '%')
        {
            System.out.println("Hasil: " + (bil1 % bil2));
        }
    }
}
