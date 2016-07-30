package test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;


import main.SortingAlgorithms;

public class SortingAlgorithmTest {

	private SortingAlgorithms classUnderTest;

	@Before
	public void befroe() {
		classUnderTest = new SortingAlgorithms();
	}

	@Test
	public void test1() {
		double[] tab = {3, 5, 7, 85, 125, 4, 18, 45, 78, 1, 55, 2, 14, 32 };
		double[] exa = {1, 2, 3, 4, 5, 7, 14, 18, 32, 45, 55, 78, 85, 125 };
		
		classUnderTest.sortAsc(tab, true);
		
		for (int i = 0; i < tab.length; i++) {
			Assert.assertTrue(tab[i] == exa[i]);
		
		}
	}

}
