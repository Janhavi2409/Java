package Arrays;

public class ArrayRotateLeft {
    public static void rotateLeft(int array[], int a, int n) {
        for(int i=0; i<a; i++)
            rotateArrayByOne(array,n);

    }
    private static void rotateArrayByOne(int[] array, int n) {
        int i;
        int temp;
        temp= array[0];
        for(i=0;i<n-1;i++)
            array[i]=array[i+1];
            array [i]=temp;
        }



    public static void main(String[] args) {
        int array[]={1, 2, 3, 4, 5};
        int r=2;
        int n = array.length;
        System.out.println("Array before rotation:");
        for(int i=0;i<n; i++)
            System.out.print(array[i]+" ");

        System.out.println();
        rotateLeft(array,r,n);
        System.out.println("\nArray after rotation: ");
        for(int i = 0; i<n; i++)
            System.out.print(array[i]+ " ");

    }
}
