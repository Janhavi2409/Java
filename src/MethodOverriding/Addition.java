package MethodOverriding;

public class Addition {
    int add(int no1, int no2){
        return no1+no2;
    }
    int add(int no1, int no2, int no3, int no4){
        return no1+no2+no3+no4;
    }
    float add(int no1, float f1){
        return no1+f1;
    }
    float add(float f1, int no1){
        return no1+f1;
    }
    void add(int ... no){
        System.out.println("calling var args");
    }
}
class AdditionImpl{
    public static void main(String[] args) {
        Addition add1 = new Addition();
        System.out.println(add1.add(5,6));
        System.out.println(add1.add(4,6,8,10));
        System.out.println(add1.add(0.4f,3));
        System.out.println(add1.add(5,3.7f));
        add1.add();
    }
}
