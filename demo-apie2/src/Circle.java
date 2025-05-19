import java.math.BigDecimal;

public class Circle extends Shape {
  private double radius;

  public Circle(double radius) {
    super(color);
    this.radius = radius;
  }

  @Override
  public double area() {
    return BigDecimal.valueOf(this.radius)
        .multiply(BigDecimal.valueOf(this.radius)) //
        .multiply(BigDecimal.valueOf(Math.PI)) //
        .doubleValue();
  }

  public static void main(String[] args) {
    Object o1 = new object();
    Object o2 = new object();
    Object o3 = o1;

    System.out.println(02);




  }



}