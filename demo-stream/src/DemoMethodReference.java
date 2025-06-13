import java.util.function.Supplier;

public class DemoMethodReference {
  

  public static void main(String[] args) {
    String name = "John";
  Supplier<Integer>LengthSupplier = () -> name.length();
  int length = LengthSupplier.get();

  Supplier<Integer>LengthSupplier2 = name::length; 
  int length2 = LengthSupplier2.get();

  }
}
