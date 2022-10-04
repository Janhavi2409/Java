package Test;

public class Q2 {
    public static void main(String[] args) {
        String str = "CoDeKuL";
        if (!str.isEmpty()) {
            char[] ch = str.toCharArray();
            for (int i = 0; i < ch.length; i++) {
                int asciiValue = (int) ch[i];
                if (asciiValue >= 97 && asciiValue <= 122) {
                    asciiValue = asciiValue - 32;
                    System.out.print((char) asciiValue);
                } else if (asciiValue >= 67 && asciiValue <= 90) {
                    asciiValue = asciiValue + 32;
                    System.out.print((char) asciiValue);
                } else {
                    System.out.println();
                    System.out.println(ch[i] + " Invalid Input");
                }
            }
        }
    }
}
