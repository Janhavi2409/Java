package OOPsConcept;

class Student{
    int Rno;
    String Name;

    public Student(int rno, String name) {
        Rno = rno;
        Name = name;
    }
}
public class Constructor {
    public static void main(String[] args) {
        Student s1 = new Student(12, "Janhavi");
        System.out.println("Roll No: "+s1.Rno);
        System.out.println("Name: "+s1.Name);
    }
}
