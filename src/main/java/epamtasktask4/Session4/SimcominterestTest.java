package epamtasktask4.Session4;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import junit.framework.TestCase;


public class SimcominterestTest {

	@Test
	public void test1() {
		Simcominterest i = new Simcominterest();
		double a1 = i.sinterest(5000,6,2);
		assertEquals(600.0,a1,0.001);
		double a2 = i.cinterest(5000,6,2);
		assertEquals(630.812096,a2,0.001);
	}
	@Test
	public void test2() {
		Simcominterest i = new Simcominterest();
		double a1 = i.sinterest(15000,9,4);
		assertEquals(5400.0,a1,0.001);
		double a2 = i.cinterest(15000,9,4);
		assertEquals(6349.677186,a2,0.001);
	}
	@Test
	public void test3() {
		Simcominterest i = new Simcominterest();
		double a1 = i.sinterest(1000,8,8);
		assertEquals(640.0,a1,0.001);
		double a2 = i.cinterest(1000,8,8);
		assertEquals(850.930210,a2,0.001);
	}
	@Test
	public void test4() {
		Simcominterest i = new Simcominterest();
		double a1 = i.sinterest(4000,5,8);
		assertEquals(1600.0,a1,0.001);
		double a2 = i.cinterest(4000,5,8);
		assertEquals(1877.312307,a2,0.001);
	}
}
