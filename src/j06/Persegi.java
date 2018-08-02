/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j06;

/**
 *
 * @author ASUS
 */
import java.io.*;

public class Persegi {
    
    public static void main(String[] args) throws IOException {
        BufferedReader data = new BufferedReader(new InputStreamReader(System.in));
        String x = " ";
        int hitungLuas=0;
        System.out.print("---Luas Persegi----");
        System.out.print("Masukkan nilai sisi: ");
        
    try {
        x = data.readLine();
        int angka = Integer.parseInt(x);
        hitungLuas = angka * angka;
    } catch (IOException | NumberFormatException e) {
        System.out.print("YES");
    }
        System.out.print("Luas persegi dengan sisi " + x + " adalah " + hitungLuas);    
    } 
    }
