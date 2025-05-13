public class Child {
  // static = common attribute , not belongs to any object 
  // but all object can access the static varible 
  private static int counter = 0; // important 
  // Every child object has id , firstname, lastname , but no counter
  // Attribute (Instance varible)
  // Instance = object 
  private long id;
  private String firstname; 
  private String lastname; 

   // Constructor
  public Child (String firstname, String lastname){
    counter++;
    this.id = counter;
    this.firstname = firstname; 
    this.lastname = lastname;
  }

  // getter 
  public long getId(){
    return this.id;
  }

  public String getFirstname(){ 
  return this.firstname;
  }

  public String getLastname(){
    return this.lastname;
  }

  // !Rewrite ths definition of Child in youe World 
  public boolean equals(Child child){
    return this.id == child.getId();
  }

  public static void main(String[] args) {
    Child c1 = new Child("Leo", "Chan");
    
    // Approach 1
    if(c1.getFirstname().equals("Leo")&& c1.getLastname().equals("Chan"));{
      System.out.println("He is Leo Chan");
    }
     
    // Approach 2 
    System.out.println(c1.equals(new Child ("Vincent", "Chan")));
    System.out.println(c1.equals(new Child ("Leo", "Lau")));
    System.out.println(c1.equals(new Child ("Leo", "Chan")));

    Child c2 = new Child("Leo", "Wong");
    System.out.println(c2.getId());
    System.out.println(c2.equals(new Child("Leo", "Wong")));


  }
}
