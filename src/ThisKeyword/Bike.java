package ThisKeyword;

public class Bike {
    int bikeNo;
    String bikeName;

    public Bike() {
        this(4678, "Jupiter");
        System.out.println("In Default Constructor");
    }

    public Bike(int bikeNo, String bikeName) {
        System.out.println("In Parameterized Constructor");
        this.bikeNo = bikeNo;
        this.bikeName = bikeName;
    }

    void display() {
        System.out.println("*****************Bike Details*****************");
        System.out.println("Bike No: " + bikeNo);
        System.out.println("Bike Name: " + bikeName);
    }
}

class BikeImpl {
    public static void main(String[] args) {
        Bike b1 = new Bike();
        b1.display();
    }
}
