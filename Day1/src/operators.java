import java.util.Scanner;

public class operators {

    ///Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        String operator = sc.next();
        if(operator.equals("+")){
            System.out.println(num1+num2);
        } else if (operator.equals("-")) {
            System.out.println(num1-num2);
        } else if (operator.equals("*")) {
            System.out.println(num1*num2);
        }
        else if(operator.equals("/")){
            System.out.println(num1/num2);
        }
        else{
            System.out.println("Not Valid Operater entered");
        }
    }
}
