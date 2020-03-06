
package latihanexception;


public class MultipleCatch {
    public static void main (String[] args){
        System.out.println("\n========MENGGUNAKANK MULTIPLE "+"CATCH======\n");
    try{
        int[] array = new int[8];
        array[8]= 13/0;
        System.out.println("Elemen array indeks ke"+"9 adalah"+ array[8]);
        System.out.println("Pernyataan dalam blok"+"try setelah bebas dari exceptio.");
    }catch (ArrayIndexOutOfBoundsException exc){
        System.err.println("Anda mengakse array di "+"luar indeks yang dideklarasikan");
    }catch(NegativeArraySizeException exc){
        System.err.println("Anda mendeklarasikan array"+"dengan ukuran negatif.");
    } catch(Exception exc) {
        System.err.println("Anda mendeklarasikan array"+"dengAN PEMBAGIAN 0.");
    }    
    }
    
}
