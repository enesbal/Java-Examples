import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Resetting {
   public static void main(String[] args) throws Exception {
      Matcher m = Pattern.compile("[frb][aiu][gx]").matcher("fix the rug with bags");
      while (m.find())System.out.println(m.group());
      m.reset("fix the rig with rags");
      while (m.find())System.out.println(m.group());
      
      /*
            Pattern p = Pattern.compile("\\d");
      Matcher mat1 = p.matcher("9652018244");
      
      while (mat1.find()) {
         System.out.println("\t\t" + mat1.group());
      } 
      mat1.reset();
      System.out.println("After done resetting the Matcher, it should be like this");
      
      while (mat1.find()) {
         System.out.println("\t\t" + mat1.group());
      }
      */
   }
} 
