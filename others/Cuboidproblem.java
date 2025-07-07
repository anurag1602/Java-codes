/*  In this program Composition is used beacuse with compostion we get different 
output value for cuboid volume cause it calc area with values of l & w which are 
passed from main method , while if we don't use composition then it gives different 
output for volume cause it calculates area again with the values of l & w pass through 
super() in child class , so we need to use composition here
*/

class Rectangle {
    double length,width;

    public Rectangle(){
        System.out.println("default");
    }   // After creating dafault constructor in parent class now no need to explicitely call the parent constructor with super(10,20)which is commented now 


    public Rectangle(double length,double width){
        if(length < 0){
            this.length = 0;
        }else{
            this.length = length;
        }

        if(width < 0){
            this.width = 0;
        }else{
            this.width = width;
        }
    }



    public double getLength(){
        return length;
    }


    public double getWidth(){
        return width;
    }


    public double getArea(){
        return getLength() * getWidth();
    }
}


class Cuboid extends Rectangle {   // without inheritance it also works cause composition is used to access the methods from other class
    double height;
    Rectangle rect;    // Composition used 


    public Cuboid(Rectangle rect,double height){               //Composition used here
        //super();   // Automatically written by java cause there is default constructor in parent class
        super(10,20);  // cause of these changed values of l & w the value for area changes which changes the volume

        if(height < 0){
            this.height = 0;
        }else{
            this.height = height;
        }

        this.rect = rect;
    }


    public double getHeight(){
        return height;
    }

    public double getVolume(){
       return rect.getArea() * getHeight();   // composition used , due to rectangle.getArea() it gets the previous value of area and multiply it with height to get output 30 , so composition is needed
       
        //return getArea() * getHeight();       // Without composiion diff output for volume
    }


}



public class Cuboidproblem {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(2, 3);
        System.out.println("Rectangle length is: " + rect.getLength());
        System.out.println("Rectangle width is: " + rect.getWidth());
        System.out.println("Rectangle Area is: " + rect.getArea());

        Cuboid c = new Cuboid(rect, 5);             // Rectangle class obj passed here = composition
        System.out.println("Cuboid height is: "+c.getHeight());
        System.out.println("Cuboid Volume is: "+c.getVolume());

    }    
}
