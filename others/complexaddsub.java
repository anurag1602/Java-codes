public class complexaddsub {
    int a1;
    int a2;
    int b1;
    int b2;

    public complexaddsub(int a1,int a2,int b1,int b2){
        this.a1 = a1;
        this.a2 = a2;
        this.b1 = b1;
        this.b2 = b2;
        System.out.println("Constructor called");
    }


    public String Add(){
        return (a1 + a2)+ " + " +(b1 + b2)+ "i";
    }

    public String Sub(){
        return (a1 - a2)+ " + " +(b1 - b2)+ "i";
    }

    public static void main(String[] args) {
        complexaddsub c = new complexaddsub(4, 5, 8, 7);
        String addition = c.Add();
        System.out.println(addition);
        String subtraction = c.Sub();
        System.out.println(subtraction);
    }
}