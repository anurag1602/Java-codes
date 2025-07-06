class Circle {
    public double radius;
   

    public Circle(double radius) {
        if(radius < 0){
            this.radius = 0;
        }else{
            this.radius = radius;
        }
    }


    public double getRadius(){
        return radius;
    }


    public double getArea(){
        return (radius * radius * 3.14);
    }
}


class Cylinder extends Circle {

    public double height;

    public Cylinder(double height,double radius) {
        
        super(radius);                           //I didn't understand this concept 

        if(height < 0){                         // why it is must to use this "super" here
            this.height = 0;                    // if not used , then gives error
        }else{
            this.height = height;
        }    
        
    }

    public double getHeight(){
        return height;

    }

    public double getVolume(){
        return getArea() * height;
    }


}


class Cylinderproblem {


    public static void main(String[] args) {
        Circle c = new Circle(3.75);
        System.out.println("Cicle radius is: "+c.getRadius());
        System.out.println("Cicle Area is: "+c.getArea());


        Cylinder l = new Cylinder(7.25, 1);
        System.out.println("Cylinder radius is: "+l.getRadius());
        System.out.println("Cylinder height is: "+l.getHeight());
        System.out.println("Cylinder Area is: "+l.getArea());
        System.out.println("Cylinder Volume is: "+l.getVolume());

    }
}


