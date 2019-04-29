package com.formation;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Test du calculateur")
public class PremierTest {
	
	private static Calculateur calcul = null;
	
	@BeforeAll
	public static void init()
	{
		calcul = new Calculateur();
	}

	@Test
	@DisplayName("test du add")
	void addTest()
	{
		assertEquals(42, calcul.add(36, 6), "add not ok!");
	}
	
	@Test
	@DisplayName("test du div")
	void multiplyTest()
	{
		assertEquals(42, calcul.multiply(6, 7), "multiply not ok!");
	}
	
	@Test
	@DisplayName("test du multiply")
	void divTest()
	{
		assertEquals(42, calcul.div(630, 15), "div not ok!");
	}
}
