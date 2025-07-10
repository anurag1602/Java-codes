class Floor1 {
    private double length;
    private double width;

    public Floor1(double length,double width){
        if(length<0){
            this.length = 0;
        }else{
            this.length = length;
        }

        if(width<0){
            this.width = 0;
        }else{
            this.width = width;
        }
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }


    public double getArea(){
        return getLength() * getWidth(); 
    }
}



class Carpet1 {
    private double cost;
    public Carpet1(double cost){
        if(cost<0){
            this.cost = 0;
        }else{
            this.cost = cost;
        }
    }

    public double getcost(){
        return cost;
    }
}


// COMPOSITION USED



class Calculator1 {    
    private Floor1 floor;
    private Carpet1 carpet;

    public Calculator1(Floor1 floor,Carpet1 carpet){
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost(){
        return floor.getArea() * carpet.getcost();
    }
}


public class javaprac1 {
    public static void main(String[] args) {
        Floor1 floor = new Floor1(10, 2);
        Carpet1 carpet = new Carpet1(5);
        Calculator1 c = new Calculator1(floor, carpet);


        System.out.println("Total cost is :"+ c.getTotalCost());
        System.out.println(carpet.getcost());
        System.out.println(floor.getArea());
    }
}

