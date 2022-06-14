public class DecisionMakingStatement {
    public static void main(String[] args) {
        String city = "Pune";
        if(city == "Pune") {
            System.out.println("You are from Pune");
        }
        else{
            System.out.println("You are from Mumbai");
        }


        if(city == "Mumbai"){
            System.out.println("You are from Mumbai");
        }
        else if(city == "Goa"){
            System.out.println("You are fromGoa");
        }
        else{
            System.out.println("You are from Pune");
        }


        String Country = "India";
        if(Country == "India"){
            if(city == "Goa"){
                System.out.println("Goa is in India");
            }
            else{
                if (city == "Pune"){
                    System.out.println("Pune is in India");
                }
            }
        }
        else{
            System.out.println("You are from other country");
        }
    }
}
