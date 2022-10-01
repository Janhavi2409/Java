package OOPsConcept.Inheritence;

class Animal {
    public void run() {
        System.out.println("In Animal class");
        System.out.println("All animals are useful in some or the other way");
    }
}

class Dog extends Animal {
    public void loyal() {
        System.out.println("In dog class");
        System.out.println("Dogs are loyal and. They guard our homes");
    }
}

public class AnimalImpl {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.run();
        dog.loyal();
    }
}
