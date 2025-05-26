public class Demoif {
  public static void main(String[] args) {

    int x = 15;
    if (x < 4) {
      System.out.println("hello");
    }

    if (x < 10) {
      System.out.println("hi");
    } else {
      System.out.println("welcome");
    }

    // !rule
    // step 1 "if"condition if it si true, excute action, and then exit
    // step 2 : if step 1 result false, then try "else if"condition,excute action, and then exit
    // step 3 :if step result is false, then goes t0 "else"

    int y = 100;

    if (y < 90) {
      System.out.println("y is smaller than 90");
    } else if (y >= 90 && y < 100) {
      System.out.println("y is 90< y 99");
    } else {
      System.out.println("y>=100");

      // double w
      // if w <100 , print "abc"
      // w between 103 and 110, print "DEF"
      // for other value , print "XYZ"

      int w = 40;
      if (w < 100) {
        System.out.println("if w smaller than 100, print abc");
      } else if (w >= 103 && w <= 110) {
        System.out.println("DEF");
      } else {
        System.out.println("XYZ");
      }
    }

    // AND &&
    // OR ||
    int a = 10;
    int b = 20;
    if (a > 3 || b < 15) {
      System.out.println("a > 3 || b < 15");
    } else {
      System.out.println("error");

    }

    int q = 4;
    int u = 80;
    if (q > 2) {
      u = u + 2;// execute

    } else if (q < 5) {
      u = u + 10;
    }
    System.out.println(u);// 82

    q = 10;
    u = 100;
    if (q > 5 && u < 99) {
      System.out.println("hello");
    } else if (q <= 5) {
      System.out.println("bye");
    } else {
      System.out.println("bootcamp");
    }

    String s1 = "hlo";//hello
    System.out.println(s1.length());

    if (s1.length() > 3) {
      System.out.println("java");

    } else {
      System.out.println("python");
    }

    // equal() + if 
    String s2 = "javascript";
    int score = 0;
    if(s2.equals("java")){
      score += 1;
    }else{
      score +=2;
    }
    System.out.println(score);

    // CharAt
    // check if the first character of string is "c" or the last character is 'd' 
    // if yes , print "yes, if no, print "no

    String s3 = "helloworld";
    if (s3.charAt(0) == 'c'||s3.charAt(s3.length()-1)== 'd'){
      System.out.println("yes");
    }else{
      System.out.println("no");
    }
    
    // swith 
    char grade = 'B';
    if (grade == 'A'){
      System.out.println("Grade is A");
    }else if (grade == 'B') {
      System.out.println("Grade is B");
    }else if (grade == 'C') {
      System.out.println("Grade is C");
    }else {
      System.out.println("fail");
    }

    //Alternative 
    // You should Swith 
    // swith CANNOT check the range 
    
    score = 85; 
    if (score >=90){
    grade = 'A';
    } else if (score >= 80 && score <90){
      grade = 'B';
    } else if (score >= 70 && score <80){
      grade = 'C';
    } else {
      System.out.println("fail");
    }

  }
}