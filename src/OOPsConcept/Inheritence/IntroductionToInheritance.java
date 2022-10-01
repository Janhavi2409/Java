package OOPsConcept.Inheritence;

class Base {
    int X;

    public int getX() {
        System.out.println("I am in Base Class and I am getting X");
        return X;
    }

    public void setX(int x) {
        System.out.println("I am in Base Class and I am setting X");
        X = x;
    }
}

class Derived extends Base {
    int Y;

    public int getY() {
        System.out.println("I am in Derived Class and I am getting Y");
        return Y;
    }

    public void setY(int y) {
        System.out.println("I am in Derived Class and I am setting y");
        Y = y;
    }
}

public class IntroductionToInheritance {
    public static void main(String[] args) {
        System.out.println("In Base Class: ");
        Base base = new Base();
        base.getX();
        base.setX(8);
        //derived.getY();parent cannot derive child properties
        //derived.setY(5);parent cannot derive child properties

        System.out.println("In Derived Class: ");
        Derived derived = new Derived();
        derived.getY();
        derived.setY(5);
        base.getX();
        base.setX(8);
    }
}
