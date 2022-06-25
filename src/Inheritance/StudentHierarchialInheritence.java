package Inheritance;

public class StudentHierarchialInheritence {
    String name = "Janhavi";
    int rno = 2232;
    String Div = "B";
}
class PhysicsMarks extends StudentHierarchialInheritence{
    double marks = 79;
}
class ChemistryMarks extends StudentHierarchialInheritence{
    double marks = 85;
}
class MathsMarks extends StudentHierarchialInheritence{
    double marks = 90;
}
class StudentHierarchialInheritenceImpl{
    public static void main(String[] args) {
        MathsMarks mathsMarks = new MathsMarks();
        ChemistryMarks chemistryMarks = new ChemistryMarks();
        PhysicsMarks physicsMarks = new PhysicsMarks();

        double total = mathsMarks.marks + chemistryMarks.marks + physicsMarks.marks;
        double percentage = (total/300)*100;
        System.out.println("***********************Student 12th Board details***********************");
        System.out.println("Name: "+mathsMarks.name);
        System.out.println("Roll no.: "+mathsMarks.rno);
        System.out.println("Div: "+mathsMarks.Div);
        System.out.println("Percentage: "+percentage);
    }
}
