
package polymorphism;

public class Main {
  public static void main(String[] args){
  Hewan hewanAnonim= new Hewan(" Anonim");
  hewanAnonim.makan();
  Hewan hewan1 = new Herbivora(" Kelinci");
  hewan1.makan();
  Hewan hewan2 = new Karnivora(" Harimau");
  hewan2.makan();
  Hewan hewan3 = new Omnivora (" Kucing");
  hewan3.makan();
  }  
}
