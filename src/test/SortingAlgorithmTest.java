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
	public void test1() throws Exception {
		double[] z1 = { 4, 2, 8, 3, 12 };
		double[] wzorzec = { 2, 3, 4, 8, 12 };
		classUnderTest.sortAsc(z1, true);

		for (int i = 0; i < z1.length; i++) {
			Assert.assertTrue(z1[i] == wzorzec[i]);
		}

	}
	
}