import java.awt.geom.Point2D;
import java.util.Iterator;

/**
 * An interface for a collection of points in two dimensions that can
 * be searched by coordinates.
 * 
 * @author Jim Teresco
 * @version Spring 2022
 */

public interface PointSet2D<E extends Point2D.Double> extends Iterable<E> {

   /**
    * Add a new object to the collection.
    * 
    * @param point the new object to be added
    */
   public void add(E point);

   /**
    * Get the object at the same coordinates at the given point.  If multiple
    * objects with the same coordinates have been added to the structure,
    * one of them will be returned, but there is no guarantee made about
    * which one.
    * 
    * @param point a point with the coordinates being sought
    * @return an object at the same coordinates as point, null if no
    *         such object is in the collection
    */
   public E get(Point2D.Double point);

   /**
    * Remove an object at the same coordinates at the given point.  If multiple
    * objects with the same coordinates have been added to the structure,
    * one of them will be removed and returned, but there is no guarantee made about
    * which one.
    * 
    * @param point a point with the coordinates at which an item to be removed
    *              is located
    * @return an the object removed, null if no object at the coordinates
    *         of point is in the collection
    */
   public E remove(Point2D.Double point);

   /**
    * Return the number of points in the collection.
    * 
    * @return the number of points in the collection
    */
   public int size();
}
