package ExceptionExamples;

/**
 * Created by enes on 11/4/2017.
 */
public class UseOfFinally {
    public static void main(String[] args) {
        new UseOfFinally().doTheWork();
    }
    public void doTheWork(){
        Object o = null;
        try {
            for(int i=0; i<5; i++){
                o = makeObj(i);
            }
        }catch (IllegalArgumentException e){
            System.err.println("Error: ("+e.getMessage()+").");
            return;
        }finally {
            System.err.println("All done");
            if(o==null)
                System.exit(0);
        }
        System.out.println(o);
    }

    public Object makeObj(int type) throws IllegalArgumentException{
        if(type == 1 ) throw new IllegalArgumentException("Dont't like type "+ type);
        return new Object();
    }
}
