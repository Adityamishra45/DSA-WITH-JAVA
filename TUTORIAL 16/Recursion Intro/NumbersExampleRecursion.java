public class NumbersExampleRecursion {
    public static void main(String[] args) {
        print(1);
    }

    static void print(int n){ 
        if(n==5) //Base condition  --> if there is not a base condition then function call will keep happening upto it's limit. Stack will be filled again and again. and every call takes a memory so it is the wastage of the memory. "It will give the stack overflow error".
        {
            System.out.println(5);
            return;
        } 
        System.out.println(n);
        
        //this is called tail recursion.
        
        print(n+1); //Recursive call
        //if you are calling a function again and again then you can treat it as a seprate call in the stack
    }
}
