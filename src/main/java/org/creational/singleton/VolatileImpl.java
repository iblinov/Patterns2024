package org.creational.singleton;

public class VolatileImpl {
	private static VolatileImpl _instance = null;
	private volatile static boolean _instanceCreated = false;

	private VolatileImpl() {
	}

	public static VolatileImpl getInstance() {
		if (!_instanceCreated) {
			synchronized (VolatileImpl.class) {
				// ����� ������������ ����� ������ ��� ����������
				// �������� Lock ��� Semaphore
				try {
					if (!_instanceCreated) {
						_instance = new VolatileImpl();
						_instanceCreated = true;
					}
				} catch (Exception e) {
					// TODO: ��������� �������������� ��������
					// ��� �������������
				}
			}
		}
		return _instance;
	}
}
