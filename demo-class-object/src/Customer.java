public class Customer {
  private long id; //
  private String name; 
  private Order[] orders;  


  // main 
  // John --> many Order --> items 
  // isVIP (): 
  // total amount of orders > 100_000 

  public Customer(long id, String name){
    this.orders = new Order[0];
    this.id = id;
    this.name = name; 
  }


  public void add(Order newOrder){
    Order[] newOrders = new Order[this.orders.length + 1];
  for (int i = 0; i < this.orders.length;i++){
    newOrders[i] = orders[i];
  }
  newOrders[newOrders.length -1 ] = newOrder; 
  this.orders = newOrders;
  }

  public boolean isVIP() {
    double total = 0.0;
    for (int i = 0; i < this.orders.length; i++){
      total += this.orders[i].checkoutAmount();
    }
    // if (total > 100_000){
    // return true; 
    // } 
    // return false  
        return total > 100_000; 
    }

    public void setName(String name){
      this.name = name; 
     }

     public void setId(String id){
      this.id = id ;
     }


    public static void main(String[] args) {
      Customer c1 = new Customer();
      c1.setName("John"); 

      Item itemA = new Item(10.9, 2);
      Item itemB = new Item(99.9, 3);
      Order orderA = new Order(itemA);





    }
  }



