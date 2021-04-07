package geometry;

import geometry.plane.shape.Circle;
import geometry.plane.shape.Rectangle;
import geometry.plane.shape.Triangle;
import geometry.plane.shape.Vertices2D;
import geometry.spase.shape.Cuboid;
import geometry.spase.shape.Sphere;
import geometry.spase.shape.SquarePyramid;
import geometry.spase.shape.Vertices3D;

public class Main {
    public static void main(String[] args) {
        Triangle tr1 = new Triangle(
                new Vertices2D(2, 4),
                new Vertices2D(3, 6),
                new Vertices2D(5, 7)
        );
        System.out.println("Triangle perimeter:" + " " + tr1.getPerimeter() + "\n"
                + "Triangle area:" + " " + tr1.getArea());

        Rectangle r1 = new Rectangle(
                new Vertices2D(4, 7), 7, 9);
        System.out.println("Rectangle perimeter:" + " " + r1.getPerimeter() + "\n"
                + "Rectangle area:" + " " + r1.getArea());

        Circle c1 = new Circle(
                new Vertices2D(2, 8), 5);
        System.out.println("circle perimeter:" + " " + r1.getPerimeter() + "\n"
                + "circle area:" + " " + r1.getArea());

        Cuboid cd1 = new Cuboid(
                new Vertices3D(1, 1, 1), 1, 8, 6);
        System.out.println("Cuboid area:" + " " + cd1.getArea() + "\n"
                + "SquarePyramid volume:" + " " + cd1.getVolume());


        SquarePyramid sqp1 = new SquarePyramid(
                new Vertices3D(1, 4, 8), 5, 8);
        System.out.println("SquarePyramid area:" + " " + sqp1.getArea() + "\n"
                + "SquarePyramid volume:" + " " + sqp1.getVolume());

        Sphere sh1 = new Sphere(
                new Vertices3D(1, 1, 1), 5);
        System.out.println("Sphere area:" + " " + sh1.getArea() + "\n"
                + "Sphere volume:" + " " + sh1.getVolume());


    }
}
