package ACodeWithHarry.Operators.QuickQuiz;

public class FirstQuiz {
    public static void main(String[] args) {
        System.out.print("1.");
        String p = "(x-y)/2: ";
        int x = 10;
        int y = 6;
        int p1 = (x-y)/2;
        System.out.println(p+p1);//2

        System.out.print("2.");
        String q = "-(b*b-4ac)/2a: ";
        int b = 4;
        int a = 2;
        int c = 4;
        int q1 = -(b*b-4*a*c)/(2*a);
        System.out.println(q+q1);//-8

        System.out.print("3.");
        String r = "v*v-u*u: ";
        int v = 8;
        int u = 4;
        int r1 = v*v-u*u;
        System.out.println(r+r1);

        System.out.print("4.");
        String s = "l*m-n: ";
        int l = 15;
        int m = 6;
        int n = 14;
        int s1 = l*m-n;
        System.out.println(s+s1);
    }
}
