public class DemoString {
  public static void main(String[] args) {
    String s = "john";
    String s2 = "Dear Sir";

    // String -> Store value + functions
    String s3 = "Steven";
    s3 = "Vincent";
    System.out.println(s3);

    System.out.println(s3.equals("Vincent"));
    System.out.println(s3.equals("vincent"));

    // Function : length()
    System.out.println(s3.length());

    //Function 3 : CharAt()
    // index starts with 0
    // index range 0-6, lenth = 7
    System.out.println(s3.charAt(2));

    //print the character of s3
    s3 = "connie";
    System.out.println(s3.charAt(s3.length()-1));


  }
}
