package OOPsConcept.Inheritence.Keywords;

class Parent1 {
    public void Play() {
        System.out.println("Parent is Playing...");
    }
}

class Child1 extends Parent1 {
    @Override
    public void Play() {
        super.Play();
        System.out.println("Child is Playing...");
    }
}

public class SuperMethod {
    public static void main(String[] args) {
        Child1 c1 = new Child1();
        c1.Play();
    }
}
