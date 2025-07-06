package com.company;

public class Mainstatic {

    public static int value = 11;
    
    public static void main(String[] args) {
        Staticunderstanding st = new Staticunderstanding(1, "A");
        Staticunderstanding st1 = new Staticunderstanding(2, "B");

        st.details();
        st1.details();



        // New program but using same main class

        TestStatic test = new TestStatic("A");
        System.out.println("The name is: "+test.getname()+ " the no of instances are: "+ test.getNoofInst());

        TestStatic test1 = new TestStatic("B");
        System.out.println("The name is: "+test1.getname()+ " the no of instances are: "+test1.getNoofInst());





       
        int finalvalue = multiplier(10);
        System.out.println("The final value is: "+ finalvalue);


    }


    public static int multiplier(int val){
        return val * value;
    }
    
}
