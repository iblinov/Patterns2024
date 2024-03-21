package org.creational.singleton;

import java.util.ArrayList;
import java.util.List;

public class SimpleImpl {
	private static SimpleImpl instance = null;
	private List<String> data;
	
	private SimpleImpl() { }
	
	public static SimpleImpl getInstance(){
		if (instance == null){
			System.out.println("Creating Singleton");
			instance = new SimpleImpl();
			instance.data = new ArrayList<>();
		}
		return instance;
	}

	public String get(int index) {
		return data.get(index);
	}

	public String set(int index, String element) {
		return data.set(index, element);
	}

	public void add(int index, String element) {
		data.add(index, element);
	}
}
