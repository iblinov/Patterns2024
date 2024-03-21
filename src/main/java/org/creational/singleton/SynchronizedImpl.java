package org.creational.singleton;

public class SynchronizedImpl {
	private static SynchronizedImpl _instance = null;
	
	private SynchronizedImpl() {}
	
	public static synchronized SynchronizedImpl getInstance(){
		if (_instance == null) {
			_instance = new SynchronizedImpl();
		}
		return _instance;
	}
}
