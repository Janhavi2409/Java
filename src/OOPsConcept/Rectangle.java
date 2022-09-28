package OOPsConcept;

class rect {
    int length;
    int breadth;

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getBreadth() {
        return breadth;
    }

    public void setBreadth(int breadth) {
        this.breadth = breadth;
    }

    public void area() {
        int area = length * breadth;
        System.out.println("Area = " + area + " units");
    }

    public void perimeter() {
        int perimeter = 2 * (length + breadth);
        System.out.println("Perimeter = " + perimeter + " units");
    }
}

public class Rectangle {
    public static void main(String[] args) {
        rect r1 = new rect();
        System.out.println("RECTANGLE");
        r1.setLength(6);
        r1.setBreadth(4);
        System.out.println("Length = " + r1.getLength() + " units");
        System.out.println("Breadth = " + r1.getBreadth() + " units");
        r1.area();
        r1.perimeter();
    }
}
