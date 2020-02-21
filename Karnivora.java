
package polymorphism;


    public class Karnivora extends Hewan {
    final String jenisMakanan ="Daging ";
    public Karnivora(String nama){
    super(nama);
    }
    public void makan(){
        System.out.println("Hewan "+super.getNamaHewan()+"Sedang Makan "+ jenisMakanan);
    }
}
