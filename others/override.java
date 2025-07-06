public class override {
   public void add(int a,int b){
    int sum = a + b;
    System.out.println("parent class sum: "+sum);
   }
   
   public static void main(String[] args) {
        override o = new override();
        override1 o1 = new override1();
        o.add(10, 12);
        o1.add(1, 2);
   }
}

class override1 extends override{
    public void add(int a,int b){
        int sum = a + b;
        System.out.println("child class sum: " + sum);
    }

}