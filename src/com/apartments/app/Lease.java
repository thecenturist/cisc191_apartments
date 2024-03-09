package com.apartments.app;

import java.util.ArrayList;

/**
 * Lead Author(s):
 * @author Anjolaoluwa Akinremi
 * 
 * References:
 * Version/date: March-9-2024
 * 
 * Responsibilities of class:
 * Model a Lease for an Apartment or other Building unit
 */

public class Lease {
    private Tenant leaseOwner; // A Lease has-a leaseOwner
    private ArrayList<Person> leaseCoowners; // A Lease has leaseCoowners

    Lease (Tenant owner, ArrayList<Person> coowners){
        this.leaseOwner = owner;
        this.leaseCoowners = coowners;
    }

    /**
     * Return the owner of the Lease
     * @return Person
     */
    public Person getLeaseOwner(){
        return this.leaseOwner;
    }
    
    /**
     * Set the owner of the Lease
     * @param person
     */
    public void setLeaseOwner(Tenant person) {
    	this.leaseOwner = person;
    }
    
    /**
     * Return the list of CoOwners on the Lease
     * @return ArrayList<Person>
     */
    public ArrayList<Person> getLeaseCoowners(){
    	return this.leaseCoowners;
    }
    
    /**
     * Add a tenant to the list of CoOwners on the Lease
     * @param person
     */
    public void addCoowner(Tenant person) {
    	this.leaseCoowners.add(person);
    }
    
    /**
     * Remove a tenant from the list of CoOwners on the Lease. Returns true if removal
     * was successful, otherwise false.
     * @param person
     * @return boolean
     */
    public boolean removeCoowner(Tenant person) {
    	return this.leaseCoowners.remove(this.leaseCoowners.get(this.leaseCoowners.indexOf(person)));
    }
}
