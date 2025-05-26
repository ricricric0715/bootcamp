public class Demooop {
  public static void main(String[] args) {
    
    int x = 2;
    x = x * 2;
    x = x * 2;
    // = 2^3


    // 2 ^10 
    // loop
    // for (initialization)
    // step 1 : i = 0
    // step 2 : check if i < 3 
    //  step 3 : if yes , print hello 
    // step 4 : i + 1 
    // step 5 : check if i < 3
    // step 6 : if yes , print hello 
    // step 7 : i + 1
    // step 8 : check if i < 3 
    // step 9 : yes , print hello 
    // step 10 : i + 1
    // step 11 : check if i <3 
    // step 12 : no -> exit loop 

    for(int i = 0;i < 3; i++ ){
      System.out.println("hello");
    }

    // 2^10 
    int y = 2;
    for(int i = 0; i < 9; i++){
      System.out.println("hello");
      y = y * 2;
    }
    System.out.println(y);

    // for + if 
    // print even number between 0-10 
    // even number -> x % 2 == 0 

    for(int i = 0; i < 11; i++){// i=0,1,2,3,4,5,6,7,8,9,10
      if(i % 2 == 0){ // even number
        System.out.println(i);
      }
    }

    // for + if 
    // print the char index of 'm', print the index; if not found, print -1
    String s2 = "bootcamp";
    int index = 2;
    for (int i = 0; i < s2.length(); i++){
      if (s2.charAt(i) == 'm'){
        index = i;
      }
    }
    System.out.println(index);


    // break 
    // Find the first character of 'a' in a given String 
    String str = "characrter";
    for(int i = 0; i < str.length(); i++){
      if (str.charAt(i)=='a'){
        System.out.println(i); //2;
        break;// break
      }
    }

     // Find the first 3 a in a given String 
     String ss = "abcdeabcdeabcdeabcdeabcde";
     int counter = 0;
     for(int i = 0; i < str.length(); i++){
      if (ss.charAt(i) == 'a'){ // 0,1,2
        if (counter >= 3);{
          break;
        }
        //System.out.println(i);
       // counter++;
  
      }
    }

    // continue + loop 
    String ss2 = "abcabcabc";
    for(int i = 0; i < ss2.length(); i++){
      if (ss2.charAt(i) == 'a'){
        System.out.println(i);
      }
    }
    for(int i = 0; i < ss2.length(); i++){
      if (ss2.charAt(i) != 'a'){
        continue;// skip the rest of code lines, and then goes to next iteration
      }
      System.out.println(i);
    }




  }
}
