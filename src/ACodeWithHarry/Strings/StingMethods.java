package ACodeWithHarry.Strings;

public class StingMethods {
    public static void main(String[] args) {
        String name = new String("Janhavi Dahatonde");
        System.out.println(name);
        System.out.println(".length(): " + name.length());
        System.out.println(".toLowerCase(): " + name.toLowerCase());
        System.out.println(".toUpperCase(): " + name.toUpperCase());
        System.out.println(".substring(4): " + name.substring(4));
        System.out.println(".substring(5, 10): " + name.substring(5, 10));
        System.out.println(".replace('h', 'a'): " + name.replace('h', 'a'));
        System.out.println(".replace(' ', '_')"+name.replace(' ', '_'));
        System.out.println(".replace(\"havi\", \"vi\") " + name.replace("havi", "vi"));
        System.out.println(".startsWith(\"Jan\"): " + name.startsWith("Jan"));
        System.out.println(".startsWith(\"Abc\"): " + name.startsWith("Abc"));
        System.out.println(".endsWith(\"de\"): " + name.endsWith("de"));
        System.out.println(".endsWith(\"abc\"): " + name.endsWith("abc"));
        System.out.println(".charAt(2): " + name.charAt(2));
        System.out.println(".indexOf(\"h\"): " + name.indexOf("h"));
        System.out.println(".lastIndexOf(\"n\"): " + name.lastIndexOf("n"));
        System.out.println(".equals(\"Janhavi Dahatonde\"): " + name.equals("Janhavi Dahatonde"));
        System.out.println(".equals(\"abcdef\"): " + name.equals("abcdef"));
        System.out.println(".equalsIgnoreCase(\"Janhavi Dahatonde\"): " + name.equalsIgnoreCase("Janhavi Dahatonde"));
        System.out.println(".equalsIgnoreCase(\"janhavi dahatonde\"): " + name.equalsIgnoreCase("janhavi dahatonde"));
        String name2 = new String("   Janhavi    ");
        System.out.println(name2);
        System.out.println(".trim(): " + name2.trim());
    }
}
