import javax.swing.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException, NullPointerException {
        TestCase testCase = new TestCase();
        BufferedReader mReader = new BufferedReader(new InputStreamReader(System.in));
        int numIn;
        int input = 0;

        HashTable table = new HashTable();
        Employee emp = null;
        Employee employee = new Employee("Kyler", "Callaway", "kyler.callaway@gmail.com", "555-555-5555");
        String choice;
        // write your code here
        //TODO just removing the main method and adding it to the TestCase Class
        String desicison = null;
        int output;
        System.out.println("Please enter 1 for HashTable or 2 for tree structure ");

        desicison = mReader.readLine();
        output = Integer.parseInt(desicison);

        while (output == 1 || output == 2) {
            if (output == 1) {
                testCase.addEmployee();
            }
            System.out.println("to add another employee type 1 to search an employee type 2 to remove an employee type 3 to quit type q");

            choice = mReader.readLine();
            input = Integer.parseInt(choice);
            if (input == 1) {
                testCase.addEmployee();
            } else if (input == 2) {
                testCase.searchEmployee();
            } else if (input == 3) {
                output = Integer.parseInt(choice);
                System.out.println("this is where you would enter the employee you would like to delete");


                testCase.removeEmployee();
            } else if (output == 0) {
                output = Integer.parseInt(choice);
                System.out.println("have a great day ");
                System.exit(0);
            } else {
                System.out.println("you did not enter a correct value please try again");
                System.out.println();
            }
        }


    }
}



