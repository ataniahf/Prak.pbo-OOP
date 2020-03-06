/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanexception;

/**
 *
 * @author Lab Informatika
 */
public class KlausaThrows {
    public static void uji (int angka){
    if(angka<0){
    throw new NullPointerException("KESALAHAN"+"Null pointer exception");
    }else{
    throw new ArithmeticException("KESALAHAN"+"Arithmatic exception");    
    }
    }
    public static void main(String[] args){
        System.out.println("\n=======MENGGUNAKAN KLAUSA"+"THROW======\n");
        try{
        uji(0);
        }catch(Exception exc){
            System.err.println("Exception ditangkap disini");
            System.err.println("\n\tPemberitahuan"+exc.getMessage());
        }
        System.out.println("Pernyataan di luar blok trycatch.");
    }
}
