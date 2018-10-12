package com.erik.learn.functional;

import java.util.List;

class FlatteningUsingReduce {

	@FunctionalInterface
	interface Combiner {
		void execute(List<Integer> a, List<Integer> b);
	}

	static List<Integer> reduce(List<List<Integer>> nonFlat, Combiner combiner, List<Integer> start) {

		for (List<Integer> integers : nonFlat) {
			combiner.execute(start, integers);
		}
		return start;
	}
}
