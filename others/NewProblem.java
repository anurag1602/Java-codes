abstract class Shape {

    abstract double getArea();

    String getdetails(){
        return "shape det: "+getArea();
    }
}

class Circle1 extends Shape {
    double radius;

    public Circle1(double radius){
        this.radius = radius;
    }

    double getArea(){
        return Math.PI * radius * radius;
    }


    String getdetails(){
        return "Shape: Circle\nRadius: "+radius+"\nArea: "+getArea(); 
    }
}

class Box {
    double height;
    Shape baseShape;

    public Box(double height,Shape baseShape){
        this.height = height;
        this.baseShape = baseShape;
    }

    double getVolume(){
        return baseShape.getArea() * height;
    }

    String getdetails(){
        return baseShape.getdetails()+"\n\n\nBox details: \nHeight: "+height+"\nVolume: "+getVolume();
    }
}

public class NewProblem {
    public static void main(String[] args) {
        Circle1 c = new Circle1(3);
        // System.out.println(c.getdetails());


        Box b = new Box(5, c);
        System.out.println(b.getdetails());
    }
}