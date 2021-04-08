package geometry.spase.shape;

import geometry.vertices.Vertices3D;

import java.util.ArrayList;
import java.util.List;

/**
 * holds 1 vertex and radius
 */
public class Sphere extends SpaceShape {
    private final double radius;

    public Sphere(Vertices3D a, double radius) {
        vertices = new ArrayList<Vertices3D>(List.of(a));
        this.radius = radius;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public double getArea() {

        return 4 * Math.PI * Math.pow(radius, 2);
    }

    @Override
    public double getVolume() {

        return (4 * Math.PI * Math.pow(radius, 3)) / 3;
    }
}
