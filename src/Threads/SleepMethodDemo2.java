package Threads;

public class SleepMethodDemo2 implements Runnable {
    @Override
    public void run() {
        System.out.println("In run method");

    }
}
class SleepMethodDemo2Impl{
    public static void main(String[] args) {
        SleepMethodDemo t1 = new SleepMethodDemo();
        Thread th1 = new Thread();
        th1.setName("T1");
        th1.start();
        for(int i=1; i<=5; i++){
            try {
                System.out.println(Thread.currentThread().getName()+" "+i);
                Thread.sleep(1000l);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
//            System.out.println(i);
        }
    }
}
