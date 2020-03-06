
package latihanexception;


public class WithoutExeptionHandling {
    public static void main(String[] args){
        System.out.println("\n======PROGRAM "+"tanpa exception handling"+"========\n");
    try
    {int hasil= 9/0;//penyebabb exception
        System.out.println("Hasil pembagian = "+hasil);
        System.out.println("Pernyataan setelah "+" bebas dari exception.");
    }
    catch (ArithmeticException exc)
    {   System.out.println("");
        System.err.println("ArithmeticException"+"menangkap exception hasil pembagian"+"oleh nol.");
        System.err.println("Exception yang ditangkap"+"adalah: "+exc);
        System.out.println("");
        }finally{
            System.out.println("");
            System.out.println("Pernyataan dalam blok finally.");
    } System.out.println("Pernyataan di luar blok "+"trycatch.");
}
}
