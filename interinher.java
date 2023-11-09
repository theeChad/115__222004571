interface Sound {
    void makeSound();
}
// class that implements the interface
class Animal implements Sound {
    @Override
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}
//superclass
class Vehicle {
    void move() {
        System.out.println("Vehicle moves");
    }
}
// subclass that extends the superclass
class Car extends Vehicle {
    void drive() {
        System.out.println("Car drives");
    }
}
// another class
class Device {
    void operate() {
        System.out.println("Device operates");
    }
}
public class interinher {
    public static void main(String[] args) {
        // objects of each class
        Animal animal = new Animal();
        Car car = new Car();
        Device device = new Device();

        animal.makeSound();
        car.move();
        car.drive();
        device.operate();
    }
}
