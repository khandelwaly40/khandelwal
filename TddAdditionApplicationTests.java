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

}
