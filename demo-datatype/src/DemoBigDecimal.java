import java.math.BigDecimal;

public class DemoBigDecimal {
  public static void main(String[] args) {
    
    double r1 = 0.1 + 0.2;
    System.out.println(r1);// 0.3000000000000004 
// BigDecimal 小數加減
    double x = 0.2;
    String s = "0.2";
    BigDecimal bd1 = new BigDecimal("0.1");  // 
    BigDecimal bd2 = BigDecimal.valueOf(Double.valueOf(s)); // 本身 double使用 
    
    BigDecimal bd3 = bd1.add(bd2); // Math 
    System.out.println(bd3);

    float f1 = bd3.floatValue();
    System.out.println(f1);

    double d1 = bd3.doubleValue();
    System.out.println(d1);

    int i1 = bd3.intValue();
    System.out.println(i1);


    String s1 = bd3.toString();
   System.out.println(s1);

    BigDecimal bd4 = bd1.subtract(bd2);//減數 
    System.out.println(bd4);



    System.out.println(0.3-0.1);// 0.19999999999998
    double result = BigDecimal.valueOf(0.3).subtract(BigDecimal.valueOf(0.1)).doubleValue();
    System.out.println(result);

    System.out.println((0.1 * 0.2)); //0.2000000000004
    double result2 = BigDecimal.valueOf(0.1).multiply(BigDecimal.valueOf(0.2)).doubleValue();
    System.out.println(result2);

    double result22 = BigDecimal.valueOf(0.5).multiply(BigDecimal.valueOf(0.7)).doubleValue();
    System.out.println(result22);
    
    System.out.println(0.3 / 0.1); // 2.999999996
    double result3 = BigDecimal.valueOf(0.3).divide(BigDecimal.valueOf(3)).doubleValue();
    System.out.println(result3);

    double result33 = BigDecimal.valueOf(0.9).divide(BigDecimal.valueOf(0.3)).doubleValue();
    System.out.println(result33);
    

    //10/3 --> 3.3333333333
    
    //HALFUP = 四捨五入 8.25 > 8.3 
    

    //HALFDOWN = 8.25 > 8.2 

    // 乘數 Setscale
    // 除數 Roundingmode 


  }
}