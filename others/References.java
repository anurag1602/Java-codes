public class References {

    String color;
    
    
    public References(String color){
        this.color = color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getcolor(){
        return color;
    }



    public static void main(String[] args) {
        References first = new References("red");
        References second = first;
        // System.out.println(first.getcolor());
        // System.out.println(second.getcolor());

        second.setColor("yellow");

        // System.out.println(second.getcolor());
        // System.out.println(first.getcolor());

        References third = new References("green");
        second = third;

        System.out.println(first.getcolor());
        System.out.println(third.getcolor());
        System.out.println(second.getcolor());
    }
}
