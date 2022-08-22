package StringDemo;

public class Person {
    private int Pid;
    private String Name;
    private int MobileNo;
    private String Email;

    @Override
    public String toString() {
        return "Person{" +
                "Pid=" + Pid +
                ", Name='" + Name + '\'' +
                ", MobileNo=" + MobileNo +
                ", Email='" + Email + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Person p = new Person();
        p.Pid = 1234;
        p.Name = "Janhavi";
        p.MobileNo = 1234567890;
        p.Email = "abc@gmail.com";
        System.out.println(p.toString());

    }

}
