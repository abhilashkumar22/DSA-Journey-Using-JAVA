import java.util.Scanner;

public class SalaryProblem {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int  salary = sc.nextInt();
        if(salary >10000){
            salary = salary+2000;
        }
        else{
            salary = salary+1000;
        }
        System.out.println(salary);
    }
}
