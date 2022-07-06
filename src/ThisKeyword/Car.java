package ThisKeyword;

public class Car {
    int carNo;
    String carName;
    double Price;


    public Car(int carNo, String carName, double price) {
        this.carNo = carNo;
        this.carName = carName;
        Price = price;
    }

    void display() {
        System.out.println("***************Car Details********************");
        System.out.println("car no: " + carNo);
        System.out.println("car name: " + carName);
        System.out.println("Price: " + Price);
    }
}

class CarImpl {
    public static void main(String[] args) {
        Car c1 = new Car(4845, "Jaguar", 8000000);
        c1.display();
    }
}