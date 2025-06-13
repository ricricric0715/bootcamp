public class DemoSwitchExpression {
  
  public static void main(String[] args) {
    
    Currency currency = Currency.USD;
    if (currency == Currency.HKD){

    } else if(currency == Currency.USD) {

    } else if (currency == Currency.CNY){

    }

    Currency amountCurrency = Currency.USD; 
    double amount = 10.0; 
    double amountInHKD = switch (currency) {
      case HKD -> amount * 1.0;
      case USD -> amount * 7.8; 
      case CNY -> amount * 1.13;   
    };
   
    
  }
  public static enum Currency{
    HKD, USD, CNY,; 
  }

}
