package JavaPackages.p2;

//import JavaPackages.p1.A;
//import JavaPackages.p1.B;
import JavaPackages.p1.*;
import JavaPackages.p1.p3.C;
import JavaPackages.p1.p3.D;


public class PackageImpl {


    public static void main(String[] args) {
        //B b = new B();
        A a = new A();
        B b = new B();
        C c = new C();
        D d = new D();
        JavaPackages.p1.p3.A a1  = new JavaPackages.p1.p3.A();
    }
}