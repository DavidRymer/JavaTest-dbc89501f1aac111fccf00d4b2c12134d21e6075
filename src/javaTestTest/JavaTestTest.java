package javaTestTest;

import static org.junit.Assert.*;

import org.junit.Test;

import javaTest.Player;
import javaTest.PointOfInterest;

public class JavaTestTest {
	
	@Test
	public void testMove() {
		
		Player tony = new Player("tony");
		
		tony.move("north");
		assertEquals("not moved correctly", 1, tony.getyCoordPlayer());
		
		tony.move("east");
		assertEquals("not moved correctly", 1, tony.getxCoordPlayer());
		
		tony.move("south");
		assertEquals("not moved correctly", 0, tony.getyCoordPlayer());
		
		tony.move("west");
		assertEquals("not moved correctly", 0, tony.getxCoordPlayer());
		

	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testWatch() {
		
		Player tony = new Player("tony");
		PointOfInterest a = new PointOfInterest("test", false, 1,1,0);
		PointOfInterest b = new PointOfInterest("test", false, 2,2,0);
		PointOfInterest[] points = {a, b};
		
		assertTrue("Wrong distance", (tony.watch(points) < Math.sqrt(2) + 0.1) && (tony.watch(points)> Math.sqrt(2) -0.1));
		
		tony.setxCoordPlayer(3);
		tony.setyCoordPlayer(6);
		
		assertTrue("Wrong distance", (tony.watch(points) < 4.1 +0.1) && (tony.watch(points)> 4.1 - 0.1));
		
		
		
	}
	


	
}
