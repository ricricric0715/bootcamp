public class Account {
  
  private String userId ;
  private double balance ;

  public Account (){
    this.balance = 10.0;
  }

  public Account (String userid, double balance){
  this.userId = userId;
  this.balance = balance;
}

  public void setUserId(String userId){
    this.userId = userId;
  }

  public String getUserId(){
    return this.userId;
  } 

  public void setBalance(double balance){
  this.balance = balance ; 
  }

  public double getBalance(){
    return this.balance;
  }


  public static void main(String[] args) {

    Account [] accounts = new Account[3]; // create Account Array Object
    Account a1 = new Account();
    Account a2 = new Account();
    a2.setBalance(800.0);
    Account a3 = new Account(); 
    // accounts[0] = a1;
    accounts[1] = a2;
    // accounts[2] = a3;

    System.out.println(accounts[1].getBalance()); //800.0
    // System.out.println(accounts[0].getBalance()); // !error, why not 0.0 ?


  String[] names = new String[3];
  String s1 = "John";
  String s2 = "Peter";
  String s3 = "Sally";
   names [0] = s1;
   names [1] = s2;

    System.out.println(names[0].length());
    System.out.println(names[1].length());

    
  }
}
