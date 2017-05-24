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
public class CCROI {
    private double downPayment;
    private double closingCost;
    private double rehabBudget;
    private double miscInvestment;
    private double tInvestment;
    private double aCashFlow;//annual Cash Flow
    private double ccROI;// Cash on Cash Return on Investment
    CashFlow cF= new CashFlow();
    
    public CCROI(){
    downPayment=closingCost=rehabBudget=miscInvestment=tInvestment=aCashFlow=ccROI=0;

    
    
    
    
    }
    public double CalculateCCROI(){
    
       tInvestment= downPayment+closingCost+rehabBudget+miscInvestment;
       aCashFlow= cF.getCashFlow()*12;
       ccROI= aCashFlow/tInvestment;
            
            
        return ccROI;
    }

    /**
     * @return the downPayment
     */
    public double getDownPayment() {
        return downPayment;
    }

    /**
     * @param downPayment the downPayment to set
     */
    public void setDownPayment(double downPayment) {
        this.downPayment = downPayment;
    }

    /**
     * @return the closingCost
     */
    public double getClosingCost() {
        return closingCost;
    }

    /**
     * @param closingCost the closingCost to set
     */
    public void setClosingCost(double closingCost) {
        this.closingCost = closingCost;
    }

    /**
     * @return the rehabBudget
     */
    public double getRehabBudget() {
        return rehabBudget;
    }

    /**
     * @param rehabBudget the rehabBudget to set
     */
    public void setRehabBudget(double rehabBudget) {
        this.rehabBudget = rehabBudget;
    }

    /**
     * @return the miscInvestment
     */
    public double getMiscInvestment() {
        return miscInvestment;
    }

    /**
     * @param miscInvestment the miscInvestment to set
     */
    public void setMiscInvestment(double miscInvestment) {
        this.miscInvestment = miscInvestment;
    }

    /**
     * @return the tInvestment
     */
    public double gettInvestment() {
        return tInvestment;
    }

    /**
     * @param tInvestment the tInvestment to set
     */
    public void settInvestment(double tInvestment) {
        this.tInvestment = tInvestment;
    }

    /**
     * @return the aCashFlow
     */
    public double getaCashFlow() {
        return aCashFlow;
    }

    /**
     * @param aCashFlow the aCashFlow to set
     */
    public void setaCashFlow(double aCashFlow) {
        this.aCashFlow = aCashFlow;
    }

    /**
     * @return the ccROI
     */
    public double getCcROI() {
        return ccROI;
    }

    /**
     * @param ccROI the ccROI to set
     */
    public void setCcROI(double ccROI) {
        this.ccROI = ccROI;
    }
    
    
    
}
