class Floor {
    private double length;
    private double width;

    public Floor(double length,double width){
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



class Carpet {
    private double cost;
    public Carpet(double cost){
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



class Calculator  {    
    private Floor floor;
    private Carpet carpet;

    public Calculator(Floor floor,Carpet carpet){
        this.floor = floor;
        this.carpet = carpet;
    }

    public double getTotalCost(){
        return floor.getArea() * carpet.getcost();
    }
}


public class javaprac {
    public static void main(String[] args) {
        Floor floor = new Floor(10, 2);
        Carpet carpet = new Carpet(5);
        Calculator c = new Calculator(floor, carpet);


        System.out.println("Total cost is :"+ c.getTotalCost());
        System.out.println(carpet.getcost());
        System.out.println(floor.getArea());
    }
}

