package sorting.test;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import sorting.AbstractSorting;
import sorting.divideAndConquer.MergeSort;
import sorting.divideAndConquer.QuickSort;
import sorting.divideAndConquer.quicksort3.QuickSortMedianOfThree;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by estacio on 11/07/16.
 */
public class RandomTest {

	private Integer[] vetor;
	private AbstractSorting<Integer> implementation;

	@Before
	public void setUp() {
		populaVetor();
		getImplementation();
	}
	
	private void getImplementation() {
		//TODO O aluno deve instanciar sua implementa��o abaixo ao inv�s de null
		this.implementation = new MergeSort<>();
	}

	private void populaVetor() {
		int size = getRandomNumberInRange(90000, 100000);
		vetor = new Integer[size];

		for(int i = 0; i < size; i++){
			vetor[i] = getRandomNumberInRange(-10000, 10000);
		}
	}

	public void genericTest(Integer[] array) {
		Integer[] copy1 = Arrays.copyOf(array, array.length);
		implementation.sort(array);
		Arrays.sort(copy1);
		Assert.assertArrayEquals(copy1, array);
	}

	@Test
	public void testSort01() {
		genericTest(vetor);
	}

	@Test
	public void testSort02() {
		genericTest(vetor);
	}

	@Test
	public void testSort03() {
		genericTest(vetor);
	}

	@Test
	public void testSort04() {
		genericTest(vetor);
	}

	@Test
	public void testSort05() {
		genericTest(vetor);
	}

	@Test
	public void testSort06() {
		genericTest(vetor);
	}

	@Test
	public void testSort07() {
		genericTest(vetor);
	}

	@Test
	public void testSort08() {
		genericTest(vetor);
	}

	@Test
	public void testSort09() {
		genericTest(vetor);
	}

	private static int getRandomNumberInRange(int min, int max) {

		if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}

		Random r = new Random();
		return r.nextInt((max - min) + 1) + min;
	}
}