import java.util.Scanner;

public class sum {

    ///  we are going to write a program that sum of two numbers
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1  = input.nextInt();
        int num2 = input.nextInt();
        int sum = num1 + num2;
        System.out.println("the sum of the two number is " +sum);
        System.out.println("the sum of "+num1+" and "+num2+ " is " +sum);
    }
}
