package OOP.oop1;

public class Car {
    public static void main(String[] args) {
        class Vehicle {
            String model;
            String color;
            int rating;

            Vehicle(String model, String color, int rating) {
                this.model = model;
                this.color = color;
                this.rating = rating;
            }

            void mark() {
                System.out.println("Mark likes " + model + "cars that are " + color + " in color with " + rating + " noisy engines");
            }
            void jenifer() {
                System.out.println("Jenifer is weird. She likes " + model + "trucks");
            }
        }
            Vehicle driver1 = new Vehicle("Mercedece", "Red" , 2000);
            // Call the methods
            driver1.mark();
            Vehicle driver2 = new Vehicle("Tractor", "blue", 3000);
            driver2.jenifer();

    }
}
