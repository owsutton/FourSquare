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
    
}
