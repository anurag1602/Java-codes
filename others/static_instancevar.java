public class static_instancevar {
    // public static String name;
    public String name;

    public static_instancevar(String name){
        // static_instancevar.name = name;
        this.name = name;
    }

    public void print(){
        System.out.println(name);
    }


    public static void main(String[] args) {
        static_instancevar david = new static_instancevar("david");
        david.print();
        static_instancevar atulya = new static_instancevar("atulya");
        atulya.print();     
        david.print();
    }
}
