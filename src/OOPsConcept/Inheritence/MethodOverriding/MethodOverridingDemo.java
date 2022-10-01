package OOPsConcept.Inheritence.MethodOverriding;

class A {
    public void methodOne() {
        System.out.println("In Method 1 in class A");
    }

    public void methodTwo() {
        System.out.println("In Method 2 in class A");
    }
}

class B extends A {
    public void methodThree() {
        System.out.println("In Method 3 in class B");
    }

    @Override
    public void methodTwo() {
        System.out.println("In Method 2 in class B");
    }
}

public class MethodOverridingDemo {
    public static void main(String[] args) {
        B b = new B();
        A a = new A();
        b.methodOne();
        a.methodTwo();
        b.methodTwo();
        b.methodThree();
    }
}
