import java.util.HashMap;

public class Car {
  


    public static void main(String[] args) {
   
    HashMap<String, String> fruitMap = new HashMap<>();
    fruitMap.put("A", "Apple");
    fruitMap.put("O", "Orange");
    fruitMap.put("L", "Lemon");
   
    System.out.println(fruitMap.size());
    System.out.println(fruitMap.get("A"));
    System.out.println(fruitMap.get("X"));
  }
}
