package org.creational.singleton;

import java.util.ArrayList;
import java.util.List;

public class EagerInitImpl {
	public static EagerInitImpl instance = new EagerInitImpl();
	private List<String> data = new ArrayList<>();
	private EagerInitImpl() { }
	
	public static EagerInitImpl getInstance(){
		return instance;
	}

	public List<String> getData() {
		return data.stream().toList();
	}
}
