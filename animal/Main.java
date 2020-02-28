
package animal;

public class Main {
    public static void main (String[] args){
     
    Fish f = new Fish();
    Cat c = new Cat("Fluffy");
    //2method (animal sama fish)
    Animal a= new Fish();
    Animal e = new Spider();
    Pet p = new Cat();
    
    f.play();
    c.play();
    
    e.eat();
    e.walk();
    
    a.walk();
    }
}
