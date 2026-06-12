import java.util.Scanner;

public class AreaEquilateralTriangle {

    public static void main(String[] args) {


        /// Area Equilateral Triangle

        /*
        area = Root 3 /4 * s*s
         */
        Scanner sc = new Scanner(System.in);
         int side = sc.nextInt();
         double area = Math.sqrt((3)/4)*side*side;
        System.out.println(area);
    }
}
