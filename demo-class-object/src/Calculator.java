public class Calculator {
  
    // 什麼是object ??
    private int x ; 
    private int y; 
  
    public Calculator(int x, int y){
      this.x = x;
      this.y = y;
    }

      // Presentation 
    public int product(){
    return this.x * this.y;
  }
  
    public void setX(int x){
      this.x = x;
    }
  

    
    public static int sum(int x, int y){
      return x * y;
    }
    

  public static void main(String[] args) {
    
    System.out.println(Calculator.sum(2, 9));
    
  }
}
