import java.util.Scanner;

public class LinearSearchinStrings
{
    public static void main(String[] args) {
    //     Scanner sc = new Scanner (System.in);
    //     String name= sc.next();
    //     char target = 'd';
    //     System.out.println(search(name, target));

    // }
    // static boolean search(String str, char target)
    // {
    //     for (int i = 0; i < str.length(); i++) {
    //         if(target==str.charAt(i))
    //         {
    //             return true;
    //         }
    //     }
    //     return false;
        
    String[] str ={"Aditya","Kumar","Mishra"};
    String target = "Aditya";
    for (int i = 0; i < str.length; i++) {
        if(str[i]==target)
        {
            System.out.println("Item found at index: "+i);
        }
        
    }
    
        //System.out.println("Did not found !!");
    
    }
}