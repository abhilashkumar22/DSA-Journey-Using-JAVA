import java.util.Scanner;

public class AreaOfIsosceles {

    public static void main(String[] args) {
      ///  Area Of Isosceles Triangle
        /*
        Area = 1/2 * length *breadth
         */

        Scanner sc = new Scanner(System.in);
         int length = sc.nextInt();
         int breadth = sc.nextInt();
         double area = 0.5 * length * breadth;
        System.out.println(area);
    }
}
