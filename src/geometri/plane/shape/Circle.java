package geometri.plane.shape;

import geometri.vertices.Vertices2D;

import java.util.ArrayList;
import java.util.List;

/**
 * holds 1 vertex and radius
 */

public class Circle extends PlaneShape {
    private final double radius;

    public Circle(Vertices2D a, double radius) {
        vertices = new ArrayList<>(List.of(a));
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return Math.PI * radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * Math.pow(radius, 2);

    }
}
