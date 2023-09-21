package Inheritance;

class Box{
    double length;
    double height;
    double width;

// Following are the examples of the Method Overloading.

    Box(){
        this.length =60;
        this.height =20;
        this.width  =12;
    }

    // Copy constructor
    Box(Box old){
    this.height = old.height;
    this.width = old.width;
    this.length = old.length;
    }

    // cube
    Box(double side){
        this.height = side;
        this.width =side;
        this.length =side;
    }

    Box(double height, double length, double width){
        this.height = height;
        this.width = width;
        this.length = length;
    }

    public void information(){
        System.out.println("Box information");
    }

}
