package Inheritance;

// inheriting the properties from the base class which is Box.

public class Boxweight extends Box{
        double weight;

        public Boxweight(){
            this.weight = 12;
        }
        public Boxweight(Boxweight weight){
        }

        public Boxweight(double length, double height, double width, double weight){
            super(length,height,width); // Call the above class (base class is above class for this) constructor. (To see it just use ctrl+click , you will know that what you are doing.)
            System.out.println(this.weight); // we can use super.weight also but it is only possible when
            // the above class constructor is having the weight factor also. Basically we use super.weight to
            // specify that the we are mentioning the weight which is in the super class (above class).
            this.weight = weight;
        }
}
