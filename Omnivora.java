
package polymorphism;


public class Omnivora extends Hewan{
    final String jenisMakanan ="Segalanya ";
    public Omnivora(String nama){
    super(nama);
    }
    public void makan(){
        System.out.println("Hewan "+super.getNamaHewan()+"Sedang Makan "+ jenisMakanan);
    }
}
