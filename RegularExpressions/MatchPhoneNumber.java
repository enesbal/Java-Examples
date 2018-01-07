public class MatchPhoneNumber {
   public static void main(String args[]) {
      isPhoneValid("1-999-585-4009");
      isPhoneValid("999-585-4009");
      isPhoneValid("1-585-4009");
      isPhoneValid("585-4009");
      isPhoneValid("1.999-585-4009");
      isPhoneValid("999 585-4009");
      isPhoneValid("1 585 4009");
      isPhoneValid("111-Java2s");
   }
   public static boolean isPhoneValid(String phone) {
      boolean retval = false;
      String phoneNumberPattern = "(\\d-)?(\\d{3}-)?\\d{3}-\\d{4}";
      retval = phone.matches(phoneNumberPattern);
      String msg = "NO MATCH: pattern:" + phone + "\r\n regex: " + phoneNumberPattern;
      
      if (retval) {
         msg = " MATCH: pattern:" + phone + "\r\n regex: " + phoneNumberPattern;
      }
      System.out.println(msg + "\r\n");
      return retval;
   }
}
