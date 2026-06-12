import java.util.Scanner;
    /// this is the package that can be public use can scanner package in the program to take the input from the user
public class Main {
    /// Main is the class name that should same as the file name it should mandatory


    public static void main(String[] args) {
        ///main is the class that is the entry point of the program where program enter
        /// string[] args is variable that stores the data in that varaiable



        Scanner input = new Scanner(System.in);
        /// Scanner is class a we can take an input from the user
        /// System.in : is the where we are taking the (in : means input) like if we are taking an input from a file ->
        ///  example : name.txt we can place that file name inside the paranthesis
        /// Basically we take input from the system thats why we place the system.in



        System.out.println(input);
        ///this is the printing statement in java that prints output what we are mentioned inside the paraenthesis()
        /// println : always print the output in the new line that make programmer easy to read and debug line by line

    }
}