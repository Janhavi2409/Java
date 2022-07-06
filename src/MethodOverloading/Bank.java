package MethodOverloading;

public class Bank {
    float getRateOfInterest(){
        return 8;
    }
}
class SBI extends Bank{
    float getRateOfInterest(){
        return 7;
    }
}
class ICICI extends Bank{
    float getRateOfInterest(){
        return 9;
    }
}
class HDFC extends Bank{
    float getRateOfInterest(){
        return  9.2f;
    }
}
class BankImpl {
    public static void main(String[] args) {
        Bank bank;
        bank = new ICICI();
        System.out.println(bank.getRateOfInterest());
        bank = new HDFC();
        System.out.println(bank.getRateOfInterest());
    }
}