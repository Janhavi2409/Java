public class RightTriangularStar {
    public static void main(String[] args) {
        int n = 4;
        //inner loop
        for(int i = 1;i<=n;i++)
        {
            //outer loop
            for(int j = n; j>i;j--)
            {
                System.out.print("- ");
            }
            for (int k = 1;k<=i;k++);
            {
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
