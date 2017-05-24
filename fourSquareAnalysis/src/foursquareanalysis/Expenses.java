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
public class Expenses {
    private double tax;
    private double insurance;
    private double utilities;
    private double hoa;
    private double lawn;
    private double snow;
    private double vacancy;
    private double repairs;
    private double capEx;
    private double propertyManagement;
    private double mortgagePayment;
    private double tExpenses;
    public Expenses(){
    tax=insurance=utilities=hoa=lawn=snow=vacancy=repairs=capEx=propertyManagement=mortgagePayment=0;
    tExpenses=0;
    
    
    
    }
    public double calculateTotalExpenses(){
    
        tExpenses=tax+insurance+utilities+hoa+lawn+snow+vacancy+repairs+capEx+propertyManagement+mortgagePayment;
        
        return tExpenses;
    }
    
    /**
     * @return the tax
     */
    public double getTax() {
        return tax;
    }

    /**
     * @param tax the tax to set
     */
    public void setTax(double tax) {
        this.tax = tax;
    }

    /**
     * @return the insurance
     */
    public double getInsurance() {
        return insurance;
    }

    /**
     * @param insurance the insurance to set
     */
    public void setInsurance(double insurance) {
        this.insurance = insurance;
    }

    /**
     * @return the utilities
     */
    public double getUtilities() {
        return utilities;
    }

    /**
     * @param utilities the utilities to set
     */
    public void setUtilities(double utilities) {
        this.utilities = utilities;
    }

    /**
     * @return the hoa
     */
    public double getHoa() {
        return hoa;
    }

    /**
     * @param hoa the hoa to set
     */
    public void setHoa(double hoa) {
        this.hoa = hoa;
    }

    /**
     * @return the lawn
     */
    public double getLawn() {
        return lawn;
    }

    /**
     * @param lawn the lawn to set
     */
    public void setLawn(double lawn) {
        this.lawn = lawn;
    }

    /**
     * @return the snow
     */
    public double getSnow() {
        return snow;
    }

    /**
     * @param snow the snow to set
     */
    public void setSnow(double snow) {
        this.snow = snow;
    }

    /**
     * @return the vacancy
     */
    public double getVacancy() {
        return vacancy;
    }

    /**
     * @param vacacy the vacancy to set
     */
    public void setVacacy(double vacacy) {
        this.vacancy = vacancy;
    }

    /**
     * @return the repairs
     */
    public double getRepairs() {
        return repairs;
    }

    /**
     * @param repairs the repairs to set
     */
    public void setRepairs(double repairs) {
        this.repairs = repairs;
    }

    /**
     * @return the capEx
     */
    public double getCapEx() {
        return capEx;
    }

    /**
     * @param capEx the capEx to set
     */
    public void setCapEx(double capEx) {
        this.capEx = capEx;
    }

    /**
     * @return the propertyManagement
     */
    public double getPropertyManagement() {
        return propertyManagement;
    }

    /**
     * @param propertyManagement the propertyManagement to set
     */
    public void setPropertyManagement(double propertyManagement) {
        this.propertyManagement = propertyManagement;
    }

    /**
     * @return the mortgagePayment
     */
    public double getMortgagePayment() {
        return mortgagePayment;
    }

    /**
     * @param mortgagePayment the mortgagePayment to set
     */
    public void setMortgagePayment(double mortgagePayment) {
        this.mortgagePayment = mortgagePayment;
    }

    /**
     * @return the tExpenses
     */
    public double gettExpenses() {
        return tExpenses;
    }

    /**
     * @param tExpenses the tExpenses to set
     */
    public void settExpenses(double tExpenses) {
        this.tExpenses = tExpenses;
    }
}
