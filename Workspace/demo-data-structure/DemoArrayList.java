import java.util.ArrayList;

public class DemoArrayList {

  public static void main(String[] args) {
  String[]arr = new String []{"abc","def","ijk"};
  for (String s :arr){
    System.out.println(s);
  }  

  // Disadvantages of array 
  // 1. Fixed Length (ArrayList fixed this issue )
  //

  // Java allow Object[] to store any type of objects... 
  // 
  Object[] arr2 = new Object[]{"abc", 10, 9.99};
  for (Object s : arr2) { 
    if 
  }

  //
  ArrayList<String> names = new ArrayList<String>(); 
  names.add("John");
  names.add("Peter");
  System.out.println(names.size()); //2 

  names.remove("Peter");
  System.out.println(names.size()); //1 

  names.add("Jennie") ;
  System.out.println(names); //[Jogn, Jennie]


  List<Dog>  dogs = new ArrayList<>();
  dogs.add(new Dog("John"));
  



  }
}
