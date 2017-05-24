/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foursquareanalysis;

import java.util.Scanner;

/**
 *
 * @author owsutton
 */
public class FourSquareAnalysis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RentalIncome rI = new RentalIncome();
        Expenses e = new Expenses();
        CashFlow cF= new CashFlow();
        // TODO code application logic here
        System.out.println("Enter Rental Income");
        Scanner k = new Scanner(System.in);
        rI.setRentalIncome(k.nextDouble());
        System.out.println("Enter Misc Income");
        rI.setIncomeMisc(k.nextDouble());
        rI.calculateRentalIncome();
        System.out.println("Total Income is: "+ rI.gettIncome());
     
        System.out.println("Enter Mortgage Payment");
        e.setMortgagePayment(k.nextDouble());
        e.calculateTotalExpenses();
        System.out.println("Total Expenses :"+ e.gettExpenses());
        //cF.calculateCashFlow();
        
        System.out.println("Cash Flow "+ cF.calculateCashFlow(rI.gettIncome(),e.gettExpenses()));
        
    }
    
}
