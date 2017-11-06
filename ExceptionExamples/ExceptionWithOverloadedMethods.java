package ExceptionExamples;

/**
 * Created by enes on 11/5/2017.
 */
class NewClass1{
    void msg() throws Exception{System.out.println("this is parent");}
}

public class ExceptionWithOverloadedMethods extends NewClass1 {
    ExceptionWithOverloadedMethods(){

    }
    void msg() throws ArithmeticException{System.out.println("This is child");}

    public static void main(String[] args) {
        NewClass1 n = new ExceptionWithOverloadedMethods();
        try {
            n.msg();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
