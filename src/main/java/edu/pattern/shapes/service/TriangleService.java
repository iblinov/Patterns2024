package edu.pattern.shapes.service;

import edu.pattern.shapes.model.Triangle;

public class TriangleService {
    public double perimeter(Triangle triangle) {

        return triangle.getA()+ triangle.getC()+triangle.getB();//todo
    }
}
