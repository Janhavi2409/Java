package OOPsConcept.Inheritence;

class Phone {
    public void Ringing() {
        System.out.println("Phone is Ringing...");
    }

    public void Vibrating() {
        System.out.println("Phone is Vibrating...");
    }
}

class SmartPhone extends Phone {
    public void Power() {
        System.out.println("Smart Phone is Switching ON...");
    }

    @Override
    public void Vibrating() {
        System.out.println("Smart Phone is Vibrating...");
    }
}

public class DynamicMethodDispatch {
    public static void main(String[] args) {
        //Phone phone = new Phone();//Allowed
        //SmartPhone smartPhone = new SmartPhone();//Allowed
        Phone phone = new SmartPhone();//Allowed=>
        //SmartPhone smartPhone = new Phone();//Not Allowed=>How can a Nokia 1100 be Samsung Note Pro...
        phone.Ringing();
        phone.Vibrating();//it will take the object in child class i.e. smartPhone
        //phone.Power()//not allowed as it is not a method of smartPhone
    }
}