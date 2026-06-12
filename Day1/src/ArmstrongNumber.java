import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int number=n;
        int r,sum=0;
        while(number>0){
            r= number%10;
            number/=10;
            sum=sum+r*r*r;
        }
        if(n==sum){
            System.out.println("Armstrong");
        }
        else{
            System.out.println("Not Armstrong");
        }
    }
}
