import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
         /// Syntax of the switch

        /*
        Syntax:
        switch(condition):
            case 0 :
            break;
            case 1:
            break;
            case 2:
            break;
            .
            .
            .
            case n:
            break;
        default:
            //statements

         */

        String StudentName = Sc.next();
        String FatherName = Sc.next();
        switch (StudentName) {
            case "Abhilash" -> System.out.println("His Father name was " + FatherName);
            case "Srinivas" -> System.out.println("His Father name was " + FatherName);
            case "Pardhava" -> System.out.println("His Father name was " + FatherName);
            default -> System.out.println("Invalid");
        }



    }
}