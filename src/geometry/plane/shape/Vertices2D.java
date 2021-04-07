package geometry.plane.shape;

public class Vertices2D {
    double x ;
    double y ;

    public Vertices2D(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public  double distanceTo(Vertices2D other){
        return  Math.sqrt(
                (this.x - other.x) * (this.x - other.x)+
                (this.y - other.y) * (this.y-other.y));

    }

    @Override
    public String toString() {
        return "Vertices2D[" +
                "x=" + x +
                ", y=" + y +
                ']';
    }
}
