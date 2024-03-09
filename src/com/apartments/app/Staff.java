package com.apartments.app;

/**
 * Lead Author(s):
 * @author Anjolaoluwa Akinremi
 * 
 * References:
 * Version/date: March-9-2024
 * 
 * Responsibilities of class:
 * Model a Staff object, representing an employee of the Apartment Complex
 */

// A Staff is-a Person
public class Staff extends Person {
    private String jobTitle; // A Staff has-a jobTitle
    private double hourlyWage; // A Staff has-a hourlyWage
    private double weeklyHours; // A Staff has-a weeklyHours

    Staff(String first, String last, int ssn) {
        super(first, last, ssn);
    }
    
    /**
     * Return the job title of Staff
     * @return String
     */
    public String getJobTitle() {
    	return this.jobTitle;
    }
    
    /**
     * Return the hourly wage of Staff
     * @return double
     */
    public double getHourlyWage() {
    	return this.hourlyWage;
    }
    
    /**
     * Return the weekly hours of Staff
     * @return double
     */
    public double getWeeklyHours() {
    	return this.weeklyHours;
    }
    
    /**
     * Set the job title of Staff
     * @param title
     */
    public void setJobTitle(String title) {
    	this.jobTitle = title;
    }
    
    /**
     * Set the hourly wage of Staff
     * @param wage
     */
    public void setHourlyWage(double wage) {
    	this.hourlyWage = wage;
    }
    
    /**
     * Set the weekly hours of Staff
     * @param hours
     */
    public void setWeeklyHours(double hours) {
    	this.weeklyHours = hours;
    }
}
