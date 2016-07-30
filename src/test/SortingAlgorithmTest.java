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
		double[] tab = {3, 5, 7, 85, 125, 4, 18, 45, 78, 1, 55, 2, 14, 32 };
		double[] exa = {1, 2, 3, 4, 5, 7, 14, 18, 32, 45, 55, 78, 85, 125 };
		
		classUnderTest.sortAsc(tab, true);
		
		for (int i = 0; i < tab.length; i++) {
			Assert.assertTrue(tab[i] == exa[i]);
		
		}
	}
	@Test
	public void test1jw() throws Exception {
		double[] z1 = { 4, 2, 8, 3, 12 };
		double[] wzorzec = { 2, 3, 4, 8, 12 };
		classUnderTest.sortAsc(z1, true);

		for (int i = 0; i < z1.length; i++) {
			Assert.assertTrue(z1[i] == wzorzec[i]);
		}

	}

}

