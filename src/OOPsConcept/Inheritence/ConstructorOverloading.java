package OOPsConcept.Inheritence;

class Parent {
    int X;

    public Parent() {
        System.out.println("I am a constructor in Parent class");//will not get executed
    }

    public Parent(int x) {
        System.out.println("I am an overloaded constructor in Parent class with value of x =" + x);
    }
}

class Child extends Parent {
    int Y;

    public Child() {
        System.out.println("I am a constructor in Child class");//will not get executed
    }

    public Child(int x, int y) {
        super(x);//keyword to inherit from parent
        System.out.println("I am an overloaded constructor in Child class with value of y =" + y);
    }
}

public class ConstructorOverloading {
    public static void main(String[] args) {
        System.out.println("With entering values: ");
        Child child = new Child(4, 6);
        System.out.println("Without entering values: ");
        Child child1 = new Child();
    }
}
