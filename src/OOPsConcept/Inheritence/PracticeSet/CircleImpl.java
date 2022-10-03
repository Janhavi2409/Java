package OOPsConcept.Inheritence.PracticeSet;

class Circle {
    int r;
    float pi = 3.14f;

    public Circle(int r) {
        this.r = r;
    }

    public void areaVolume() {
        float Ar = pi * r * r;
        System.out.println("Area of Circle = " + Ar + " sq.units");
    }
}

class Cylinder extends Circle {
    int h;

    @Override
    public void areaVolume() {
        super.areaVolume();
        float v = pi * r * r * h;
        System.out.println("Volume of Cylinder = " + v + " cubic units");
    }

    public Cylinder(int r, int h) {
        super(r);
        this.h = h;
    }
}

public class CircleImpl {
    public static void main(String[] args) {
        System.out.println("Circle & Cylinder");
        Cylinder c1 = new Cylinder(3, 5);
        c1.areaVolume();
    }
}
