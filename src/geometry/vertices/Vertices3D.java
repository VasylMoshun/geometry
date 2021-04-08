package geometry.vertices;

public class Vertices3D extends Vertices2D {
    double z;

    public Vertices3D(double x, double y, double z) {
        super(x, y);
        this.z = z;
    }

    @Override
    public String toString() {
        return "Vertices3D[" +
                "z=" + z +
                ']';
    }
}

