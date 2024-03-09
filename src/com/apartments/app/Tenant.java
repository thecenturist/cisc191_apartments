package com.apartments.app;

/**
 * Lead Author(s):
 * @author Anjolaoluwa Akinremi
 * 
 * References:
 * Version/date: March-9-2024
 * 
 * Responsibilities of class:
 * Model a Tenant object, representing an Tenant or applicant of the Apartment Complex
 */

// A Tenant is-a Person
public class Tenant extends Person{
    private double annualIncome; // A Tenant has-a annualIncome
    private int creditScore; // A Tenant has-a creditScore

    Tenant(String first, String last, int ssn) {
        super(first, last, ssn);
    }

    Tenant(Person person, int ssn, double income, int creditScore){
        super(person);
    }
    
    /**
     * Return the annual income of Tenant
     * @return double
     */
    public double getAnnualIncome() {
    	return this.annualIncome;
    }
    
    /**
     * Return the credit score of Tenant
     * @return int
     */
    public int getCreditScore() {
    	return this.creditScore;
    }
    
    /**
     * Set the annual income of Tenant
     * @param income
     */
    public void setAnnualIncome(double income) {
    	this.annualIncome = income;
    }
    
    /**
     * Set the credit score of Tenant
     * @param score
     */
    public void setCreditScore(int score) {
    	this.creditScore = score;
    }
}