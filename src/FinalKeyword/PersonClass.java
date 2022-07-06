package FinalKeyword;



final class PersonClass {
    void display(){
        System.out.println("hello this is JD");
    }
}
//class Person1 extends PersonClass{
//    public Person1() {
//
//    }
//}
class PersonClassImpl{
    public static void main(String[] args) {
        PersonClass person = new PersonClass();
        person.display();
    }
}
