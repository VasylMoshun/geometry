package geometri.plane.shape;

import geometri.vertices.Vertices2D;

import java.util.ArrayList;
import java.util.List;

public class Triangle extends PlaneShape {
    public Triangle(Vertices2D a, Vertices2D b, Vertices2D c) {
        vertices = new ArrayList<Vertices2D>(List.of(a,b,c));
    }

    @Override
    public double getArea() {
        // S=sqrt(p-a)*(p-b)*(p-c)
        double hp = getPerimeter() / 2;  //halfPerimeter
        Vertices2D a = vertices.get(0);
        Vertices2D b = vertices.get(1);
        Vertices2D c = vertices.get(2);
        return Math.sqrt
                (hp *
                (hp  - a.distanceTo(b)) *
                (hp  - a.distanceTo(c)) *
                (hp  - b.distanceTo(c))
        );
    }

    @Override
    public double getPerimeter() {
        // dist(a,b) + dist(a,c) + dist(b,c)
        Vertices2D a =vertices.get(0);
        Vertices2D b =vertices.get(1);
        Vertices2D c =vertices.get(2);
        return a.distanceTo(b) + a.distanceTo(c) + b.distanceTo(c);
    }

    @Override
    public String toString() {
        return "Triangle[" +
                "vertices=" + vertices +
                ']';
    }
}
