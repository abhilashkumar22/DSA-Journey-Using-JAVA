import java.util.Scanner;

public class ArmStrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int original=number;
        int result=0;
        while (original>0){
            int temp = original%10;
            result += temp*temp*temp;
            original/=10;
        }
        if(result==number){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not Armstrong");
        }
    }
}
