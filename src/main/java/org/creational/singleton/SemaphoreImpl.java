package org.creational.singleton;

import java.util.ArrayList;
import java.util.concurrent.Semaphore;

public class SemaphoreImpl {
	private static final int MAX_AVAILABLE = 10; // ����� ����������� ������
	private static Semaphore _semaphore= new Semaphore(MAX_AVAILABLE, true); // 
	private static ArrayList<SemaphoreImpl> _instances = new ArrayList<SemaphoreImpl>(MAX_AVAILABLE);
	
	private SemaphoreImpl() {}
	
	public static SemaphoreImpl getInstance(int index) throws SingletonException{
		if (index >= 0 && index < _instances.size()){
			return _instances.get(index);
		}
		if (_semaphore.tryAcquire()) {
			SemaphoreImpl tmp = new SemaphoreImpl();
			_instances.add(tmp);
			return tmp;
		}
		throw new SingletonException("�������� ����� �� ���������� ����������� ������ SemaphoreImpl");
	}
}
