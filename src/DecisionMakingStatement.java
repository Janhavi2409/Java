public class DecisionMakingStatement {
    public static void main(String[] args) {

        //Desicion making
        //if/else
        String city = "Pune";
        if (city == "Pune") {
            System.out.println("You are from Pune");
        } else {
            System.out.println("You are from Mumbai");
        }


        if (city == "Mumbai") {
            System.out.println("You are from Mumbai");
        } else if (city == "Goa") {
            System.out.println("You are fromGoa");
        } else {
            System.out.println("You are from Pune");
        }


        String Country = "India";
        if (Country == "India") {
            if (city == "Goa") {
                System.out.println("Goa is in India");
            } else {
                if (city == "Pune") {
                    System.out.println("Pune is in India");
                }
            }
        } else {
            System.out.println("You are from other country");
        }

        //switch
        int ch = 0;
        switch (ch) {
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            default:
                System.out.println("No Matching Found");
        }

        int cab = 2;
        switch (cab) {
            case 1:
                System.out.println("one");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            default:
                System.out.println("No Matching Found");
        }
    }
}
