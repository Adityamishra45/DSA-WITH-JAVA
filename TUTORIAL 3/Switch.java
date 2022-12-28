import java.util.Scanner;

public class Switch
{
    public static void main(String[] args) {
//Q- Display a special massage according to the fruit.
        
        Scanner sc = new Scanner (System.in);
        
        // String fruit = sc.next();
        // switch(fruit)
        // {
            // case "apple": System.out.println("The red fruit.");
            // break;
            // case "mango": System.out.println("King of fruits.");
            // break;
            // case "grapes" : System.out.println("The bunch of green dots.");
            // break;
            // case  "orange": System.out.println("Fun fact:- The name of the color also.");
            // break;
            // default : System.out.println("Your input did not matched.");

    // Other method for switch case.

            // case "apple"-> System.out.println("The red fruit.");
            // case "mango"-> System.out.println("King of fruits.");
            // case "grapes" -> System.out.println("The bunch of green dots.");
            // case  "orange"-> System.out.println("Fun fact:- The name of the color also.");
            // default -> System.out.println("Your input did not matched.");

    //Onther way:- 
            int day = sc.nextInt();
            switch(day)
            {
                case 1,2,3,4,5 -> System.out.println("Week Days");
                case 6,7 ->System.out.println( "Enjoy the Weekend!!");
            }

        }
    }
