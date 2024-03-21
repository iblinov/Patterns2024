package org.structural.adapter.with;

public class CalculateCube implements Calculating {
	private Cube adapt = new Cube();
	
	public void calculate(int x){
		adapt.calculate(x);
	}
}
