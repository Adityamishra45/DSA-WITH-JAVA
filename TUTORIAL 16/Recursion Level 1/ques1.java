public class ques1{
    public static void main(String[] args) {
        funrev(5);
    }
    static void fun(int n){ // for 5 to 1
        if(n==0){
            return;
        }
        System.out.println(n);
        fun(n-1);
    }
    static void funrev(int n){ // for 1 to 5
        if(n==0){
            return;
        }
        funrev(n-1);
        System.out.println(n);
    }
}