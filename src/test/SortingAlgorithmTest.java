package test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import main.SortingAlgorithms;

public class SortingAlgorithmTest {

	private SortingAlgorithms classUnderTest;

	@Before
	public void setUp() {
		classUnderTest = new SortingAlgorithms();
	}

	@Test
	public void test1() {
		double[] tab1 = { 2.5, 6, 3.1, 1.9, 1.5 };
		double[] tab2 = { 1.5, 1.9, 2.5, 3.1, 6 };

		classUnderTest.sortAsc(tab1, true);
				
		for (int i = 0; i < tab1.length; i++) {
			Assert.assertTrue(tab1[i] == tab2[i]);
		}
	}
	
	
}