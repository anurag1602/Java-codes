public class Grocery_Mart {


    private String cust_Name;
    private String cust_ID;
    private String ph_no;
    private double acc_balance;
    private String cust_Address;

    public Grocery_Mart(){
        // System.out.println("sgvdsad");
        this("Rohan", "#12345", "2672653423", 450, "India");
        System.out.println("Default Constructor was called");
    }


    public Grocery_Mart(String cust_Name,String cust_ID,String ph_no,double acc_balance,String cust_Address){
        this.cust_Name = cust_Name;
        this.cust_ID = cust_ID;
        this.ph_no = ph_no;
        this.acc_balance = acc_balance;
        this.cust_Address = cust_Address;
        System.out.println("Constructor called");
    }

    public Grocery_Mart(String cust_Name,String cust_ID,String ph_no){
        this(cust_Name,cust_ID,ph_no,200,"newadd");
    }






    public void setcust_Name(String cust_Name){
        this.cust_Name = cust_Name;
    }

    public String getcust_Name(){
        return cust_Name;
    }
    
    public void setcust_ID(String cust_ID){
        this.cust_ID = cust_ID;
    }

    public String getcust_ID(){
        return cust_ID;
    }

    public void setph_no(String ph_no){
        this.ph_no = ph_no;
    }

    public String getph_no(){
        return ph_no;
    }

    public void setacc_balance(double acc_balance){
        this.acc_balance = acc_balance;
    }

    public double getacc_balance(){
        return acc_balance;
    }

    public void setcust_Address(String cust_Address){
        this.cust_Address = cust_Address;
    }

    public String getcust_Addresss(){
        return cust_Address;
    }




    public void shop(double shopamount){
        double rembalance = acc_balance - shopamount;
        if(shopamount<=acc_balance){
            System.out.println("Thanks for shopping . Your remaining balance is : "+rembalance);
            acc_balance = rembalance;
        }else{
            double lowamount = shopamount - acc_balance;
            System.out.println("ohh! your account balance is low you have to recharge "+lowamount + " more");
            rechargebal(lowamount);
        }
    }


    public void rechargebal(double rechargeamount){
        acc_balance = acc_balance + rechargeamount;
        System.out.println("Your recharged account balance is : "+acc_balance);
    }
 

  





    public static void main(String[] args) {
        // Grocery_Mart myaccount = new Grocery_Mart("Rohan", "#12345", "357632423", 450, "India");
        Grocery_Mart myaccount = new Grocery_Mart();
        
        
        // myaccount.setacc_balance(500);
        // myaccount.setcust_Address("India");
        // myaccount.setcust_ID("#12345");
        // myaccount.setcust_Name("Rohan");
        // myaccount.setph_no("9238783645");

        myaccount.shop(510);
        myaccount.shop(520);
        myaccount.shop(490);



        Grocery_Mart other_account = new Grocery_Mart("aman","#125","34734537",100,"def");
        
        System.out.println(other_account.getacc_balance());
        other_account.shop(500);
        other_account.shop(450);


        Grocery_Mart newAcc = new Grocery_Mart("newA","#523523","5362356523");

        System.out.println(newAcc.getcust_Name());
        System.out.println(newAcc.getacc_balance());
        newAcc.shop(150);
        

        
        
    }

    
}
