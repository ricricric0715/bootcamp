public class DemoMath {
  
  public static void main(String[] args) {
    
    // pow 
    // 2^4 = 16

    double result = Math.pow(2.0, 4.0);
    System.out.println(result);//16


    int x = 3;
    int y = 7;
    System.out.println(Math.abs(x-y)); //找出兩個數字的距離 
    
    System.out.println(Math.round(9.45));//9 變成整數,不要點數 
    System.out.println(Math.sqrt(81));//9 開方 

    System.out.println(Math.max(3,9)); // 9 最大那個數字
    System.out.println(Math.max(9,3)); // 9 最大那個數字

    System.out.println(Math.min(2,8)); //2 最小那個數字
    System.out.println(Math.min(8,2)); //2 最小那個數字

  }
}