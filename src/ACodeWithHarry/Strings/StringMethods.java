package ACodeWithHarry.Strings;

public class StringMethods {
    public static void main(String[] args) {
        String name = "Seema";
        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.trim());
        System.out.println(name.substring(4));
        System.out.println(name.replace('S', 'R'));

        if(name.startsWith("S")){
            System.out.println("The name starts with S");
        }else{
            System.out.println("The name does not start with S");
        }

        if(name.endsWith("a")){
            System.out.println("The name ends with a");
        }else {
            System.out.println("The name does not end with a");
        }

        System.out.println(name.charAt(3));
        System.out.println(name.indexOf('m'));
        System.out.println(name.lastIndexOf('e'));
        System.out.println(name.lastIndexOf('e',4));

        if(name.equals("Seema")){
            System.out.println("True");
        }else {
            System.out.println("False");
        }
    }
}
