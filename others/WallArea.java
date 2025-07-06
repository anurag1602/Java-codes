public class WallArea {
    private double height;
    private double width;

    public WallArea(){
        this(4, 2);
        System.out.println("Default Constructor was called");
    }

    public WallArea(double width,double height){
        if(width<0){
            this.width = 0;
        }else{
            this.width = width;
        }
        if(height<0){
            this.height = 0;
        }else{
            this.height = height;
        }
        System.out.println("Constructor Called");
    }

    public void setHeight(double height) {
        if(height<0){
            this.height = 0;
        }else{
            this.height = height;
        }
    }

    public void setwidth(double width){
        if(width<0){
            this.width = 0;
        }else{
            this.width = width;
        }
    }

    public double getHeight() {
        return height;
    }

    public double getwidth(){
        return width;
    }

    public double getArea(){
        return getHeight() * getwidth();
    }




    public static void main(String[] args) {
        WallArea a = new WallArea();
        
        System.out.println(a.getwidth());
        System.out.println(a.getHeight());
        System.out.println(a.getArea());

        
        
        
        WallArea b = new WallArea(5,4);
        

        System.out.println("Area is "+b.getArea());

        b.setHeight(-1.5);
        

        System.out.println("width="+b.getwidth());
        System.out.println("height="+b.getHeight());
        System.out.println("Area="+b.getArea());
    }
}
