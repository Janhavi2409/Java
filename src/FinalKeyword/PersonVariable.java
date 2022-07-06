package FinalKeyword;

public class PersonVariable {
    int ID = 2409;
    String Name = "Janhavi";
    final String PAN_NO = "AMPFT2453L";
    final String  AADHAR_NO;
    final String MOBILE_NO;

   final static String BIRTH_DATE;
   //can be also written as (static final String BIRTH_DATE;)

//    PersonVariable(String mobile_no, String aadhar_no){
//        MOBILE_NO = mobile_no;
//        AADHAR_NO= "534561511679";
//    }
    static {
        BIRTH_DATE = "24/09/2004";
    }
    PersonVariable( String aadhar_no, String mobileNo){
        AADHAR_NO = aadhar_no;
        MOBILE_NO = mobileNo;
    }
    void display(){
        System.out.println("ID: " +ID);
        System.out.println("Name: "+Name);
        System.out.println("PAN No: "+PAN_NO);
        System.out.println("Aadhar No: "+AADHAR_NO);
        System.out.println("Mobile No: "+MOBILE_NO);
        System.out.println("DOB: "+BIRTH_DATE);
    }
}
class PersonVariableImpl{
    public static void main(String[] args) {
        PersonVariable person = new PersonVariable("434561511679", "7972336615");
        person.display();
    }

}