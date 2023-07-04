public class Palindrom {
    public static void main(String[] args) {
        String name = "naman";
        System.out.println(isPalindrome(name));
        
    }
    static boolean isPalindrome(String name){
        name = name.toLowerCase();
        for(int i=0;i<=name.length()/2;i++){
            char start = name.charAt(i);
            char end = name.charAt(name.length()-1-i);

            if(start!=end){
                return false;
            }
        }
        return true;
    }
}
