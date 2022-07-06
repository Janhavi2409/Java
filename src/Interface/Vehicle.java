package Interface;
//marker interface
public interface Vehicle {
}
interface Engine{

}

class Bike implements Vehicle{
    //    void show(){
//        System.out.println("Bike is vehicle");
//    }
    boolean Engine;
}
class Car implements Engine{
//    void show(){
//        System.out.println("car is vehicle");
//    }
    boolean Vehicle;
}

class VehicleImpl{
    public static void main(String[] args) {
        Car c1 = new Car();
        Bike b1 = new Bike();
        if (c1 instanceof Vehicle) {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
            }

        if (c1 instanceof Engine){
            System.out.println("True");
        }
        else {
            System.out.println("False");
        }
    }
}