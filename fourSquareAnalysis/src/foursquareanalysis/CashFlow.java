/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foursquareanalysis;

/**
 *
 * @author owsutton
 */
public class CashFlow {
    //private double cashFlow;
    RentalIncome rI= new RentalIncome();
    Expenses e = new Expenses();
    double cashFlow;
    double income, expenses;
     /**
     * @return the cashFlow
     */
    public double getCashFlow() {
        return cashFlow;
    }

    /**
     * @param cashFlow the cashFlow to set
     */
    public void setCashFlow(double cashFlow) {
        this.cashFlow = cashFlow;
    }

    public CashFlow(){
    //cashFlow=0;
    }
    public double calculateCashFlow(double income, double expenses){
        
       this.income=income;
       this.expenses=expenses;
    
       cashFlow= income-expenses;
        
        return cashFlow;
    }

}
