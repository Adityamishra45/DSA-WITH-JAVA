public class wrapperClasses {
    public static void main(String[] args) {

        // Integer a1 = new Integer(45); //one way to pass the wrapper class.
        Integer a1 = 45; // Wrapper class :- converts premitive datatypes into the objects.
        Integer b1 = 90;
        b1 = 89;
        System.out.println(b1);
        swap(a1, b1);
        System.out.println(a1+ " "+b1); // It will not swap because in java there is no pass by refrence everything is pass by value.

        final int BONUS = 2; // final keyword makes our variable as a constant only for premitive data type ,  for others we can modify the value but cannot re assign it. We can't modify it. 
        //Integer is a class of final class which makes it unchangable that's why the swap function is not working properly.

        final A st1 = new A();
        st1.name ="Mishra";
        // when a non premitive is final then you cannot re assign it.
        // st1 = new A("new object");
    }
    static void swap(Integer a1, Integer b1){
        int temp = a1;
        a1 = b1;
        b1 = temp;
    }
}

class A{
    final int num = 10; //always initialize thew final keyword while declaring.
    String name;
    A(){

    }
    // @Override
    // protected void finalize() throws Throwtable{
    //     super.finalize("object is destroyed");
    // }
}