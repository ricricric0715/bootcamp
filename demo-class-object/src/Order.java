public class Order {
  
    // checkout amount 
    // private double[] prices; 
    // private double[] quantities; 

    // Alternative 
  private Item[] items; 
  // private String coupon;  

  public Order(){
    this.items = new Item[0]; 
  }
  
  public void add(Item newItem){
    Item[] newItems = new Item[this.items.length + 1];
  for (int i = 0; i < this.items.length;i++){
    newItems[i] = items[i];
  }
  newItems[newItems.length -1 ] = newItem; 
  this.items = newItems;
  }

    // BigDemical 
    //! Item.java owns price & quality (attribute), so Item has to present price and quality
  public double checkoutAmount(){
    double total = 0.0;
    for (int i = 0; i < this.items.length; i++){
      total += this.items[i].subtotal();
    }
    return total; 
  }



  public static void main(String[] args) {
    
    Order order = new Order();

    Item itemA = new Item(99, 2);
    order.add(itemA);

    Item itemB = new Item(14, 3);
    order.add(itemB);

    System.out.println(order.checkoutAmount()); //240


  }
}
