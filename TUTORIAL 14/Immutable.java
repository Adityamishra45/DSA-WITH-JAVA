    /* 
    Strings are immutable because  - if we have many user with the same name and one of them 
    wants to change his/her name then everyones name will be change . That is why Strings are 
    immutable.
    */


public class Immutable {
    public static void main(String[] args) {
        String a = "Aditya";
        System.out.println(a);
        a = "Mishra";
        System.out.println(a);

        // The value of a has not been changed but instead of that it has assigned to the new value.
        // and the value "Aditya" will go in the garbage collection.
    }
}
