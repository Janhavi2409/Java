package Constructor;

public class Person {
    int id;
    String Name;
    Person(int i, String nm){
        id = i;
        Name = nm;
    }
    Person(){
        System.out.println("Default Constructor");
    }
    Person(String nm){
        Name = nm;
    }
    void display(){
        System.out.println("Id: "+id);
        System.out.println("Name: "+Name);
    }
}
class PersonImpl{
    public static void main(String[] args) {
      Person p1 = new Person(6,"Zen");
      p1.display();
      Person p2 = new Person();
      Person p3 = new Person("Janhavi");
        p3.display();
    }
}
