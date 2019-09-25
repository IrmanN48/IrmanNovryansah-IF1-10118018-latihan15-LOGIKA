/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan15.logika;

/**
 *
 * @author Aero
 * NAMA     : Irman Novryansah
 * KELAS    : IF-1
 * NIM      : 10118018
 * Deskripsi Program : Program ini untuk menampilkan Logika dari variabel
 *                     yang bertipe data boolean
 */
public class Latihan15Logika {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         //Variabel
        boolean a = true;
        boolean b = false;
        
        //Tampilan
        System.out.println("a && b = " + (a && b));
        System.out.println("a || b = " + (a || b));
        System.out.println("!a = " + !a);
        System.out.println("!(a && b) = " + !(a && b));
    }
    
}
