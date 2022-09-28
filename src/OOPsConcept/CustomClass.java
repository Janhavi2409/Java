package OOPsConcept;

//custom class:-
class Employee {
    int id;
    String name;
    int Salary;

    public void printDetails() {
        System.out.println("My ID is " + id);
        System.out.println("My name is " + name);
        System.out.println("My salary is "+ Salary);
    }

    public int getSalary() {
        return Salary;
    }
}


public class CustomClass {
    public static void main(String[] args) {
        System.out.println("This is a CUSTOM CLASS");
        Employee e1 = new Employee();//Instantiating new Employee object
        Employee e2 = new Employee();//Instantiating new Employee object
        Employee e3 = new Employee();//Instantiating new Employee object

        //Setting Attributes
        e1.id = 1;
        e1.name = "Janhavi";
        e1.Salary = 43000;
        e2.id = 2;
        e2.name = "Pranali";
        e2.Salary = 42000;
        e3.id = 3;
        e3.name = "Prajakta";
        e3.Salary = 41000;

        //Printing the Attributes
        e1.printDetails();
        e2.printDetails();
        e3.printDetails();
        //System.out.println(e1.id);
        //System.out.println(e1.name);
        //int Salary1 = e1.getSalary();
        //System.out.println(Salary1);
        //System.out.println(e2.id);
        //System.out.println(e2.name);
        //int Salary2 = e2.getSalary();
        //System.out.println(Salary2);
        //System.out.println(e3.id);
        //System.out.println(e3.name);
        //int Salary3 = e3.getSalary();
        //System.out.println(Salary3);
    }
}
