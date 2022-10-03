package OOPsConcept.Interface;

interface Vehicle {
    int A = 24;
    int B = 48;
    void engineStart(int xyz);
    //methods are already public so there is no need to write public void Horn()...we can just write void Horn().
    void Horn();
}

interface Speaker {
    void start();

    void play();
}
//multiple inheritance allowed in interface
class Car implements Vehicle, Speaker {
    int B = 72;//overridden variable
    @Override
    public void engineStart(int xyz) {
        System.out.println("Engine is Starting...");
    }

    @Override
    public void Horn() {
        System.out.println("Horn: Peep Peep...");
    }

    @Override
    public void start() {
        System.out.println("Speaker gets started...");
    }

    @Override
    public void play() {
        System.out.println("Speaker plays,'Manike mage hite...'");
    }
}

public class VehicleImpl {
    public static void main(String[] args) {
        Car car = new Car();
        car.engineStart(3);
        car.Horn();
        car.start();
        car.play();
        System.out.println(car.A);
        System.out.println(car.B);
    }
}
