package Assignment;

public class FibboSeries {
    public static void main(String[] args) {
        int limit = 10;
        int no1 = 0;
        int no2 = 1;
        System.out.println(no1);
        System.out.println(no2);
        while(limit>0){
            int next = no1+no2;
            System.out.println(next);
            no1 = no2;
            no2 = next;
            limit--;
        }
    }
}
