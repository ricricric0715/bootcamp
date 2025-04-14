public class DemoDataType {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        //!Integer(+ve - -ve)
        //"=" -> assigement
        int x = 3;
        // put 7 into y
        int y = 7;

        System.out.println("x");
        System.out.println(x);
        System.out.println("y");
        //Reassign value 10 into variable x 
        x = 10;
        System.out.println(x);//10

        y = 100;
        System.out.println(y);

        int salary = 20000;
        // Variable name conversation 
        int tutorName = 5;
        System.out.println(tutorName);

        // Declation of variable type 聲明變量類型 
        int a;
        // same varible name can be declared once only 
        // assignemnt 
        a = 4;
        System.out.println(a);
        int w = 10;
        w = 9;
        System.out.println(w);

        // ! double 
        double d1 = 4.4;
        System.out.println(d1);

        double d2 = 7.364;
        System.out.println(d2);

        double d3 = 5.5;
        System.out.println(d3);

        int x2 = 6 + 1;
        System.out.println(x2);

        int x3 = 9;
        x2 = x3;
        System.out.println(x2);

        int x4 = 10;
        x2 = 7 + x4;
        System.out.println(x2);

        x2 = x2 + 8;
        System.out.println(x2);

        byte b1 = 3;
        short s1 = 3;
        int i1 = 3;
        long l1 = 3;
        // byte (-128-127)
        // short (-32xxx-32xxx)
        // int (-21億.x-21億.x)
        //long (2^63)

        b1 = -128;
        s1 = 32767;
        i1 = 2_147_483_647;
        i1 = i1 + 1;
        System.out.println(i1);
        
        // you intend to write int value 22億 into a long varible 
        // 1. perpare an long value 22億 
        //2. Assign a value into long varible 
        // li = 2_000_000_000 = wrong 
        l1 = 2_200_000_000L;
        l1 = l1 = 3L;
        System.out.println(l1);
        l1 = l1 + 2_000_000_000L;
        System.out.println(l1);

        long l2 = 2_000_000_000L + 5;
        System.out.println(l2);

        int i8 = 9;
        byte b10 = 3;


        // the range of int value should solve the majority of the problems in system 
        // so we wont use long as a default type of varilbefor storing integer 


    //char
    // single quote
    // assign char valur'a' into char vaible 
    char c1 = 'a';
    System.out.println(c1);

    char c2 = 'A';
    System.out.println(c1 == c2);

    char lastName = '陳';
    System.out.println(lastName);
    //we can assign bigger range of vaible to smaller ange of varible(by default)
    // Fore assignment 

    boolean b9 = true;
    b9 = false;

    int result = 5;
    boolean isResultOddNumber = result % 2 ==1;//"=="checking if equals to
    System.out.println(isResultOddNumber);
    
    byte b40 = (byte)129L;
    System.out.println(b40);


    //float (store decimal number)
    // 3.14159 is double
    // so it is unsafe (assign double value to float varible)
    float f1 = 3.14159f;
    f1 = 0.1f + 0.2f;
    System.out.println(f1);

    // problem 
    f1 = 0.3f + 0.4f;
    System.out.println(f1);





    }
}
