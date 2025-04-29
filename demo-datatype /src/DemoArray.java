import java.util.Arrays;

public class DemoArray {
  public static void main(String[] args) {
    // problem 
    int x = 2;
    int x2 = 8;
    int x3 = 1000;
    System.out.println(x);
    System.out.println(x2);
    System.out.println(x3);

    // Array 重
    // ! store a set of same type of value
    // for example , a set of int value 
    // 3 -> places to store int value 
    int [] arr = new int[3];
    //write  value into array 
    // 0 
    arr[0] = 2;
    arr[1] = 8;
    arr[2] = 1000;

    System.out.println(arr[0]);
    System.out.println(arr[1]);
    System.out.println(arr[2]);

    // declare double array -> 4 values 
    // 1.1, 9.2, -9.8, 77.9 
    // print them out 

  double [] arr2 = new double[4];
  arr2[0] = 1.1;
  arr2[1] = 9.2;
  arr2[2] = -9.8;
  arr2[3] = 77.9;

  // arr2.length -> array length
    for(int i = 0; i < 4; i++){
      System.out.println(arr2[i]);
    }

      String[] arr3 = new String[3];
      arr3[0] = "abc";
      arr3[1] = "def";
      arr3[2] = "bootcamp";

      String[] arr4 = new String[] {"abc", "def", "bootcamp"};
      //for loop 
      
      for (int i = 0; i < arr4.length; i++){
        System.out.println(arr4[i]);
      }

      // for loop + if 
      for (int i = 0; i < arr4.length; i++){
        if (arr4[i].length() > 4){
        System.out.println(arr4[i]);
        }
      }

      // for loop + if (AND OR)
      // Print the String in the array, which length > 4and starts with 'b'
      for (int i = 0; i < arr4.length; i++){
        if (arr4[i].length() > 4 && arr4[i].startsWith("b")){
          System.out.println(arr4[i]);
        }
      }

// Print the String in the 
  for (int i = 0; i < arr4.length; i++){
    if(arr4[i].length() == 3 || arr4[i].endsWith("P")){
    System.out.println(arr4[i]);
    }
  }

  //
  int [] arr5 = new int []{4, 7, -3, 1500, -100, 1000};
  // print the max value in the array 
  // for loop + if 
    int box = arr5[0];
    for (int i = 0; i < arr5.length; i++){
      if(arr5[i] > box){
        box = arr5[i];
      }
    }
    System.out.println(box);

    int min = arr5[0];
    for (int i = 0; i < arr5.length; i++){
      if (arr5[i] < min){
        min = arr5[i];
     }
    }
     System.out.println(min);
    
     // swap 兩組數字對調
     // 需要另加一空杯 (backup)
     int a = 6; 
     int b = 8;
    int backup = a;
    a = b;
    b = backup;
    System.out.println(a);
    System.err.println(b);
    
    int[]arr6 = new int[]{9, 7, 10, -3, 8} ;
    // move the max value to the tail of the array 
    // for + if + swap 
    int g = arr6[0]; 
    for ( int i = 0; i < arr6.length - 1; i++ ){
      if (arr6[i] > arr6[i+1] ){
        backup = arr6[i];
        arr6[i] = arr6[i+1];
        arr6[i+1] = backup;
      }
    }
    System.out.println(Arrays.toString(arr6));

    arr6 = new int[]{9, 7, 10, -3, 8};
    for (int i = 0; i < arr6.length -1; i++){ //比較全部 , 全部4回合 
      for (int j = 0; j < arr6.length -1 - i ; j++){ //每回合比較 
        if (arr6[j] > arr6 [j + 1]);{
        backup = arr6[j];
        arr6[j] = arr6[j + 1];
        arr6[j + 1] = backup;
        }
      }
    }
System.out.println(Arrays.toString(arr6));



  }
}


