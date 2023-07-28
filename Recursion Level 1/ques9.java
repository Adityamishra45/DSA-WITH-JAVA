public class ques9 {
    public static void main(String[] args) {
        
    }
    static int steps(int num){
        return helper(num,0);
    }
    static int helper (int num,int step){
        if(num==0){
            return step;
        }
        if(num%2==0){
            return helper(num/2 , step++);
        }
        return helper(num-1 , step++);

    }
}
