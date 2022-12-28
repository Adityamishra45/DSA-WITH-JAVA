/*  Nested Switch case :-  Switch case inside the Switch case.
Just like nested if else*/

import java.util.Scanner;
public class Nested_Switch {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int empId = sc.nextInt();
        String Department = sc.next();

        switch (empId)
        {
            case 1 : System.out.println("Aditya Mishra");
            break;

            case 2: System.out.println("Aditya Babu Prajapati");
            break;

            case 3: System.out.println(" ");
                switch(Department)
                {
                case "AIML": System.out.println(" Aditya Mishra is the Student of AIML Department.");
                break;

                case "CSE" : System.out.println("Aditya babu is the Student of CSE CORE  Department.");
                break;

                default: System.out.println("Your search did not matched.");
                }
            break;

            default: System.out.println("Enter correct empID.");

        }
    }
}
