
package latihanexception;


public class KlausaThrow {
    public static void main(String[] args){
    String input ="Trow RuntimeException";
        System.out.println("\n=====MENGGUNKAN KLAUSA THROW=======\n");
    try{
        if(input.equals("Throw RunTimeException")){
        throw new RuntimeException("MelemparException");
        }else if (input==null){
        throw new NullPointerException();
        }else{
            System.out.println("Input adalah: "+ input);
        }
        System.out.println("Pernyataan dalamblok try setelah bebas dari pelemparan exception");
    }catch(Exception exc){
        System.err.println("Exception ditangkap disini");
        System.err.println("Exception yang ditangkap adalah "+ exc);
    }
    }
}
