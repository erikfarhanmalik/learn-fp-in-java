package com.erik.learn.functional;

public class Looper {

	@FunctionalInterface
	interface LoopAction {
		void execute(int i, Printer printer);
	}

	@FunctionalInterface
	interface Printer {
		void execute(int integer);
	}

	private static void loop(int count, LoopAction action, Printer printer) {

		for (int i = count; i > 0; i--) {
			action.execute(i, printer);
		}
	}

	public static void main(String[] args) {

		loop(3, (i, p) -> p.execute(i), System.out::println);
		System.out.println("=====================================");
		loop(10, (i, p) -> p.execute(i), System.out::println);
	}
}
