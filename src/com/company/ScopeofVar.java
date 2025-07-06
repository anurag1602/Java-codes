package com.company;

public class ScopeofVar {
    public int publicvariable = 5;
    private int privatevariable = 1;

    private void checkScope(){
        System.out.println("The public variable is: "+publicvariable + " The private variable is: "+privatevariable);
    }

    
    public int getprivatevariable(){
        return privatevariable;
    }


    


    public void Multiplier(){
        int privatevariable = 20;     // Not being used cause this keyword is used
       

        for(int i = 0; i < 5; i++){
            System.out.println(i + " multiplied by " + this.privatevariable + " = " + i * this.privatevariable);
        }

        // System.out.println(i);
    }

    public void accessingInner(){
        InnerScopeofVar inner = new InnerScopeofVar();
        System.out.println("The inner class variable is: " + inner.privatevariable);
    }




    public class InnerScopeofVar {
         
        public int privatevariable = 50;

        public int getprivatevariable(){
            return privatevariable;
        }

        public void checkInnerScope(){
            System.out.println("The is related to Inner class , The value of private variable is: "+privatevariable);
        }
 
        public void Multiplier(){
            int privatevariable = 40;     // Not being used cause this keyword is used
            
            for(int i = 0; i < 5; i++){
                System.out.println(i + " multiplied by " + ScopeofVar.this.privatevariable + " = " + i * ScopeofVar.this.privatevariable);
            }
        }
    


        
    }

}
