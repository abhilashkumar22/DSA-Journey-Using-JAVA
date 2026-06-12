import java.util.Scanner;


/// Basically in Java Functions are called Methods
/// Methods are different types in java
public class Functions {
    public static void main(String[] args) {
       add();
        greet();
//        greeting();
        int result = getNumber();
        System.out.println(result);
        int resulting = adding(10,20);
        System.out.println(resulting);
    }
    static void add(){
        Scanner Sc = new Scanner(System.in);
        int a = Sc.nextInt();
        int b = Sc.nextInt();
        int sum = a+b;
        System.out.println("The Sum of Two Numbers is "+sum);
    }
    //// Types of the methods in java
    //// 1. Methods with no parameters and no return value:
    //// calling the function is in the main function when ever we call the function it should be in main
    static  void greet(){
        System.out.println("Hello World!");
    }


    //// 2. Methods with parameters and no return value:

    static void greeting(String name){
        System.out.println("Hello"+name);
    }
    /// 3. Methods with no paramters and with return value:
    static int  getNumber(){
        return 100;
    }

    /// 4. Methods with parameters and with return value:

    static int adding(int a , int b){
        return a+b;
    }
}
