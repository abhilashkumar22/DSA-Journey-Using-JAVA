import java.util.Scanner;

public class SumStillZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /// Take integer inputs till the user enters 0 and print the sum of all numbers (HINT: while loop)
        int sum =0;
        int number=1;
        System.out.println("Enter the numbers:");
        while(number!=0){
            number = sc.nextInt();
            sum+=number;

        }
        System.out.println(sum);


        ////  Take integer inputs till the user enters 0 and print the largest number from all.
            int largest= Integer.MIN_VALUE;
            int n;
        System.out.println("Enter the numbers:");
            while (true){
                n = sc.nextInt();
                if(n ==0){
                    break;
                }
                if(number>largest){
                    largest=n;
                }
            }
        System.out.println(largest);

    }
}
