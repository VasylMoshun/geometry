package geometry.plane.shape;

import geometry.vertices.Vertices2D;

import java.util.ArrayList;
import java.util.List;

/**
 * holds 1 vertex, width, height
 */
public class Rectangle extends PlaneShape {
    private final double width, height;

    public Rectangle(Vertices2D a, double width, double height) {
        vertices = new ArrayList<Vertices2D>(List.of(a));
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        // width * height
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return (width + height) * 2;
    }
}
