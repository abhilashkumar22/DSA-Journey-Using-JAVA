import java.util.Scanner;

public class LoopsInJava {

    public static void main(String[] args) {
        /// Loops in java is for,while,do-while
        /*
        Syntax of for loop:
        for(intialization; condition; incrementation){
                //body
         */

        /// print numbers from 0 to 5
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        for (int i = 0; i <=n; i++) {
            System.out.println(i);
        }


        /// while Loop
        /*
        syntax:

        while (condition){
            //body
            }
         */

        while(n<=5){
            System.out.println(n);
            n+=1;
        }

        /// Do while Loop
        /*
                do {
                //body
                }
                while(condition);
         */

        int num =1;
        do{
            System.out.println("Hello world");
        }
        while(n<=1);

    }
}
