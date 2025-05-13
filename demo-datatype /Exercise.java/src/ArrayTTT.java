public class ArrayTTT {

  public static void main(String[] args) {
    
    String[] names = {"Tom", "Jason", "Amy", "Catherine"};
System.out.println("名字長度大於4的有：");

for (int i = 0; i < names.length; i++) {
  if (names[i].length() > 4) {

    System.out.println(names[i]);
  }
}


int [] number = {1, 3, 5, 7, 9};
System.out.println("數字大于:");

  for (int i = 0; i < number.length; i++) {
    if (number[i] > 5){
      System.out.println(number[i]); // 7,9 
    }
  }

  String [] name = { "Ricky", "Yin", "Elros", "Elliot"}; 

  for (int i = 0; i < name.length; i++) { 
    if ( name[i].length() > 3){
      System.out.println("名字多於3個字" + name[i]); // Ricky, Elros , Elliot 
    }
  }



  }
}
