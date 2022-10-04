package Array1;

public class DisplayArray {
    public static void main(String[] args) {
        int [] array = {24, 48, 78, 93};
        //print in correct order(for loop)
        for (int i=0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println();
        //print in correct order(for each loop)
        for (int element: array){
            System.out.print(element+" ");
        }
        System.out.println();
        //print in reverse order
        for (int i= array.length-1; i>=0;i--){
            System.out.print(array[i]+" ");
        }
    }
}
