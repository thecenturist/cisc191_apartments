package com.apartments.app;

/**
 * Lead Author(s):
 * @author Anjolaoluwa Akinremi
 * 
 * References:
 * Version/date: March-9-2024
 * 
 * Responsibilities of class:
 * Model an Apartment unit of a Building
 */

public class Apartment {
    private double numberOfBedrooms; // An Apartment has-a numberOfBedrooms
    private double numberOfBathrooms; // An Apartment has-a numnberOfBathrooms
    private double rentAmount; // An Apartment has-a rentAmount
    private double squareFootage; // An Apartment has-a squareFootage
    private Lease lease; // An Apartment has-a Lease

    Apartment(double bed, double bath, double rent, double squareFootage){
        this.numberOfBedrooms = bed;
        this.numberOfBathrooms = bath;
        this.rentAmount = rent;
        this.squareFootage = squareFootage;
    }

    /**
     * Return the number of bedrooms the Apartment has
     * @return double
     */
    public double getBed() {
    	return this.numberOfBedrooms;
    }
    
    /**
     * Return the number of bathrooms the Bathroom has
     * @return double
     */
    public double getBathroom() {
    	return this.numberOfBathrooms;
    }

    /**
     * Return true if the Apartment is occupied, otherwise false
     * @return
     */
    public boolean isOccupied(){
        return this.lease != null;
    }
    
    /**
     * Return the square footage of the Apartment
     * @return double
     */
    public double getSquareFootage() {
    	return this.squareFootage;
    }
    
    /**
     * Return the Rent amount of the Apartment
     * @return double
     */
    public double getRent() {
    	return this.rentAmount;
    }
    
    /**
     * Return the lease of the apartment if there is one, else returns null
     * @return Lease
     */
    public Lease getLease() {
    	return this.lease;
    }
    
    /**
     * Set the number of bedrooms the Apartment has
     * @param num
     */
    public void setBed(double num) {
    	this.numberOfBedrooms = num;
    }

    /**
     * Set the number of bathrooms the Apartment has
     * @param num
     */
    public void setBath(double num) {
    	this.numberOfBathrooms = num;
    }
    
    /**
     * Set the rent amount of the Apartment
     * @param num
     */
    public void setRent(int num) {
    	this.rentAmount = num;
    }
    
    /**
     * Set the square footage of the Apartment
     * @param sqft
     */
    public void setSquareFootage(double sqft) {
    	this.squareFootage = sqft;
    }
    
    /**
     * Set the lease for the Apartment
     * @param newLease
     */
    public void setLease(Lease newLease){
        this.lease = newLease;
    }
    
    
}
