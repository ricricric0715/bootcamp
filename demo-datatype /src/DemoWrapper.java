public class DemoWrapper {
  public static void main(String[] args) {
    
    // 8 Primitives 
    // 8 + 8 + 1 >> Primitives + Wrapper + String 
    // int -> Integer
    int x = 3;
    Integer x1 = 3;

    byte b = 4;
    Byte b1 = 4;

    short s = 9; 
    Short s1 = 9;

    long l = 8L;
    Long l1 = 8L;

    char c = 'a';
    Character c1 = 'a';

    boolean n = true;
    boolean n1 = true;

    // Primitives VS Wrapper
    // 
    System.out.println(x1.doubleValue());// 3 > 3.0
    System.out.println(x + x1);// int + int 
    Integer x2 = 10;

    // Value Comparison (compareTo, equals)
    System.out.println(x2.compareTo(x1)); // 1意思是 x2 >> x1
    Integer x3 = 10;
    System.out.println(x2.compareTo(x3)); //一樣 = 0 
    System.out.println(x1.compareTo(x2)); //-1 = x1 << x2  

    System.out.println(x2.equals(x1)); // false 


    // Math Operation 
    System.out.println(x1 + x2); //13
    System.out.println(x3 * x2); //100 

  


  }
}
