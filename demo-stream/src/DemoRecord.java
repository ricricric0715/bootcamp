public class DemoRecord {
  
  public static void main(String[] args) {
    Staff staff1 = new Staff("John", 25);

    //Getter 
    System.out.println(staff1.age());
    System.out.println(staff1.name());
    
    //equals()
    Staff staff2 = new staff("John", 25);
    // hasCode()

    // toString ()
    System.out.println(staff1.toString());
  }
}
