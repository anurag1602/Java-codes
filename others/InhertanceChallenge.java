import java.util.Scanner;
class ShoppingList {
    public static String list(int itemcode){                 //static 
        String itemName = " ";
        switch(itemcode) {
            case 1 : 
                itemName = "Fruits";
                System.out.println("Item name is " + itemName);
            break;
            case 2:
                itemName = "drinks";
                System.out.println("item name is :"+ itemName);
            break;
            case 3:
                itemName = "vegetables";
                System.out.println("item name is :"+ itemName);
            break;                                             // not returned here 
            case 4:                                            
                itemName = "toys";
                System.out.println("item name is:"+ itemName);
            break;
            default:
                System.out.println("invalid input code");
        }
        return itemName;
    }

}


class ShoppingCart extends ShoppingList {
    

    public static double price(String itemName){
        double itemPrice = 0;
        if(itemName == "Fruits"){
            itemPrice = 40;
            System.out.println("item price is : "+ itemPrice);

        }else if(itemName == "drinks"){
            itemPrice = 30;
            System.out.println("item price is :"+ itemPrice);

        }else if(itemName == "vegetables"){
            itemPrice = 50;
            System.out.println("item price is :"+ itemPrice);

        }else if(itemName == "toys"){
            itemPrice = 100;
            System.out.println("item price is :"+ itemPrice);

        }

        return itemPrice;
        
    }
}

class wallet extends ShoppingCart {

    double wallet_balance = 25;


    public void bill(double itemPrice){
        if(itemPrice<wallet_balance){

            System.out.println("Your current wallet balance is :"+wallet_balance);
            System.out.println("thanks for shopping");
            updatedbalance(itemPrice);

        }else if(itemPrice>wallet_balance) {

                System.out.println("Your current wallet balance is :"+wallet_balance);
                System.out.println("Your wallet balance is low !!");
                
                double rechargeamount = itemPrice - wallet_balance;
                System.out.println("You need to recharge with "+rechargeamount);




                // Scanner sc = new Scanner(System.in);
                // System.out.println("Enter the new amount you want to recharge with");
                // double amount = sc.nextDouble();
                // recharge(amount);

                recharge(rechargeamount);
                // sc.close();

            }
        

       
    } 


    public void updatedbalance(double itemPrice){
        wallet_balance = wallet_balance - itemPrice;
        System.out.println("Updated balance is :"+wallet_balance);
    }



    public void recharge(double amount){
        wallet_balance = wallet_balance + amount;
        System.out.println("Your reacharged wallet balance is "+ wallet_balance);
        //bill(itemPrice);                         // Now after the recharging the wallet i want to call the bill() method to shop
    }
}








class InheritanceChallenge {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("please choose the product you want to buy");
        System.out.println("press 1 for fruits");
        System.out.println("press 2 for drinks");
        System.out.println("press 3 for vegetables");
        System.out.println("press 4 for toys");
        int itemcode = sc.nextInt();
        wallet obj = new wallet();
        String itemName = obj.list(itemcode);
        double itemprice = obj.price(itemName);
        obj.bill(itemprice);
        
    }
}
