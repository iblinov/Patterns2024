package org.creational.singleton;

public class LazyInitImpl {
	private LazyInitImpl() {}

	private static class SingletonHolder {
		private static LazyInitImpl instance = new LazyInitImpl();
	}
	
	public static LazyInitImpl getInstance(){
		return SingletonHolder.instance;
	}
}
