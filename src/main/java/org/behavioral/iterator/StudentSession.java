package org.behavioral.iterator;

import java.util.HashMap;

public class StudentSession implements Aggregate {

	private HashMap<String, Integer> exams = new HashMap<>();

	public CustomIterator createIterator() {
		CustomIterator iterator = new ExamsIterator(this);
		iterator.first();
		return iterator;
	}

	public void put(String name, Integer mark) {
		exams.put(name, mark);
	}

	public Integer get(String key) {
		return exams.get(key);
	}

	public HashMap<String, Integer> getExams() {
		return exams;
	}

}
