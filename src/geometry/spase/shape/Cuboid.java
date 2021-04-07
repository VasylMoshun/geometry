package geometry.spase.shape;

import java.util.ArrayList;

/**
 * holds 1 vertex, width, height, depth
 */
public class Cuboid extends SpaceShape{
    private final double width, height, depth;

    public Cuboid(Vertices3D a, double width, double height, double depth) {
        vertices = new ArrayList<>();
        vertices.add(a);
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    @Override
    public double getArea() {
        return 2 * (width * height + width * depth + height * depth);
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public double getVolume() {
        return width * height * depth;
    }
}
