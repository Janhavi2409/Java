package OOPsConcept.Interface;

interface Parent {
    void meth1();

    void meth2();
}

interface Child extends Parent {
    void meth3();

    void meth4();
}

class Child2 implements Child {

    @Override
    public void meth1() {
        System.out.println("meth1 in parent");
    }

    @Override
    public void meth2() {
        System.out.println("meth2 in parent");
    }

    @Override
    public void meth3() {
        System.out.println("meth3 in child");
    }

    @Override
    public void meth4() {
        System.out.println("meth4 in child");
    }
}

public class InheritanceInInterface {
    public static void main(String[] args) {
        Child2 c2 = new Child2();
        //Child c = new Child();it is not allowed to make an object of interface
        c2.meth1();
        c2.meth2();
        c2.meth3();
        c2.meth4();
    }
}
