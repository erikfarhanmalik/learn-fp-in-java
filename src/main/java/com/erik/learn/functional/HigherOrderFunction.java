package com.erik.learn.functional;

class HigherOrderFunction {

	@FunctionalInterface
	interface GreaterThan {

		boolean evaluate(int a);
	}

	// Higher order function is a function that operate to other function by taking function as parameter or returning a function
	// Function in java is functional interface.
	static GreaterThan createGreaterThan(int base) {

		return (a) -> a > base;
	}
}
