package org.behavioral.iterator;

public class IteratorExampleMain {

	public static void main(String[] args) {
		StudentSession session = new StudentSession();
		session.put("MA", 9);
		session.put("TFCV", 10);
		session.put("DS", 8);
		System.out.println("The list of exams:");
		CustomIterator iterator = session.createIterator();
		while (!iterator.isDone()) {
			System.out.println(iterator.currentItem());
			iterator.next();
		}
	}

}
