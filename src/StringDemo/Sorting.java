package StringDemo;

public class Sorting {
    public static void main(String[] args) {
        String abc = "username@123 password";

        //Space
        if(abc.trim().length()>0){
            System.out.println("Space > 0");
        }else{
            System.out.println("Space = 0");
        }

        //number of vowels
        int count =0;
        for(int i=0; i<abc.length(); i++){
            if(abc.charAt(i)=='a'||abc.charAt(i)=='e'
               ||abc.charAt(i)=='i'||abc.charAt(i)=='o'
               ||abc.charAt(i)=='u'){
                count++;
            }
        }
        System.out.println("Number of vowels = "+count);

        //number of consonants
       int consonants = 0;
       for(int i=0; i<abc.length();i++) {
           if (abc.charAt(i)=='b'||abc.charAt(i)=='c'||abc.charAt(i)=='d'||abc.charAt(i)=='f'
               ||abc.charAt(i)=='g'||abc.charAt(i)=='h'||abc.charAt(i)=='j'||abc.charAt(i)=='k'
               ||abc.charAt(i)=='l'||abc.charAt(i)=='m'||abc.charAt(i)=='n'||abc.charAt(i)=='p'
               ||abc.charAt(i)=='q'||abc.charAt(i)=='r'||abc.charAt(i)=='s'||abc.charAt(i)=='t'
               ||abc.charAt(i)=='v'||abc.charAt(i)=='w'||abc.charAt(i)=='x'||abc.charAt(i)=='y'
               ||abc.charAt(i)=='z'){
               consonants++;
           }
       }
        System.out.println("Number of consonants = "+consonants);


       //number of numbers
        int no = 0;
        for(int i = 0;i<abc.length();i++){
            if(abc.charAt(i)==1||abc.charAt(i)==2||abc.charAt(i)==3||abc.charAt(i)==4||abc.charAt(i)==5
               ||abc.charAt(i)==6||abc.charAt(i)==7||abc.charAt(i)==8||abc.charAt(i)==9||abc.charAt(i)==0){
                no++;
            }
        }
        System.out.println("Number of digits = "+no);
    }
}