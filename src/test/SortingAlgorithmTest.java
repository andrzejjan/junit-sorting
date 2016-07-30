package test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import main.SortingAlgorithms;



public class SortingAlgorithmTest {
	
	private SortingAlgorithms classUnderTest;
	
	
	@Before
	public void setUp() {
		System.out.println("Metoda zostanie wykonana przed kazdym testem");
		
		classUnderTest = new SortingAlgorithms();
	}
	
	@Test
	public void testTablicyAsc() {
		double[] tab = {4, 2, 5, 1, 7, 6, 9};
		double[] wzor = {1, 2, 4, 5, 6, 7, 9};
		
		classUnderTest.sortAsc(tab, true);
		
		for(int i = 0; i < tab.length; i++) {
			Assert.assertTrue(tab[i] == wzor[i]);
		}

	}
	
	@Test
	public void testTablicyDesc() {
		double[] tab = {4, 2, 5, 1, 7, 6, 9};
		double[] wzor = {9, 7, 6, 5, 4, 2, 1};
		
		classUnderTest.sortAsc(tab, false);
		
		for(int i = 0; i < tab.length; i++) {
			Assert.assertTrue(tab[i] == wzor[i]);
		}

	}
	
//	@Test
//	public void testTablicyRandom() {
//		double[] rand = new double[1000];
//		
//		
//	}
	
}
