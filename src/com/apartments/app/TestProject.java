package com.apartments.app;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

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
	
	@Test
	void testStaffJobTitle() {
		Staff s1 = new Staff("Lisa", "Albridge", 783432837);
		s1.setJobTitle("Manager");
		assertEquals("Manager", s1.getJobTitle());
	}
	
	@Test
	void testHourlyWage() {
		Staff s1 = new Staff("Lisa", "Albridge", 783432837);
		s1.setHourlyWage(18.50);
		assertEquals(18.50, s1.getHourlyWage());
	}
	
	@Test
	void testWeeklyHours() {
		Staff s1 = new Staff("Lisa", "Albridge", 783432837);
		s1.setWeeklyHours(35);
		assertEquals(35, s1.getWeeklyHours());
	}
	
	@Test
	void testAnnualIncome() {
		Tenant t1 = new Tenant("John", "Fresca", 738789023);
		t1.setAnnualIncome(78500);
		assertEquals(78500, t1.getAnnualIncome());
	}
	
	@Test
	void testCreditScore() {
		Tenant t1 = new Tenant("John", "Fresca", 738789023);
		t1.setCreditScore(689);
		assertEquals(689, t1.getCreditScore());
	}
	
	@Test
	void testPerson() {
		Person p1 = new Person("Jamie", "Finnicky", 983022304);
		assertEquals(983022304, p1.getSSN());
		assertEquals("Finnicky", p1.getLastName());
		assertEquals("Jamie", p1.getFirstName());
		assertEquals("Jamie Finnicky", p1.getFullName());
		assertEquals("J.F.", p1.getInitials());
	}
	
	@Test
	void testLease() {
		Tenant t1 = new Tenant("John", "Doe", 0002232343);
		Tenant t2 = new Tenant("Jane", "Coke", 000212345);
		Tenant t3 = new Tenant("Jane", "Fonda", 000232345);
		ArrayList<Person> coo = new ArrayList<Person>();
		coo.add(t2);
		Lease lease = new Lease(t1, coo);
		assertEquals(t1, lease.getLeaseOwner());
		assertEquals(coo, lease.getLeaseCoowners());
	}
	
	@Test
	void testApartment() {
		Apartment unit1 = new Apartment(4, 2.5, 5990, 2600);
		Apartment unit2 = new Apartment(1, 1, 1500, 2600);
		Tenant t1 = new Tenant("John", "Doe", 0002232343);
		assertEquals(4, unit1.getBed());
		assertEquals(2.5, unit1.getBathroom());
		assertEquals(false, unit2.isOccupied());
		Lease lease = new Lease(t1, null);
		unit2.setLease(lease);
		assertEquals(true, unit2.isOccupied());
		assertEquals(2600, unit1.getSquareFootage());
		unit1.setSquareFootage(2601);
		assertEquals(2601, unit1.getSquareFootage());
		assertEquals(lease, unit2.getLease());
		assertEquals(1500, unit2.getRent());
	}
}
