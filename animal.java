package anudip;

// Base class Animal
class Animal {
    // Method to be overridden by subclasses
    public void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

// Derived class Dog
class Dog extends Animal {
    // Override makeSound method
    @Override
    public void makeSound() {
        System.out.println("Woof Woof");
    }
}

// Derived class Cat
class Cat extends Animal {
    // Override makeSound method
    @Override
    public void makeSound() {
        System.out.println("Meow Meow");
    }
}

// Main class to test the sounds
public class animal {
    public static void main(String[] args) {
        // Create objects of Dog and Cat
        Animal dog = new Dog();
        Animal cat = new Cat();

        // Call their respective makeSound() methods
        dog.makeSound();  // Output: Woof Woof
        cat.makeSound();  // Output: Meow Meow
    }
}

