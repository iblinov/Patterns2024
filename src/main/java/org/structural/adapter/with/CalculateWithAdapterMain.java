package org.structural.adapter.with;

public class CalculateWithAdapterMain {
    public static void main(String[] args) {
        Calculating[] m = { new CalculateSquare(), new CalculateCube() };
        
        int x1 = 13;
        int x2 = 5;
        for (Calculating method : m){
        	method.calculate(x1);
        	method.calculate(x2);
        }
    }
}
