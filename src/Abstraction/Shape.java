package Abstraction;

public abstract class Shape {
    abstract double calculateArea();
     void display(){
         System.out.println("Calculating areas of different shapes");
     }
}
class Rectangle extends Shape {
    int breadth;
    int height;

    public Rectangle(int breadth, int height) {
        this.breadth = breadth;
        this.height = height;
    }


    @Override
    double calculateArea() {
        return breadth * height;
    }

    @Override
    void display() {
        super.display();
        System.out.println("Area of Rectangle= " + calculateArea());
    }
}
    class circle extends Shape{
        double pi;
        int radius;

        public circle(double pi, int radius) {
            super.display();
            System.out.println("Area of Circle= " + calculateArea());
        }

        @Override
        double calculateArea() {
            double Area = pi*radius*radius;
            return pi*radius*radius;
        }

        @Override
        void display() {
            super.display();
            System.out.println("Area of Circle= " + calculateArea());
        }
    }

class ShapeImpl{
    public static void main(String[] args) {
        Shape shape = new Rectangle(5,7);
        Shape shape1 = new circle(3.14,5);
        shape.display();
        shape1.display();
    }
}