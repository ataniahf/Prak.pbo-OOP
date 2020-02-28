
package animal;

public abstract class Animal{
    
    protected int legs;
    protected Animal (int legs){
    this.legs=legs;
    }
    //HARUS
    abstract void eat();
    
    void walk(){
        System.out.println("Hewan ini berjalan dengan " + legs +" kaki");
    }
   
    
}
