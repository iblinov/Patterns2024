package edu.pattern.shapes.creator.impl;

import edu.pattern.shapes.creator.TriangleFactory;
import edu.pattern.shapes.exception.TriangleException;
import edu.pattern.shapes.model.Triangle;
import edu.pattern.shapes.model.TriangleState;

import java.util.ArrayList;
import java.util.List;

public class TriangleFactoryImpl implements TriangleFactory {
    @Override
    public List<Triangle> createTriangles(int[][] sides) throws TriangleException {
        if(sides.length < 1 || sides[0].length < 1) {
            throw new TriangleException("Wrong array size");
        }
        List<Triangle> newTriangles = new ArrayList<>();
        for (int[] current : sides) {
            Triangle triangle = new Triangle(current[0], current[1],current[2]);
            TriangleState currentState = TriangleState.detect(triangle);
         //   triangle.setState(currentState);
            newTriangles.add(triangle);
        }
        return newTriangles;
    }
}
