import java.math.BigDecimal;

public class Circle {
  
  private double radius; 
  private String color;
// private double area; // violate oop concept


// Constructor (all args constructor)
public Circle(double radius, String color){
  this.radius = radius; 
  this.color = color;
}

public String getColor(){
  return this.color;
}

public double getradius(){
  return this.radius;
}
  // what is the implication of "no setter"?
  // We cannot modify the date of oject after day1 creation 


  // type of Method : Presentation 
  public double area(){
    return BigDecimal.valueOf(this.radius)
    .multiply(BigDecimal.valueOf(this.radius))
    .multiply(BigDecimal.valueOf(Math.PI))
    .doubleValue();
  }

  public static double area2(double radius){
    return BigDecimal.valueOf(radius)
    .multiply(BigDecimal.valueOf(radius))
    .multiply(BigDecimal.valueOf(Math.PI))
    .doubleValue();
  }
  // static 一定不可以 this.

  // Type of Method : Presentation 
  public double diameter(){
    return BigDecimal.valueOf(this.radius)
    .multiply(BigDecimal.valueOf(this.radius))
    .multiply(BigDecimal.valueOf(2.0))
    .doubleValue();
  }


public static void main(String[] args) {
  
  Circle c1 = new Circle(3.5, "red");
  System.out.println(c1.area()); 

  Circle c2 = new Circle(4.5, "blue");
  System.out.println(c2.area());

  Circle[] circles = new Circle[2];
  circles[0] = c2;
  circles[1] = c1;

  System.out.println(circles[0].getColor()); // blue
  System.out.println(c2.getColor());
  // use array to find c1's area 
  System.out.println(circles[1].area());
  System.out.println(c1.area());

  System.out.println(c1.diameter());
  System.out.println(c2.diameter());

  // what if we dont backup the circle address 
  Circle[] circle2 = new Circle[3];
  circle2[0] = new Circle(9.0, "BLACK");
  circle2[1] = new Circle(2.3, "YELLOW");
  circle2[2] = new Circle(1.9, "PINK");
  System.out.println(circle2[0].getColor()); 

  // NON- OOP
  double radius = c1.getradius();
  double area = BigDecimal.valueOf(radius)
  .multiply(BigDecimal.valueOf(radius)) 
  .multiply(BigDecimal.valueOf(Math.PI))
  .doubleValue();
System.out.println(area);

  System.out.println();





  }

}
