package OOPsConcept;

class Side {
    int side;

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }

    public void area() {
        int area = side * side;
        System.out.println("Area = " + area + " units");
    }

    public void perimeter() {
        int perimeter = 4 * side;
        System.out.println("Perimeter = " + perimeter + " units");
    }
}

public class Square {
    public static void main(String[] args) {
        System.out.println("SQUARE");
        Side s1 = new Side();
        s1.setSide(6);
        System.out.println("Side = " + s1.getSide() + " units");
        s1.area();
        s1.perimeter();
    }
}
