package Inheritance;

public class BoxPrice extends Boxweight // Example of multilevel inheritance.
{
    double cost;

    BoxPrice(){
        super();
        this.cost = 83;
    }

    BoxPrice(BoxPrice other){
        super(other);
        this.cost=other.cost;
    }

    BoxPrice(double cost,double weight,double width, double height,double length){
        super(length, height, width, weight); // Here super will call the class just above one which is Boxweight. Because we are extending the boxweight over here.
        this.cost = cost;
    }
}
