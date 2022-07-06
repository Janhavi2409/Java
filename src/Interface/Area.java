package Interface;

import java.util.Scanner;

public interface Area {
    double calculateArea();
}
class Rectangle implements Area{
    int breadth;
    int length;
    Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    @Override
    public double calculateArea() {
        return length*breadth;
    }
}

class Circle implements Area{
int radius;
double pi = 3.14;
Circle (int radius, double pi){
    this.radius = radius;
    this.pi = pi;
}

    @Override
    public double calculateArea() {
        return pi*radius*radius;
    }
}
class Square implements Area{
    int side;
    Square(int side){
        this.side = side;
    }

    @Override
    public double calculateArea() {
        return side*side;
    }
}
class Triangle implements Area{
    int height;
    int breadth;
    double half = 0.5;
Triangle(double half, int height, int breadth){
    this.half = half;
    this.height = height;
    this.breadth = breadth;
}
    @Override
    public double calculateArea() {
        return half*height*breadth;
    }
}

class AreaImpl{
    public static void main(String[] args) {
        {
            Scanner sc = new Scanner(System.in);
            int ch;
            do {
                System.out.println("1.Rectangle\n2.Circle\n3.Square\n4.Triangle\n5.Exit");
                System.out.println("Enter your choice");
                ch = sc.nextInt();
                Area area;
                switch (ch){
                    case 1:
                        System.out.println("Enter breadth & height");
                        int length = sc.nextInt();
                        int breadth = sc.nextInt();
                        area = new Rectangle(length, breadth);
                        System.out.println("Area of Rectangle "+area.calculateArea());
                        break;

                    case 2:
                        System.out.println("Enter radius");
                        double pi = 3.14;
                        int radius = sc.nextInt();
                        area = new Circle( radius,pi);
                        System.out.println("Area of Circle "+area.calculateArea());
                        break;

                    case 3:
                        System.out.println("Enter side");
                        int side = sc.nextInt();
                        area = new Circle(side, side);
                        System.out.println("Area of Square "+area.calculateArea());
                        break;

                    case 4:
                        System.out.println("Enter height and breadth");
                        int height = sc.nextInt();
                        int breadth1 = sc.nextInt();
                        area = new Circle(height, breadth1);
                        System.out.println("Area of Square "+area.calculateArea());
                        break;

                    case 5:
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Wrong choice");
                }
            }while (ch<=5);
        }
    }
}