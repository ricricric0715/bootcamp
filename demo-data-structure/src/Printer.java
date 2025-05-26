// Java Generic
// ! 1. Less code/class during compile time (You don't need to write StringPrinter, IntegerPrinter)
// ! 2. You still need to define the T type during runtime

import java.util.ArrayList;

// E -> Java for Collection
// K,V -> Java for Map
// T,U,V
public class Printer<T> {
  private T value;

  public Printer(T value) {
    this.value = value;
  }

  public void print() {
    System.out.println(value);
  }

  public void setValue(T value) {
    this.value = value;
  }

  public static void main(String[] args) {
    // Runtime: StringPrinter
    Printer<String> sp = new Printer<>("hello");
    // sp.setValue(100); // error, because you already defined T is String
    sp.setValue("goodbye");

    Printer<Integer> ip = new Printer<>(10);
    ip.setValue(1000);
    ip.print(); // 1000

    // ! You don't need to write StringArrayList, IntegerArrayList
    ArrayList<String> names = new ArrayList<>();
    names.add("Peter");
    // names.add(10);
  }
}