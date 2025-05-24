import java.util.HashSet;

public class DemoHashSet {

  public static void main(String[] args) {
    
    HashSet<String> strings = new HashSet<>();
    strings.add("John");
    strings.add("Peter");
    strings.add("Lucas");
    System.out.println(strings.size()); //3
    System.out.println(strings);
    
    


  }
}
