package ThisKeyword;
/*
* 2. Used to invoke current class method*/
public class A {
    int n;
    void m(A a){
        System.out.println("call current class method m");
    }
    void n(){
        System.out.println("n method gets called");
        m(this);
        System.out.println("exit from n");
    }

}
class AImpl{
    public static void main(String []args){
        A a = new A();
        a.n();
    }
}
