package Interface;
//marker interface
public interface ParkingMarkerInterface {

}
class TwoWheeler implements ParkingMarkerInterface{
    void show(){
        System.out.println("in Two Wheeler Parking");
    }
}
class FourWheeler{
void show(){
    System.out.println("in Four Wheeler Parking");
}
}
class ParkingMarkerInterfaceImpl{
    public static void main(String[] args) {
        TwoWheeler twoWheeler = new TwoWheeler();
        FourWheeler fourWheeler = new FourWheeler();
        if (twoWheeler instanceof ParkingMarkerInterface){
            twoWheeler.show();
        }
        else{
            fourWheeler.show();
        }
    }
}