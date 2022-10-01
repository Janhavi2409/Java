package OOPsConcept;

class Tri {
    int base;
    int height;

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void area() {
        double area = 0.5 * base * height;
        System.out.println("Area = " + area + " sq.units");
    }

}

public class Triangle {
    public static void main(String[] args) {
        System.out.println("TRIANGLE");
        Tri t1 = new Tri();
        t1.setBase(8);
        t1.setHeight(4);
        System.out.println("Base = " + t1.getBase() + " units");
        System.out.println("Height = " + t1.getHeight() + " units");
        t1.area();

    }
}
