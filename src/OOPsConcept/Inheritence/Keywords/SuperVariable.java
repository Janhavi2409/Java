package OOPsConcept.Inheritence.Keywords;

class Parent {
    int X;

    public Parent(int x) {
        X = x;
    }

    public Parent() {
        System.out.println("Constructor in parent class");
    }
}

class Child extends Parent {
    int Y;

    public Child(int X, int Y) {
        super(X);
        System.out.println("In Child Class Constructor with value X as " + X + " and Y as " + Y);
        System.out.println("Super Keyword used in this constructor...");
    }

    public Child() {
        System.out.println("In Child Class Constructor");
    }
}

public class SuperVariable {
    public static void main(String[] args) {
        Child child = new Child(3, 8);
        System.out.println();
        Child child1 = new Child();
    }
}
