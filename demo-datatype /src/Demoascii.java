public class Demoascii {
  public static void main(String[] args) {
    
    char c = 'a'; // 97 in ascii 
    int x = c; //safe 
    System.out.println(x); //97 

    int y = 65 ; 
    char c2 = (char)y; // 如果無(char),只放丫, java覺得不安全 
    System.out.println(c2);

    // ! char 0-65535 
    System.out.println((char)48); //0 
    System.out.println((char)66000); //ǐ
    System.out.println((char)65610); //J
    System.out.println((char)65539);

    int x1 = 128; 
    byte b1 = (byte)x1;
    System.out.println(b1);// -128


    // byte -> short -> int -> long -> float -> double 升級轉換次序
    // char -> int 
    float f1 = 10L;
    System.out.println(f1);
    double d1 = 100.25f;
    System.out.println(d1);

    long l2 = (long)10.9f; // 降級關係, 需要強行(long)
    System.out.println(l2);

    int x8 = 33000;
    short s3 = (short)x8;
    System.out.println(x8);

    




  }
}
