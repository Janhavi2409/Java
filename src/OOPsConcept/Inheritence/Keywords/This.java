package OOPsConcept.Inheritence.Keywords;

class Data {
    String Name;
    int Age;

    public Data(String name, int age) {
        this.Name = name;
        this.Age = age;
    }
}

public class This {
    Data data = new Data("Janhavi", 18);
}
