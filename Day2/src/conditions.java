import java.util.Scanner;

public class conditions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /// Conditions in Java
        /// if ,else-if,else
        int age = sc.nextInt();
        if(age<18){
            System.out.println("You are under 18");
        } else if (age>18) {
            System.out.println("You are Adult");
        }
        else{
            System.out.println("Senior Citizen");
        }
    }
}