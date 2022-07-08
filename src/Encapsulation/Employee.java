package Encapsulation;

public class Employee {
    private int id;
    private String Name;
    private double Salary;
    private double Bonus;
    private String Email;
    private double salBon;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getName() {
        return Name;
    }

    public void setSalary(double salary) {
        Salary = salary;
    }

    public double getSalary() {
        return Salary;
    }

    public void setBonus(double bonus) {
        Bonus = bonus;
    }

    public double getBonus() {
        return Bonus;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getEmail(String email) {
        return Email;
    }

    public void setSalBon() {
        this.salBon = Salary+Bonus;
    }

    public double getSalBon() {
        return Salary+Bonus;
    }
}

class EmployeeImpl{
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setId(2409);
        e1.setName("Janhavi");
        e1.setSalary(80000);
        e1.setBonus(14000);
        e1.setSalBon();
        e1.setEmail("janhavidahatonde@gmail.com");

        System.out.println("Id: "+e1.getId());
        System.out.println("Name: "+e1.getName());
        System.out.println("Salary: "+e1.getSalary());
        System.out.println("Bonus: "+e1.getBonus());
        System.out.println("Total: "+e1.getSalBon());
        System.out.println("Email: "+e1.getEmail("janhavidahatonde@gmail.com"));
    }
}
