public class Demostaticmethod {
  
  private int age; 

  public Demostaticmethod(int age){
  this.age = age;
}
  
  public int getAge(){
    return this.age = age;
  }

  public boolean isElderly(){
    return this.age > 65;
  }

    public boolean isChild(){
     return this.age <18; 
    }

    public static boolean isElderly2(int age){
      return age > 65;
    }

    public int sum( int x, int y){
      return x + y;
    }


public static void main(String[] args) {  
// static = 不用object都可以call main 
Demostaticmethod dsm = new Demostaticmethod(10);
System.out.println(dsm.getAge());


Demostaticmethod dsm1 = new Demostaticmethod(66);
System.out.println(dsm1.isElderly());
System.out.println(Demostaticmethod.isElderly2(66));

  System.out.println(Demostaticmethod.);


  }
}
