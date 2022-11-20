// program that includes an abstract class Animal
    // Dog and Cat object inherit from Animal 
    // Dog and Cat objects also implement the NouseCapable interface for a 
        // makeNoise() method
public class Main {

    public static void main(String[] args) {
        
        Dog dog = new Dog();
        dog.bark();
        dog.eat();
        System.out.println();
        
        Dog fido = new Dog("Fido");
        fido.bark();
        System.out.println();
        
        Cat cat = new Cat();
        cat.purr();
        cat.eat();
        System.out.println();
        
        Cat garfield = new Cat("Garfield");
        garfield.purr();
        System.out.println();
        
        NoiseCapable dog2 = new Dog();
        NoiseCapable cat2 = new Cat("Garfield");
        dog.makeNoise();
        cat.makeNoise();
        Cat c = (Cat) cat;
        c.purr();
    }

}
