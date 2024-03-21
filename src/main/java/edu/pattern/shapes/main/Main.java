package edu.pattern.shapes.main;

import edu.pattern.shapes.creator.TriangleFactory;
import edu.pattern.shapes.creator.impl.TriangleFactoryImpl;
import edu.pattern.shapes.exception.TriangleException;
import edu.pattern.shapes.model.Triangle;
import edu.pattern.shapes.model.Warehouse;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[][] params = {
                {4, 5, 6},
                {1, 1, 7},
                {8, 9, 9},
                {7, 5, 4},
        };
        TriangleFactory factory = new TriangleFactoryImpl();
        List<Triangle> result = null;
        try {
            result = factory.createTriangles(params);
        } catch (TriangleException e) {
            //log
        }
        System.out.println(result);
        Warehouse warehouse = Warehouse.getInstance();
        Triangle ob = result.get(0);
        ob.setA(5);
        System.out.println(warehouse);
        ob.setC(8);
        System.out.println(warehouse);
    }
}