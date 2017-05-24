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
public class Property {
    private PropertyType propertyType;
    private String address;
    private double purchasePrice;
    private String description;
    
    public Property(){
    propertyType= propertyType.singleFamily;
    address="";
    purchasePrice=0;
    description="";
    }
    public Property(PropertyType propertyType, String address,double purcahsePrice,String description){
        this.propertyType=propertyType;
        this.address=address;
        this.purchasePrice=purchasePrice;
        this.description=description;
        
    }
    public String toString(){
    
        return getPropertyType()+ " "+ getAddress()+ " "+ getPurchasePrice()+ " "+ getDescription();
    }

    /**
     * @return the propertyType
     */
    public PropertyType getPropertyType() {
        return propertyType;
    }

    /**
     * @param propertyType the propertyType to set
     */
    public void setPropertyType(PropertyType propertyType) {
        this.propertyType = propertyType;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the purchasePrice
     */
    public double getPurchasePrice() {
        return purchasePrice;
    }

    /**
     * @param purchasePrice the purchasePrice to set
     */
    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }
    
}
