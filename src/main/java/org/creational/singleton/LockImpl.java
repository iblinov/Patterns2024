package org.creational.singleton;

import java.util.concurrent.locks.ReentrantLock;

public class LockImpl {
	private static LockImpl _instance = null;
	private static ReentrantLock _lock = new ReentrantLock();

	private LockImpl() {
	}

	public static LockImpl getInstance() {
		_lock.lock();
		try {
			if (_instance == null) {
				_instance = new LockImpl();
			}
		} 
		finally {
			_lock.unlock();
		}
		return _instance;
	}
}
