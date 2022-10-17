package InnerClass;

public class OuterClass {
    int i = 10;
    class InnerClass{
        int j = 20;
//        void show(){
//            System.out.println("Show in main class");
//        }
    }
}
class OuterImpl{
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        System.out.println(outer.i);
        OuterClass.InnerClass innerClass =outer.new InnerClass();
        System.out.println(innerClass.j);
//        System.out.println(innerClass.show());
    }
}
