public class Shape {
    private static int counter = 0;
    private static final double PI = 3.14159; //constant 
    private final String name = "John";
    private String color; // attribute (setter, getter)
    // final = finalized 
    
    public Shape(){

    }

    public String getName(){
      return this.name;
    } 

    //常數 = 恆常不變 , 例如 1min = 60sec 



    public static void main(String[] args) {
      
      System.out.println(Shape.PI);
      // !because Shape.PI is a "final" varible , so cannot be modified 
      // Shape.PI += 1;
      Shape.counter++;
      System.out.println(Shape.counter);

      new Shape().counter++; 
      Shape.counter++;// normal usage 
      System.out.println(Shape.counter);

      // print John 

      new Shape().counter++; 
      System.out.println(new Shape().getName());





    }
}
