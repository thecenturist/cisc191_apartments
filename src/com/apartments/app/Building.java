package com.apartments.app;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;

public class Building {
    private static int unitCounter = 0; // A Building has-a unitCounter
    private char code; // A Building has-a code
    private Hashtable<String, Apartment> spaces; // A Building has spaces

    Building(char code){
        this.code = code;
        this.spaces = new Hashtable<String, Apartment>();
    }

    Building(char code, ArrayList<Apartment> apartments){
        this.code = code;
        try {
        	unitCounter += apartments.size();
        } catch (Exception ex){
            System.out.println("There was a problem adding apartments to building.");
        }

    }

    /**
     * Return the code of the Building
     * @return char
     */
    public char getCode(){
        return this.code;
    }

    /**
     * Return the Apartments the Building has
     * @return Hashtable
     */
    public Hashtable<String, Apartment> getApartments(){
        return this.spaces;
    }

    /**
     * Add an apartment unit to the Building's collection of apartments
     * @param newFlat
     */
    public void addApartment(Apartment newFlat){
        this.spaces.put(String.valueOf(this.code) + ++unitCounter, newFlat);
    }

    /**
     * Return a single Apartment from the Building given the Apartment code/key
     * @param code
     * @return Apartment
     */
    public Apartment getApartment(String code){
        return this.spaces.get(code);
    }
    
    public void listUnits() {
    	List<String> l = new ArrayList<String>(this.spaces.keySet());
    	System.out.println("Apartments in this building:");
    	System.out.println("CODE - OCCUPIED - RENT - BED - BATH");
    	for (int i = l.size() - 1; i >= 0; i--) {
    		System.out.println(l.get(i) + " - " + this.getApartment(l.get(i)).isOccupied() + " - " + this.getApartment(l.get(i)).getRent() + " - " + this.getApartment(l.get(i)).getBed() + " - " + this.getApartment(l.get(i)).getBathroom());
    	}
    }
}
