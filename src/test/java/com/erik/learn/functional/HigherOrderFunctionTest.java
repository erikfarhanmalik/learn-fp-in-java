package com.erik.learn.functional;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class HigherOrderFunctionTest {

	@Test
	public void createGreaterThan100() {

		HigherOrderFunction.GreaterThan greaterThan10 = HigherOrderFunction.createGreaterThan(100);
		assertThat(greaterThan10.evaluate(90), is(false));
		assertThat(greaterThan10.evaluate(110), is(true));
	}

	@Test
	public void createGreaterThan10() {

		HigherOrderFunction.GreaterThan greaterThan10 = HigherOrderFunction.createGreaterThan(10);
		assertThat(greaterThan10.evaluate(9), is(false));
		assertThat(greaterThan10.evaluate(11), is(true));
	}
}