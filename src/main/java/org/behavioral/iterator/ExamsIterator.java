package org.behavioral.iterator;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ExamsIterator implements CustomIterator {

	private StudentSession session;

	private String current;

	private Iterator<String> iterator;

	private boolean done;

	public ExamsIterator(StudentSession session) {
		this.session = session;
	}

	public String currentItem() {
		return current;
	}

	public void first() {
		iterator = session.getExams().keySet().iterator();
		next();
	}

	public boolean isDone() {
		return done;
	}

	public void next() {
		try {
			current = iterator.next();
		} catch (NoSuchElementException e) {
			done = true;
		}
	}
}
