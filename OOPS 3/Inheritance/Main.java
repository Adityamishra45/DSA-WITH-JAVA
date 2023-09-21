package Inheritance;
public class Main {
    public static void main(String[] args) {

        Box box1 = new Box(4);  // taking only one argument so it will call the cube constructor.
        Box box2 = new Box(box1); // it will call the copy constructor. 
        System.out.println(box2.height+" "+box2.width+" "+box2.length);

        Boxweight box3 = new Boxweight(); // inheriting from box.
        System.out.println(box3.height+" "+box3.weight);

        Boxweight box4 = new Boxweight(3,5,6,5);
        System.out.println(box4.weight+" "+box4.height+" "+box4.width+" "+box4.length); 

        Box box5 = new Boxweight(5,6,7,8);
        System.out.println(box5.height+" "+/*box5.weight+*/" "+box5.length); 
        
        // we are not able to use the box5.weight because box5 has been initialized with the properties of the 
        // base class and the weight property is of the child class. So we know that child class can access the
        // properties of the base class but base class cannot access the propertie of the child class. 
        
        
        BoxPrice box6 = new BoxPrice(60, 0, 0, 0, 0);
        System.out.println(box6.cost);

        BoxColor Box7 = new BoxColor();
        System.out.println(Box7.color);
    }
}
