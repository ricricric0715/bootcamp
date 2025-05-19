// Inherit
public abstract class Animal { // Parent class : concrete class or abstract class 

  private int age;

  // ! Why abstract class still have constructor ? for child contractor to invoke 
  public Animal(int age) {
    this.age = age;
  }

  public int getAge() {
    return this.age;
  }


  public static void main(String[] args) {
    Animal animal = new Cat(13);
    Cat cat = new Cat("Peter", 17);


    // Abstract class is not for objdct creation 


    // ! Polymorphism (Runtime/ Dynamic / Polymorphism )
    // ! 1. instant method call is detemind by obect refernce type(comole-time)
    // ! the implementation of method is determined by actual object itself(runtime)
    Animal cat2 = new Cat("john", 20);
    // "cat2" -> "object reference"
    // "Animal" -> " object reference type "
    // "new Cat("John, 20") -> :object"/ "object refence vlaue "

    cat2 = new Dog(10, 7);
    cat2.getAge();// Java cannot ensure cat2 is pointing to Cat Object, it may be Dog object 

    // ! 組合skill : instanceOf + downcast 
    if(cat instanceof Cat){ //強行 , 不理想 , 如有新animal 又要改!
      Cat animals = (Cat) cat2;
      System.out.println(animal2.getName());
    } else if (cat2 instanceof Dog){
      Dog animal3 = (Dog) cat2;
      System.out.println(animal3.getWeight());//10.0
    }

    


  }
}
