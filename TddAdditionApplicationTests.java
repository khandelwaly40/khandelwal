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
	    Assert.assertEquals(3+6+15, StringCalculator.add("3,6n15"));
	}
	
	@Test
	public final void whenDelimiterIsSpecifiedThenItIsUsedToSeparateNumbers() {
	    Assert.assertEquals(3+6+15, StringCalculator.add("//;n3;6;15"));
	}

}
