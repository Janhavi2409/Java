package OOPsConcept;

class Phone{
    public void ring(){
        System.out.println("Cell Phone is ringing...");
    }
    public void vibrate(){
        System.out.println("Cell Phone is vibrating...");
    }
    public void call(){
        System.out.println("Cell Phone is calling Lavanya...");
    }
}

public class CellPhone {
    public static void main(String[] args) {
        Phone c1 = new Phone();
        c1.ring();
        c1.vibrate();
        c1.call();
    }
}
