/*I need to explain that in Java, when you create a class, you can use other classes as datatypes for variables.
 * 
 *  In Java, when you declare a variable of a class type, it's a reference to an object of that class.
 *  So floor and carpet are references to Floor and Carpet objects. The constructor assigns these references,
 *  so the Calculator instance holds references to the Floor and Carpet objects passed in.
 */

//COMPOSITION IS USED


class Floor {                                   // FIRST CLASS
    private double width;
    private double length;

    public Floor(double width, double length) {
        if (width < 0) {
            this.width = 0;
        } else {
            this.width = width;
        }

        if (length < 0) {
            this.length = 0;
        } else {
            this.length = length;
        }
        System.out.println("Constructor Called");
    }

    public double getArea() {
        return width * length;
    }
}

class Carpet {                                    //SECOND CLASS
    private double cost;

    public Carpet(double cost) {
        if (cost < 0) {
            this.cost = 0;
        } else {
            this.cost = cost;
        }
    }

    public double getCost() {
        return cost;
    }
}


/*USED COMPOSITION HERE AFTER */
/*The Calculator does not inherit from Floor or Carpet.
 Instead, it contains instances of these classes to calculate the total cost. */

class Calculator {                                        //THIRD CLASS WHERE COMPOSITION IS USED 
    private Floor floor;                                  // WORKS IN ALL CONDITIONS
    private Carpet carpet;                                 

    public Calculator(Floor floor, Carpet carpet) {       // HERE THR OBJECTS OF ABOVE TWO CLASSES ARE USED TO ACCESS THEIR METHODS 
        this.floor = floor;         //ASSIGNING OBJECTS
        this.carpet = carpet;
    }

    // Floor floor = new Floor(10,20);                     //FOR MY UNDERSTANDING I USED IT 
    // Carpet carpet = new Carpet(5);                      // WORKS IN SPECIFIC CONDITIONS


    public double getTotalCost() {
        return floor.getArea() * carpet.getCost();         // CALLED THE METHODS FROM FIRST AND SECOND CLASS USING THEIR OBJECTS
    }
}

public class Major {
    public static void main(String[] args) {
        Floor floor = new Floor(10, 20);
        Carpet carpet = new Carpet(5);
        Calculator g = new Calculator(floor,carpet);             //PASSING OBJECTS OF TWO CLASSES INTO A CALCULATOR CLASS CONSTRUCTOR
        // Calculator g = new Calculator();
        System.out.println("Total cost: " + g.getTotalCost());
    }
}



