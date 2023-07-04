public class StringComparison {
    public static void main(String[] args) {

        // 1. (==)operator -->

        String a = "ADITYA";
        String b = "ADITYA";
        String c = a;
        // System.out.println(a==b);  //true (because pointing to the same object.)
        // System.out.println(b==c);  //true (because pointing to the same object.)



        // 2. (.equals)Method -->

        String name1 = new String("Aditya");
        String name2 = new String("Aditya");
        System.out.println(name1==name2); //false because both are pointing to the different objects because we have use "new" keyword.
        System.out.println(name1.equals(name2));  //true because we checking inly the values.
        System.out.println(name1.charAt(0));  //A
    }
}
