package test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import main.SortingAlgorithms;

public class SortingAlgorithmTest {

	private SortingAlgorithms classUnderTest;
	
	@Before
	public void before() {
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
}
