public class Running extends Shoe {
  
  private int size; 

  public Running(double price, int size){
    super(price);
    this.size = size;
  }

  public double getPrice(){
    return super.getPrice() + 150;
  }

  public int getSize(){
    return getSize();
  }


public static void main(String[] args) {

  Running running = new Running(200, 9);
  System.out.println(running.getPrice());
System.out.println(running.getSize());

  }
}
