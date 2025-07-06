package com.oops.polymorphism;

public class Bill_bergers {

    public int partybill(int discount){
        int total_of_vege = 45 * 4;
        int total_of_Mcpuff = 25 * 3;
        int overall_total = total_of_vege + total_of_Mcpuff;
        int final_bill = overall_total - discount;
        return final_bill;

    }


}
