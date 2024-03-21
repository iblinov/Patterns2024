package org.creational.singleton;

public class SingletonException extends Exception {
	/**
	 * ���������� ����������� ��� ������ � Singleton
	 */
	private static final long serialVersionUID = 7895580821060835746L;
	public SingletonException() {	}
	public SingletonException(String error) {
			super(error);
		}
}
