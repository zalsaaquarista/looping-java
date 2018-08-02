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
public class Contoh4 {
    public static void main(String[] args) {
        Scanner baca = new Scanner(System.in);
        String huruf;
        
        System.out.print("Masukkan huruf vokal dan konsonan");
        huruf = baca.next();
        
        if (huruf.equals("a") || huruf.equals("1") || huruf.equals("u") || huruf.equals("e") || huruf.equals("o"))
        {
            System.out.print("Huruf vokal");
        }
        else
        {
            System.out.println("Masukkan konsonan");
        }
        
              
        
        
    }
}
