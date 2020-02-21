/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism;


public class Hewan {
   private String namaHewan;
   public Hewan (String nama){
   this.namaHewan=nama;
   }
   public String getNamaHewan(){
   return namaHewan;
   }

public void makan(){
    System.out.println("Hewan"+namaHewan+"Sedang Makan");
}
}

