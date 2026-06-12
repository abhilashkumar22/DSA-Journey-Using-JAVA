import java.util.Scanner;

public class LeetcodeProblem {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int original =n;
        int product =1;
        int sum=0;
        while(original > 0) {
            int temp = original % 10;
            product *= temp;
            sum+=temp;
            original/=10;
        }
        System.out.println(product-sum);
    }
}
