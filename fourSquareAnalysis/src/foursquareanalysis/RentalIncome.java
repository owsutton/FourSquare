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
public class RentalIncome {
    private double rentalIncome;
    private double laundry;
    private double storage;
    private double incomeMisc;
    private double tIncome;
    
    public RentalIncome(){
    rentalIncome=0;
    laundry=0;
    storage=0;
    incomeMisc=0;
    tIncome=0;
    }
   
    public double calculateRentalIncome(){
    
        tIncome= rentalIncome+laundry+storage+incomeMisc;
    
    return tIncome;
    }

    /**
     * @return the rentalIncome
     */
    public double getRentalIncome() {
        return rentalIncome;
    }

    /**
     * @param rentalIncome the rentalIncome to set
     */
    public void setRentalIncome(double rentalIncome) {
        this.rentalIncome = rentalIncome;
    }

    /**
     * @return the laundry
     */
    public double getLaundry() {
        return laundry;
    }

    /**
     * @param laundry the laundry to set
     */
    public void setLaundry(double laundry) {
        this.laundry = laundry;
    }

    /**
     * @return the storage
     */
    public double getStorage() {
        return storage;
    }

    /**
     * @param storage the storage to set
     */
    public void setStorage(double storage) {
        this.storage = storage;
    }

    /**
     * @return the incomeMisc
     */
    public double getIncomeMisc() {
        return incomeMisc;
    }

    /**
     * @param incomeMisc the incomeMisc to set
     */
    public void setIncomeMisc(double incomeMisc) {
        this.incomeMisc = incomeMisc;
    }

    /**
     * @return the tIncome
     */
    public double gettIncome() {
        return tIncome;
    }

    /**
     * @param tIncome the tIncome to set
     */
    public void settIncome(double tIncome) {
        this.tIncome = tIncome;
    }
    
    
}
