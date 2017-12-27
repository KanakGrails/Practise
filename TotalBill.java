package com.practice.deleteit.later;

import java.util.*;
import java.math.*;

public class TotalBill {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();
        System.out.println((float)12/100);
        float tipValue=((float)tipPercent/100);
       float taxValue=((float)taxPercent/100);
       double totalBill=(double)(mealCost+(tipValue * mealCost)+(taxValue * mealCost));
        
      
        // cast the result of the rounding operation to an int and save it as totalCost 
        int totalCost = (int) Math.round(totalBill);
       System.out.print(totalCost);
      
    }
}