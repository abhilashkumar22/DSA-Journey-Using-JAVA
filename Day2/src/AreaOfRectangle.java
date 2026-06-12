import java.util.Scanner;

public class AreaOfRectangle {

    public static void main(String[] args) {

        /// Area Of Rectangle Program

        /*
         Area = length * breadth
         */
        Scanner sc = new Scanner(System.in);
        int length = sc.nextInt();
        int breadth = sc.nextInt();
        int area = length*breadth;
        System.out.println(area);

    }
}
