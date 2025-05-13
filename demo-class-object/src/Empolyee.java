public class Empolyee { // An empolyee has name, age and email 
  // Attributes 

    private String name ; 
    private int age  ;
    private String email ; 

    // Object Method  
    public void setName(String name){ //
      this.name = name;
    }
    public String getName(){
      return this.name;
    }

    public void setAge(int age){
      this.age = age;
    }
    public int getAge(){
      return this.age;
    }

    public void setMail(String email){
      this.email = email;
    }
    public String getEmail(){
      return this.email;
    }
    // RunTime 

  public static void main(String[] args) {
    
    String employee1Name = "john";
    int empolyee1Age = 26;
    String empolyee1Email = "john@gmail,com";
    
    String empolyee2Name = "steven";
    int empolyee2Age = 30;
    String empolyee2Email = "steven@gmail.com";

    // Solution - Class and Object 
    
    Empolyee e1 = new Empolyee();
    Empolyee e2 = new Empolyee();
    e1.setName("john"); 
    e2.setName("Sally");

    System.out.println(e1.getName()); //john 
    System.out.println(e2.getName()); //Sally 

    e1.setAge(empolyee1Age);
    e2.setAge(empolyee2Age);
    System.out.println(e1.getAge());
    System.out.println(e2.getAge());

    e1.setMail(empolyee1Email);
    e2.setMail(empolyee2Email);
    System.out.println(e1.getEmail());
    System.out.println(e2.getEmail());

    
   }
  }
