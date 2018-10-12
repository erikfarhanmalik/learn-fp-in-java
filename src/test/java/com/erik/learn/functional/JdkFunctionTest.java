package com.erik.learn.functional;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class JdkFunctionTest {

	@Test
	// for one input with an output -> there is the Bi version for this that take two input
	public void functionExample() {

		Function<List<Integer>, Integer> summer = (list) -> {
			Integer sum = 0;
			for (Integer integer : list) {
				sum += integer;
			}
			return sum;
		};

		assertThat(summer.apply(Arrays.asList(1, 2, 3, 4, 5)), is(15));
	}

	@Test
	// for one input with no output -> there is the Bi version for this that take two input
	public void consumerExample() {

		Consumer<String> printer = (string) -> System.out.println(string);
		printer.accept("FP in java");
	}

	@Test
	// for no input with an output
	public void SupplierExample() {

		Supplier<Integer> random = () -> 1001;
		assertThat(random.get(), is(1001));
	}
}