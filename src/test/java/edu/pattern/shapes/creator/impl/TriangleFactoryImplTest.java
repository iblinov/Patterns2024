package edu.pattern.shapes.creator.impl;

import edu.pattern.shapes.creator.TriangleFactory;
import edu.pattern.shapes.exception.TriangleException;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class TriangleFactoryImplTest {
    @BeforeClass
    public void setUp() {

    }

    @Test(description = "", expectedExceptions = TriangleException.class)
    public void testCreateTrianglesException() throws TriangleException {
        TriangleFactory factory = new TriangleFactoryImpl();
        int arr[][] = {{1}};
        factory.createTriangles(arr);
    }
}