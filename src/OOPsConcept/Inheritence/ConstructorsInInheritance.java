package OOPsConcept.Inheritence;

class Base1 {
    int X;

    public Base1() {
        System.out.println("I am a constructor in Parent class");//gets executed 1st
    }

    public int getX() {
        return X;
    }

    public void setX(int x) {
        X = x;
    }
}

class Derived1 extends Base1 {
    int Y;

    public Derived1() {
        System.out.println("I am a constructor in Child class");//gets executed 2nd
    }

    public int getY() {
        return Y;
    }

    public void setY(int y) {
        Y = y;
    }
}

class Derived2 extends Derived1 {
    int Z;

    public Derived2() {
        System.out.println("I am a constructor in Grand Child class");//gets executed 3rd

    }

    public int getZ() {
        return Z;
    }

    public void setZ(int z) {
        Z = z;
    }
}

public class ConstructorsInInheritance {
    public static void main(String[] args) {
        Derived2 d2 = new Derived2();
    }
}
