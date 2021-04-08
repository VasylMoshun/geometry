package geometry.spase.shape;

import geometry.interfase.AreaMeasurable;
import geometry.interfase.PerimeterMeasurable;
import geometry.interfase.VolumeMeasurable;
import geometry.vertices.Vertices3D;

import java.util.List;

/**]
 * base class for all three-dimensional shapes, holds a list of 3D vertices (holding x, y and z),
 * implements AreaMeasurable and VolumeMeasurable interfaces
 */

public abstract class SpaceShape implements AreaMeasurable, PerimeterMeasurable, VolumeMeasurable {
    protected List<Vertices3D> vertices;

        }



