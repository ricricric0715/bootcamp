public class DemoOperator {
  public static void main(String[] args) {
  
    // +, - ,x , %
    int x =3;
    x = 6 + 9;
    int y = 5 + x - 10;
    System.out.println(y);

    int a = y - 9 * 2;
    System.out.println(a);

    int b=(y-9)*2;
    System.out.println(b);

    b=((b-10)+2)*2;
    System.out.println(b);

    //divided by zero 
    // int r = 10 / 0;// system error 

    //int r2 = 0 / 10;
//    System.out.println(r2);

    int r3 = 10 / 3;
    System.out.println(r3);

    System.out.println(5/2);
    System.out.println(5.0/2);

    int score1 = 71;
    int score2 = 82; 
    System.out.println((71+82)/2.0);
    System.out.println((score1 + score2)/2.0);
    //int / int = int 
    // int / double = double 
    // (int + int) / double

  double d5 = 0.1 + 0.2;
  System.out.println(d5);


    double d6 = 0.2 + 0.3;
    System.out.println(d6);

    //remainder(餘數)of 10/3
    int r8 = 10% 3; 
    System.out.println(r8);

    //boolean (true or false
    boolean b9 = true;
    b9 = false;

    int result = 5;
    boolean isResultOddNumber = result % 2 ==1;//"=="checking if equals to
    System.out.println(isResultOddNumber);

    int johnAge = 64;
    boolean isElderly = johnAge >= 65;
    System.out.println(isElderly);

    // +1 and  -1 
    int t = 0;
    t++;
    ++t;
    t = t+1;
    t += 1;
    System.out.println(t);

    int w = 0;
    w--;
    --w;
    w = w -1;
    w -= 1;
    System.out.println(w);

    // +/-
    int o = 3;
    o -=4;
    o +=4;
    System.out.println(o);
     
    int q =3;
    q=q*3;
    q *= 3;
    System.out.println(q);

    int v = 27;
    v /=3;
    v = v/3;
    System.out.println(v);

    //comparison 
    //>, <, >=, <=, ==, !=
    int score = 91;
    boolean isGradeA = score >=90;
    System.out.println(score);

    char gender = 'F';
    boolean isFemale = gender !='M';
    System.out.println(isFemale);
    



  }
  
}