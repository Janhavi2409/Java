package OOPsConcept.Inheritence.PracticeSet;

class Rectangle {
    int l;
    int b;

    public int getL() {
        return l;
    }

    public void setL(int l) {
        this.l = l;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void areaVolume() {
        int Ar = l * b;
        System.out.println("Area of Rectangle = " + Ar + " sq.units");
    }
}

class Cuboid extends Rectangle {
    int h;

    public int getH() {
        return h;
    }

    public void setH(int h) {
        this.h = h;
    }

    @Override
    public void areaVolume() {
        super.areaVolume();
        int v = l * b * h;
        System.out.println("Volume of Cuboid = " + v + " cubic units");
    }

}

public class RectangleImpl {
    public static void main(String[] args) {
        System.out.println("Rectangle & Cuboid");
        Cuboid c1 = new Cuboid();
        c1.setL(5);
        c1.setB(2);
        c1.setH(3);
        c1.getL();
        c1.getB();
        c1.getH();
        c1.areaVolume();
    }
}
