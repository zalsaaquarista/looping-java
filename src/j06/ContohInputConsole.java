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
import java.io.Console;
public class ContohInputConsole {
    public static void main(String[] args) {
        String nama;
        int usia;
        String alamat;
        // membuat objek console
        Console con = System.console();
        // mengisi variabel nama usia alamat dengan console
        System.out.print("Inputkan nama anda: ");
        nama = con.readLine();
        System.out.print("Inputkan usia: 15");
        usia = Integer.parseInt(con.readLine());
        System.out.print("Inputkan alamat anda");
        alamat = con.readLine();
        // menampilkan isi variabel nama usia dan alamat
        System.out.println("Nama kamu adalah: " + nama);
        System.out.println("Saat ini berusia: " + usia + "tahun");
        System.out.println(alamat + "Alamat kamu berada di: ");
    }
}
