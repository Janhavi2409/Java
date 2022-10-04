package Array1;

public class OneDArray {
    public static void main(String[] args) {
        int [] marks = new int[4];
        marks[0] = 89;
        marks[1] = 24;
        marks[2] = 62;
        marks[3] = 98;
        //marks[4] = 63;//ArrayIndexOutOfBoundsException
        System.out.println(marks[2]);

        int [] marks2 = {23, 62, 32, 98};
        System.out.println(marks2[3]);
        System.out.println(marks2.length);
    }
}
