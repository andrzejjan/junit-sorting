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
		double[] tab = { 3, 5, 7, 85, 125, 4, 18, 45, 78, 1, 55, 2, 14, 32 };
		double[] exa = { 1, 2, 3, 4, 5, 7, 14, 18, 32, 45, 55, 78, 85, 125 };

		classUnderTest.sortAsc(tab, true);

		for (int i = 0; i < tab.length; i++) {
			Assert.assertTrue(tab[i] == exa[i]);

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
		double[] tab = { 4, 2, 5, 1, 7, 6, 9 };
		double[] wzor = { 1, 2, 4, 5, 6, 7, 9 };

		classUnderTest.sortAsc(tab, true);

		for (int i = 0; i < tab.length; i++) {
			Assert.assertTrue(tab[i] == wzor[i]);
		}

	}
}
