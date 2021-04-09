package geometri.plane.shape;

import geometri.interfase.AreaMeasurable;
import geometri.interfase.PerimeterMeasurable;
import geometri.vertices.Vertices2D;

import java.util.List;

/**
 * base class for all plane (2D) shapes, holds a list of 2D vertices (holding x and y),
 * implements PerimeterMeasurable and AreaMeasurable interfaces
 */

public abstract class PlaneShape implements PerimeterMeasurable, AreaMeasurable {
    protected List<Vertices2D> vertices;


}
