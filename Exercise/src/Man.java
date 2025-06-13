public class Man {


public static void main(String[] args) {
  
for (int i = 0; i < 3; i ++){
  System.out.println("ihihih");
}


// int[] scores = {10, 20, 30, 40, 50};
int number[] = new int[5] ;
 
number [0] = 10;
number [1] = 20;
number[2] = 30;
number[3] = 40;
number[4] = 50; 
System.out.println(number[2]);

int sum = 0 ; 
for (int i = 0; i < number.length; i++) {
  sum += number[i];
}



    int[] nums = {1, 2, 3, 4, 5};

   for (int i = 0; i < nums.length; i++){
    System.out.print(i);
   if (i < nums.length -1) {
    System.out.print(", ");
   }
  
  }

  int[] scores = {67, 89, 72, 94, 88};
  int max = scores[0];
  for (int i = 1; i < scores.length; i++) {
    if (scores[i] > max) {
      max = scores[i];
    }
  }
 
 System.out.println("最高分是: " + max);
  }
}

