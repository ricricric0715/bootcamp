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

    // Function 2 : length()
    System.out.println(s3.length());

    //Function 3 : CharAt()
    // index starts with 0
    // index range 0-6, lenth = 7
    System.out.println(s3.charAt(2));

    //print the character of s3
    s3 = "connie";
    System.out.println(s3.charAt(s3.length()-1));

    // find middle character of name 
    String name = "joey";
    // joey -> e
    // Vincent -> c

    // Function 4 : indexOf() 在那裡出現 
    String s4 = "Sallyll";
    System.out.println(s4.indexOf('a'));//1 
    System.out.println(s4.indexOf('b'));//-1
    System.out.println(s4.indexOf('l'));//2
    System.out.println(s4.lastIndexOf('l'));//6
    System.out.println(s4.indexOf("ll"));//2
    System.out.println(s4.lastIndexOf("ll"));//5

    //Function 5 : contains() find true or false
    System.out.println(s4.contains("ll"));
    System.out.println(s4.contains("lll"));// sally does not contain lll
    System.out.println(s4.contains("aa"));
    System.out.println(s4.contains("a"));
    
    if (s4.contains("ll")){
      System.out.println("the name contains \"ll\"");
    }

    // Function 6: startsWith and endsWith()find true or false
    System.out.println(s4.startsWith("Sa"));// true
    System.out.println(s4.startsWith("Sab"));//false 
    System.out.println(s4.endsWith("lly"));//true 
    System.out.println(s4.endsWith("llly"));//false 

    if (s4.startsWith("Sa")){
      System.out.println("hello");
    }else{
      System.out.println("goodbye");
    }

    // Function 7: isEmpty() 
    String s5 = ""; //empty String 
    System.out.println(s5.isEmpty());//true 
    System.out.println(s4.isEmpty());
    
      if(s5.isEmpty()){
        System.out.println("s5 is really an empty String");
      }else{
        System.out.println("s5 is not an empty String");
      }

      // Function 8 : concat()
      String s6 = "abc";
      System.out.println(s6.concat("vincent")); //abcvincent
      System.out.println(s6); //abc

      // Function 9 replace() 
      String s7 = "hello";
      System.out.println(s7.replace("l","x"));
      System.out.println(s7.replace("l","abc"));// heabvabco
      System.out.println(s7); // hello 

      // Function 10 substring() MUST index -1
      String s8 = "hello world";
      System.out.println(s8.substring(4,7));// o, w 

      // Function 11 : toLowerCase(), 
      String s9 = "Hello";
      System.out.println(s9.toUpperCase());//HELLO
      System.out.println(s9.toLowerCase());//hello 


      // Function 12 value()-> Conversion 
      int x = 3;
      String ss = String.valueOf(x);
      System.out.println(ss);
      String ss2 = String.valueOf(3.3);
      System.out.println(ss2);

      double d1 = Double.valueOf("3.3");
      System.out.println(d1);//3.3



  }
}
