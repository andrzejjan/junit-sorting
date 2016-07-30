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
	public void test1() {
		double[] tab = {3, 2, 7, 4, 9};
		double[] wzorzec = {2, 3, 4, 7, 9};
		
		classUnderTest.sortAsc(tab, true);
		
		for (int i = 0; i < tab.length; i++) {
			Assert.assertTrue(tab[i] == wzorzec[i]);
		}
	}
	
	@Test
	public void testJFR() {
		double[] tab1 = { 2.5, 6, 3.1, 1.9, 1.5 };
		double[] tab2 = { 1.5, 1.9, 2.5, 3.1, 6 };

		classUnderTest.sortAsc(tab1, true);
				
		for (int i = 0; i < tab1.length; i++) {
			Assert.assertTrue(tab1[i] == tab2[i]);
		}
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
