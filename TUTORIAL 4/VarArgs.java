import java.util.Arrays;

/*VarArgs:- Variable length arguments. */  

public class VarArgs {
    public static void main(String[] args) {
       show(11,95,6255,11,619646,1616,461,6161,61,19,494,61,66,494,3,16,94,96,1,61,619,9,69,96,9,3,13);

    }

    static void show(int...a) // By using this we can take as many inputs as we want.
    {
        System.out.println(Arrays.toString(a));  //will print the inputs in form of string.
    }
}
