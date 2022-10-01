package OOPsConcept.Inheritence.Keywords;

class Parent2 {
    String Name;

    public Parent2(String name) {
        Name = name;
    }
}

class Child2 extends Parent2 {
    int Age;

    public Child2(String name, int age) {
        super(name);
        Age = age;
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class SuperConstructor {
    public static void main(String[] args) {
        Child2 c2 = new Child2("Janhavi", 18);
    }
}
