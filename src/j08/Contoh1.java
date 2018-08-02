/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package j08;

/**
 *
 * @author ASUS
 */
public class Contoh1 {
    public static void main(String[] args) 
    {
        //perulangan FOR
        int x;
        for(x = 1; x <= 5; x++)
        {
            System.out.println("SMK Telkom Malang");
        }
        
        //perulangan WHILE
        int y = 1;
        while(y <= 5)
        {
            System.out.println("SMK Telkom Malang");
            y++;
        }
        
        //perulangan DO WHILE
        int i = 1;
        do
        {
            System.out.println("SMK Telkom Malang");
            i++;
        }
        while(i <= 5);
    }
}

