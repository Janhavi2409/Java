package OOPsConcept;

class Rectangle1 {
    int length;
    int breadth;

    public Rectangle1() {
        this.length = 4;
        this.breadth = 5;
    }
    public Rectangle1(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public int getLength() {
        return length;
    }

    public int getBreadth() {
        return breadth;
    }
}

public class RectConstructor {
    public static void main(String[] args) {
        System.out.println("Sides of Rectangle");
        Rectangle1 r1 = new Rectangle1();
        System.out.println("Length = "+r1.getLength()+" units");
        System.out.println("Length = "+r1.getBreadth()+" units");
    }
}
