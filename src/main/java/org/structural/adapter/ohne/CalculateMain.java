package org.structural.adapter.ohne;

public class CalculateMain {
    public static void main(String[] args) {
        Object[] shapes = {
            new Square(), new Cube()
        };
        
        int x1 = 13;
        int x2 = 5;
 
        for (Object obj : shapes) {
            if (obj instanceof Square) {
                ((Square)obj).calculate(x1);
                ((Square)obj).calculate(x2);
            } else if (obj instanceof Cube) {
                ((Cube)obj).calculate(x1);
                ((Cube)obj).calculate(x2);
            }
        }
    }
}
