import java.math.BigDecimal;

public class BigDecimalTTT {
  public static void main(String[] args) {
    

    double r1 = 0.1 + 0.2;
    System.out.println(r1); 

    BigDecimal bd1 = new BigDecimal("0.1");
    BigDecimal bd2 = BigDecimal.valueOf(0.2);

    BigDecimal bd3 = bd1.add(bd2);// "+數"方法
    System.out.println(bd3);


    BigDecimal x = new BigDecimal("0.11");
    BigDecimal y = new BigDecimal("2");
    BigDecimal z = x.add(y);
    System.out.println(z);

    


  }
}
