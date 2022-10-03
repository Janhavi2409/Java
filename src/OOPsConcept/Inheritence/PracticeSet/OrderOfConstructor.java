package OOPsConcept.Inheritence.PracticeSet;

class Parent {
    public Parent() {
        System.out.println("In Parent Constructor");
    }
}

class Child extends Parent {
    public Child() {
        System.out.println("In Child Constructor");
    }
}

class GrandChild extends Child {
    public GrandChild() {
        System.out.println("In GrandChild Constructor");
    }
}

public class OrderOfConstructor {
    public static void main(String[] args) {
        GrandChild grandChild = new GrandChild();
    }
}
//first parent constructor gets executed then child and then grandchild gets executed