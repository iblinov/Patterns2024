package edu.pattern.shapes.service.impl;

import edu.pattern.shapes.model.Triangle;
import edu.pattern.shapes.service.TriangleService;

public class TriangleServiceImpl implements TriangleService {
    @Override
    public double perimeter(Triangle triangle) {
        return triangle.getA() + triangle.getC() + triangle.getB();
    }
}
