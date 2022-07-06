package Inheritance;

public class AnimalMultilevelInheritance {
    void eat() {
        System.out.println("Animals can eat anything");
    }
}

class Dog extends AnimalMultilevelInheritance {
    void run() {
        System.out.println("Dog runs anywhere");
    }
}

class Babydog extends Dog {
    void sleep() {
        System.out.println("Only Sleep @ night");
    }
}

class AnimalMultilevelInheritanceImpl {
    public static void main(String[] args) {
        Babydog babydog = new Babydog();
        babydog.eat();
        babydog.run();
        babydog.sleep();
    }
}