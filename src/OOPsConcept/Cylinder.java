package OOPsConcept;

class Cyl {
    int radius;
    int height;
    float pi = 3.14f;

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void surfaceArea() {
        float surfaceArea = 2 * pi * radius * (radius + height);
        System.out.println("Surface Area = " + surfaceArea + " sq.units");
    }

    public void volume() {
        float volume = pi * radius * radius * height;
        System.out.println("Volume = " + volume + " cubic units");
    }
}

public class Cylinder {
    public static void main(String[] args) {
        System.out.println("CYLINDER");
        Cyl c1 = new Cyl();
        c1.setRadius(3);
        c1.setHeight(5);
        System.out.println("Radius = " + c1.getRadius() + " units");
        System.out.println("Height = " + c1.getHeight() + " units");
        c1.surfaceArea();
        c1.volume();
    }
}
