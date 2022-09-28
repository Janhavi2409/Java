package OOPsConcept;


class Cir {
    float pi = 3.14f;
    int radius;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void area() {
        float area = pi * radius;
        System.out.println("Area = " + area + " units");
    }

    public void perimeter() {
        float perimeter = 2 * pi * radius;
        System.out.println("Perimeter = " + perimeter + " units");
    }
}

public class Circle {
    public static void main(String[] args) {
        System.out.println("CIRCLE");
        Cir c1 = new Cir();
        c1.setRadius(3);
        System.out.println("Radius = " + c1.getRadius() + " units");
        c1.area();
        c1.perimeter();
    }
}
