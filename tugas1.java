/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas1;
        
import java.until.scanner;
/**
 *
 * @author mbint
 */
public class tugas1 {
    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("masukan tahun (1909 - 2024) : ");
        int tahun = input.nextInt();
        System.out.println(tahun + " adalah tahun kabisat");
        input.close();
    }
}