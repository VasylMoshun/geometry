package geometry.spase.shape;

import java.util.ArrayList;

/**
 * holds 1 vertex and radius
 */
public class Sphere extends SpaceShape{
    private final double radius;

    public Sphere(Vertices3D a,double radius) {
        vertices = new ArrayList<>();
        vertices.add(a);
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
