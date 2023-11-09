interface Communication {
    void communication();
}

//class that implements the interface
class Person implements Communication {
    @Override
    public void communication() {
        System.out.println("Person can communicate");
    }
}

//superclass
class Appliance2 {
    void operate() {
        System.out.println("Appliance operates");
    }
}

// subclass that extends the superclass
class Smartphone extends Appliance2 {
    void call() {
        System.out.println("Smartphone can make calls");
    }
}

//another class
class Robot {
    void performTask() {
        System.out.println("Robot performs tasks");
    }
}

public class interinher2 {
    public static void main(String[] args) {
        Person person = new Person();
        Smartphone smartphone = new Smartphone();
        Robot robot = new Robot();

        person.communication();
        smartphone.operate();
        smartphone.call();
        robot.performTask();
    }
}
