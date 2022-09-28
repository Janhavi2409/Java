package OOPsConcept;

class Emp {
    int Salary;
    String Name;

    public int getSalary() {
        return Salary;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getName() {
        return Name;
    }
}

public class Employee1 {
    public static void main(String[] args) {
        Emp e1 = new Emp();

        e1.Salary = 1000000;
        e1.setName("Janhavi");

        System.out.println("Name: " + e1.getName());
        System.out.println("Salary: " + e1.getSalary());
    }


}
