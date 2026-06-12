import java.util.Scanner;

public class currencyConverting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rupees =sc.nextInt();
        double usd = rupees*0.01045;
        System.out.println(usd);
    }
}
