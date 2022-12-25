import java.util.Scanner;

public class temprature {
    public static void main(String[] args) {
        Scanner sc  =new Scanner (System.in);
        System.out.print("Please enter the temprature in celcius:- ");
        float tempC  =sc.nextFloat();

        float tempinF = (tempC*9/5)+32;
        System.out.println("Your temprature in farhenite:- "+tempinF);
    }
}
