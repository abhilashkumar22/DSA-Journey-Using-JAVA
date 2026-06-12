import java.util.Scanner;

public class AreaOfParallelogram {

    public static void main(String[] args) {

        ///  Area Of Parallelogram
        /*
        Area = breadth * height
         */
        Scanner sc = new Scanner(System.in);
         int breadth = sc.nextInt();
         int height = sc.nextInt();
         double area = breadth*height;
        System.out.println(area);
    }
}
