package com.erik.learn.functional;

import java.util.Arrays;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;


public class EverythingTest {

	@Test
	public void every() {

		boolean actual = Everything.every(Arrays.asList(1, 2, 3, 5), t -> t < 10);
		assertThat(actual, is(true));
	}

	@Test
	public void notEvery() {

		boolean actual = Everything.every(Arrays.asList(1, 2, 300, 5), t -> t < 100);
		assertThat(actual, is(false));
	}
}