package com.erik.learn.functional;

import java.util.List;
import java.util.function.Function;

class Everything {

	static boolean every(List<Integer> list, Function<Integer, Boolean> function) {

		for (int i : list) {
			if (!function.apply(i)) {
				return false;
			}
		}
		return true;
	}
}
