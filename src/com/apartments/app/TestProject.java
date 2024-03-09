package com.apartments.app;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * Lead Author(s):
 * @author Anjolaoluwa Akinremi
 * 
 * References:
 * Version/date: March-9-2024
 * 
 * Responsibilities of class:
 * Test class and methods to support the Apartments.com application
 */

class TestProject
{
	@Test
	void testGetBuildingCode() {
		Building buildingA = new Building('A');
		assertEquals('A', buildingA.getCode());
	}
	
	@Test
	void testAddBuildingApartment() {
		Building buildingA = new Building('A');
		Apartment unit1 = new Apartment(4, 2.5, 5990, 2600);
		Apartment unit2 = new Apartment(1, 1, 1500, 2600);
		buildingA.addApartment(unit1);
		assertEquals(1, buildingA.getApartments().size());
		buildingA.addApartment(unit2);
		assertEquals(2, buildingA.getApartments().size());
	}
	
	@Test
	void testGetBuildingApartments() {
		Building buildingA = new Building('A');
		Apartment unit1 = new Apartment(4, 2.5, 5990, 2600);
		Apartment unit2 = new Apartment(1, 1, 1500, 2600);
		buildingA.addApartment(unit1);
		buildingA.addApartment(unit2);
		assertEquals(unit1, buildingA.getApartment("A1"));
		assertEquals(unit2, buildingA.getApartment("A2"));
	}
}
