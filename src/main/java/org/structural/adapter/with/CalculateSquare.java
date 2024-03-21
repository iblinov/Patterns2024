package org.structural.adapter.with;

public class CalculateSquare implements Calculating {
	private Square adapt = new Square();
	
	public void calculate(int x){
		adapt.calculate(x);
	}
}
