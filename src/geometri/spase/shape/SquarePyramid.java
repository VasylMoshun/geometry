package geometri.spase.shape;

import geometri.vertices.Vertices3D;

import java.util.ArrayList;
import java.util.List;

/**
 * holds 1 vertex (base center), base width, pyramid height
 */

public class SquarePyramid extends SpaceShape {
    private final double width, height;

    public SquarePyramid(Vertices3D a, double width, double height) {
        vertices = new ArrayList<Vertices3D>(List.of(a));
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        double apothem = Math.sqrt(Math.pow(height, 2) + Math.pow(width / 2, 2));
        return Math.pow(width, 2) + (2 * width * apothem);

    }

    @Override
    public double getVolume() {
        return (Math.pow(width, 2) * height) / 3;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }
}
