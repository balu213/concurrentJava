package com.bala.interviews.practice.patterns;

/**
 * This is Factory Pattern
 * 
 * @author bala
 *
 */
public class ShapeFactory {
    public Shape getShape(String shape) {
        if (shape == null) {
            return null;
        } else if (shape.equalsIgnoreCase("RECTANGLE")) {
            new Rectangle();
        } else if (shape.equalsIgnoreCase("SQUARE")) {
            new Square();
        } else if (shape.equalsIgnoreCase("TRIANGLE")) {
            new Triangle();
        } else
            return null;
        return null;
    }
}

class Rectangle implements Shape {

    @Override
    public void draw() {
        // TODO Auto-generated method stub
        System.out.println("Inside Rectangle::draw() method.");
    }

}

class Square implements Shape {

    @Override
    public void draw() {
        // TODO Auto-generated method stub
        System.out.println("Inside Square::draw() method.");
    }

}

class Triangle implements Shape {

    @Override
    public void draw() {
        // TODO Auto-generated method stub
        System.out.println("Inside Triangle::draw() method.");
    }

}
