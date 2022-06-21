import java.util.Scanner;

public class Student{
    String name;
    int rno;
    String address;
    Float age;
    void insertData(int r,String nm, String addr, Float a){
        rno = r;
    name = nm;
    address = addr;
    age = a;
}
void display(){
    System.out.println("********************student information********************");
    System.out.println("Roll no. "+rno);
    System.out.println("Name "+name);
    System.out.println("Address "+address);
    System.out.println("Age "+ age);
}
}
 class StudentImp {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.rno = 12;
        s1.name = "Janhavi";
        s1.address = "Kothrud Pune";
        s1.age = 17.8f;


        Scanner sc = new Scanner(System.in);
        System.out.println("Enter R.no");
        int rno = sc.nextInt();
        System.out.println("Enter name");
        String nm = sc.next();
        System.out.println("Enter address");
        String addr = sc.next();
        System.out.println("Enter age");
        Float a = sc.nextFloat();


        Student s2 = new Student();
        s2.insertData (rno, nm, addr, a);
        s2.display();


        Student s3 = new Student();
        s3.insertData(rno = 3, nm = "Jorge", addr = "NY", a = Float.valueOf(45));
        s3.display();
    }
}
