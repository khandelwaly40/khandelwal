package com.tdd.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.tdd.demo.TddAdditionApplication;

@SpringBootTest
class TddAdditionApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public final void whenAddingOneNumberSameNumberIsResult() {
		Assert.assertEquals(3, TddAdditionApplication.add("3"));
	}

	@Test
	public final void whenTwoNumbersAreAddedThenSumIsTheAddition() {
		Assert.assertEquals(5+10, TddAdditionApplication.add("5,10"));
	}

	@Test
	public final void whenAddedDelimeterAsNewLine() {
		Assert.assertEquals(3+6+15, TddAdditionApplication.add("3,6n15"));
	}

	@Test
	public final void whenDelimiterIsSpecifiedThenItIsUsedToSeparateNumbers() {
		Assert.assertEquals(3+6+15, TddAdditionApplication.add("//;n3;6;15"));
	}

	@Test
	public final void whenNegativeNumberPassed() {
		RuntimeException exception = null;
		try {
			TddAdditionApplication.add("3,-6,15,-18,46,33");
		} catch (RuntimeException e) {
			exception = e;
		}
		assert.assertNotNull(exception);
		Assert.assertEquals("Negatives not allowed: [-6, -18]", exception.getMessage());
	}

	@Test
	public final void whenTryingToAddWithThousandAndGreaterNumber() {
		Assert.assertEquals(1+1000+15, TddAdditionApplication.add("1,1000,1005,15,1234"));
	}

}
