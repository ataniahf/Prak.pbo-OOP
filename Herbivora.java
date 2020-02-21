/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism;

public class Herbivora extends Hewan {
    final String jenisMakanan ="Tumbuhan ";
    public Herbivora(String nama){
    super(nama);
    }
    public void makan(){
        System.out.println("Hewan "+super.getNamaHewan()+"Sedang Makan "+ jenisMakanan);
    }
    
}
