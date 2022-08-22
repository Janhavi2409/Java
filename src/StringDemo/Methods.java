package StringDemo;

public class Methods {
    public static void main(String[] args) {
        String S1 = "Pune";
        String S2 = "Mumbai";
        String S3 = new String("Pune");
        if(S1==S2){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
        if(S1==S3){
            System.out.println("True");
        }else{
            System.out.println("False");
        }


        if(S1.equals(S2)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
        if(S1.equals(S3)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }

        System.out.println(S1.compareTo(S2));
        System.out.println(S1.compareTo(S3));

        if(S1.equalsIgnoreCase(S2)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
        if(S1.equalsIgnoreCase(S3)){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}
