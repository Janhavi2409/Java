package OOPsConcept;

class TommyVecetti {
    public void hit() {
        System.out.println("Hitting...");
    }

    public void fire() {
        System.out.println("Firing");
    }

    public void run() {
        System.out.println("Running...");
    }
}

public class RockstarGaming {
    public static void main(String[] args) {
        TommyVecetti tommyVecetti = new TommyVecetti();
        tommyVecetti.hit();
        tommyVecetti.fire();
        tommyVecetti.run();
    }
}
