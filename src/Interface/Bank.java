package Interface;

public interface Bank {
    double getRateOfInterest();
    float N=10;
}
interface BankOperation extends Bank{
     double calculateInterest();
}
class HDFC implements BankOperation{
    @Override
    public double getRateOfInterest() {
        return 10;
    }
    @Override
    public double calculateInterest(){
        return 0;
    }
}
//class ICICI implements BankOperation {
//}
class BankImpl{
    public static void main(String[] args) {
        Bank bank;//reference variable
        bank = new HDFC();
//        bank = new ICICI();
        }
    }
