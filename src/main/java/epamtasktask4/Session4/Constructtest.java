package epamtasktask4.Session4;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class Constructtest {
	@Test
	public void test1() {
		Constru c = new Constru();
		double a = c.construct(2,64);
		assertEquals(76800.0,a,0.001);
	}
	
	@Test
	public void test2() {
		Constru c = new Constru();
		double a = c.construct(4,65);
		assertEquals(97500.0,a,0.001);
	}
	@Test
	public void test3() {
		Constru c = new Constru();
		double a = c.construct(6,66);
		assertEquals(118800.0,a,0.001);
	}
	@Test
	public void test4() {
		Constru c = new Constru();
		double a = c.construct(8,67);
		assertEquals(167500.0,a,0.001);
	}
}