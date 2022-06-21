public class ForLoop {
    public static void main(String[] args) {
        //for loop
        //1. simple for loop
        for (int i = 0;i<3; i++){
            System.out.println(i);
        }


        //2.Nested for loop
        for (int i = 0; i<5;i++){
            for(int j = 0;j<5;j++){
                System.out.println(i+""+j);
            }
        }

        //nested example
        for(int i = 3; i>0; i--){
            for(int j = 3; j>0; j--){
                System.out.println(i+""+j);
            }
        }

        //infinite loop
        //for(;;){
        //    System.out.println("Infinite loop");
        //}

        //enhanced fo loop
        int a[] = {5, 10, 15, 20, 25};
        for(int no : a){
            System.out.println(no);
        }

        //while loop
        int i=0;
        while(i<5){
            System.out.println("Hello");
            i++;
        }


        //Do While
//        int j=0;
//        do{
//            System.out.println("hello");
//
//        }
//        while(j<4);

        int result = 2;
        int p = 2;
        while(p>0){
            result = result*2;
            p--;
        }

        int no = 1;
        do{
            System.out.println("Hiiiiii!!!!");
            no++;
        }while(no<=5);
    }
}
