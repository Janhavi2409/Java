package JDBC;

public class MysqlSelectDemo {
    public static void main(String[] args) throws ClassNotFoundException {
    //    Class.forName("com.mysql.cj.jdbc.Driver");
    //    Abc abc = new Abc();
    }
}

class Abc{
    static {
        System.out.println("in static");
    }
    {
        System.out.println("in instance block");
    }
}
