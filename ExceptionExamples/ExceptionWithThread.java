package ExceptionExamples;

/**
 * Created by enes on 11/5/2017.
 */
 class MyThread extends Thread {
    public void run(){
        System.out.println("Throwing in "+ "MyThread");
        throw new RuntimeException();
    }
}

public class ExceptionWithThread{
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Caught it" + e);
        }
        System.out.println("Exiting main");
    }
}