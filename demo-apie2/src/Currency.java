//JVM create enum objects by your constructor 
public enum Currency {
  
  HKD(1, "Hong Kong Dollar"), //  
  USD(2, "US Dollar"), // 
  CNY(3, "China Dollar"), // 
  JPY(4, "Japan Dollar"), // 
  ;

  private int value; 
  private String description; 

  private Currency( int value, String description){
    this.value = value;
    this.description = description;
  } 


  private Currency(int value){ 
    this.value = value;
  } 

  public int getValue(){
    return this.value;
  }

  public String getDescription(){
    return this.description;
  } 

  public static void main(String[] args) {
   System.err.println(Currency.USD.getValue()); //2
    System.out.println(Currency.USD.getDescription());


  }
}
