package junitexample;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import mainjava.MathDemo;

public class MathDemoTest {

	private MathDemo mathDemo = new MathDemo();
	
	@BeforeAll
	static void setup()
	{
		System.out.println("BeforeAll executed");
	}
	
	@BeforeEach
	void setupThis()
	{
		System.out.println("BeforeEach executed");
	} 
	
	@Test
	public void testAdd() 
	{
	int result = mathDemo.add(10,15);
	assertEquals(result, 25);
	}
	
	@Test
	public void addFailure() 
	{
	int result = mathDemo.add(10,15);
	assertNotEquals(result, 15);
	}
	
	@Test
	public void testSubtract() 
	{
	int result = mathDemo.subtract(10,15);
	assertEquals(result, -5);
	}
	
	@Test
	@Disabled
	public void subtractFailure() 
	{
	int result = mathDemo.subtract(10,15);
	assertNotEquals(result, 5);
	}
	@AfterAll
	static void tear()
	{
		System.out.println("AfterAll executed");
	}
	
	@AfterEach
	void tearThis()
	{
		System.out.println("AfterEach executed");
	}
}
