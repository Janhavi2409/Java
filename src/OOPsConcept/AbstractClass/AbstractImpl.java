package OOPsConcept.AbstractClass;

abstract class Parent {
    public void sayHello() {
        System.out.println("Hello");
    }

    abstract public void greet();
}

class Child extends Parent {
    @Override
    public void greet() {
        System.out.println("Good Morning");
    }
}

abstract class Child2 extends Parent {
    public void sayBye() {
        System.out.println("Bye Bye!!!");
    }
}

public class AbstractImpl {
    public static void main(String[] args) {
        //Parent p1 = new Parent();//throws error as Parent class is abstract
        Child c = new Child();
        c.sayHello();
        c.greet();
        //Child2 c2 = new Child2();//throws error as Child2 clas is also abstract due to Parent class
    }
}
