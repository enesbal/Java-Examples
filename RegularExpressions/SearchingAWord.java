import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
   public static void main(String args[]) {
      Pattern p = Pattern.compile("j(ava)");
      String candidateString = "This is a java program. This is another java program.";
      Matcher matcher = p.matcher(candidateString);
      int nextIndex = matcher.start(1);
      
      System.out.println(candidateString);
      System.out.println("The index for java is:" + nextIndex);
   }
}
