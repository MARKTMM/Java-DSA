package OOP.oop1;
// Create a main class
public class Practice {
    public static void main(String[] args) {
        // Define a superclass called Animal
         class Animal {
             // Declare some attributes
              String name;
              String color;
              int age;

              // Define a constructor to initialize the attributes
              Animal(String name, String color, int age) {
                  this.name = name;
                  this.color = color;
                  this.age = age;
              }

              // Define some methods
              void eat(String food) {
                  System.out.println(name + " is eating " + food);
              }

              void sleep() {
                  System.out.println(name + " is sleeping");
              }

              void makeSound() {
                  System.out.println(name + " is making a sound");
              }
         }

         // Define a subclass called Dog that inherits from Animal
         class Dog extends Animal {
             // Declare an additional attribute
              String breed;

              // Define a constructor to initialize the attributes
             Dog(String name, String color, int age, String breed) {
                 // Call the constructor of the superclass
                  super(name, color, age);
                  this.breed = breed;
             }

             // Override the makeSound() method of the superclass
              void makeSound() {
                 System.out.println(name + " is barking");
             }

             // Overload the eat() method of the superclass
             void eat(String food, int times) {
                 System.out.println(name + " is eating " + food + " " + times + " times");
             }
         }


         // Create an object of the Animal class
         Animal a1 = new Animal("Leo", "brown", 5);
         // Call the methods of the object
         a1.eat("meat");
         a1.sleep();
         a1.makeSound();

         // Create an object of the Dog class
         Dog d1 = new Dog("Max", "black", 3, "Labrador");
         // Call the methods of the object
         d1.eat("bones", 1);
         d1.sleep();
         d1.makeSound();
         // Call the overloaded method of the object
         d1.eat("kibble", 2);

         // Create a variable of type Animal and assign it an object of the Dog class
         Animal a2 = new Dog("Luna", "white", 2, "Poodle");
        // Call the methods of the variable
         a2.eat("cheese");
         a2.sleep();
         a2.makeSound(); // This will execute the overridden method of the Dog class
         }
}
