public class DemoLiteral {
  
// !Literal Pool --> String 
// !Literal Cache --> Integer, Byte, Short, Long, Boolean, Character 

  public static void main(String[] args) {
    String s1 = "hello";
    String S2 = "hello";
    String s3 = "Olloe";
    System.out.println(s1.equals(S2)); // true, String, Author determine the defintion of equals()
    System.out.println(s3.equals(2)); // false 

    String s4 = new String("hello");
    System.out.println(s1 == s4); //false 
    String s5 = new String("hello");
    System.out.println(s4 == s5); // false 
    String s6 = new String("hello").intern();
    System.out.println(s1 == s6); 
    System.err.println(s4 == s6); 


    // -128 to 127 integer 
    Integer i1 = 127; 
    Integer i2 = 127; // check if interal cache contain 127 
    Integer i3 = new Integer(127); 
    System.out.println(i1 ==i2); //true 
    System.out.println(i1 == i3); // false 

    //! 
    Integer i4 = 128; 
    Integer i5 = 128; 
    System.out.println(i4 == i5); //false 

    // -128 to 127 
    Byte b1 = 127;
    Byte b2 = 127;
    System.out.println(b1 == b2); //true 
    Byte b3 = new Byte("127");
    System.out.println(b1 == b3); //false 

    Boolean n1 = true;
    Boolean n2 = true;
    Boolean n3 = new Boolean(true);
    System.out.println(n1 == n2);
    System.out.println(n1 == n3);

    // Character (0-6xxxx), Cache 0-127 
    Character c1 = 'A';
    Character c2 = 'A';
    Character c3 = '我';
    Character c4 = '我';
    System.out.println(c1 == c2 ); //true 
    System.out.println(c3 == c4); //false, 因為'我'超過127
    
    //ValueOf()
    Integer i10 = Integer.valueOf(100);
    Integer i11 = Integer.valueOf(100);
    System.out.println(i10 == i11); //true
    // 什麼是Cache ?

    //Conclusion 
    //! For String , Integer , in real life , we should use "hello" or String.valueOf("hello")
    //! For Integer, inreal 


  }
}
