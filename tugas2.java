/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author mbint
 */
public class tugas2 {
    
}
public static void main(String[] args) throws Exception {
        
        Scanner input = new Scanner(System.in);

        double jari, keliling, luas;
        final double PI = 3.14;

        System.out.println("program menghitung lingkaran \n\n masukan jari jari : " );
        jari = input.nextDouble();

        luas = PI * (jari*jari);
        keliling = 2 * (PI * jari);

       System.out.println("\n\n\nluas : " + luas);
       System.out.println("keliling : " + keliling);

       input.close();
    }
