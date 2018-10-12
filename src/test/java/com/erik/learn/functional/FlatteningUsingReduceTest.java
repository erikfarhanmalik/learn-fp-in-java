package com.erik.learn.functional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class FlatteningUsingReduceTest {

	@Test
	public void reduce() {

		List<List<Integer>> arrays = Arrays.asList(
				Arrays.asList(1, 2, 3),
				Arrays.asList(4, 5),
				Collections.singletonList(6)
		);

		List<Integer> reduced = FlatteningUsingReduce.reduce(arrays, (a, b) -> a.addAll(b), new ArrayList<>());
		assertThat(reduced.size(), is(6));
	}
}