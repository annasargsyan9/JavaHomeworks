package HomeworkNewProject;

public class PolygonDemo {
    public static void main(String[] args) {
        double[] xCoords = {0, 4, 4, 0};
        double[] yCoords = {0, 0, 3, 3};
        Polygon polygon1 = new Polygon(xCoords, yCoords);
        System.out.println("Polygon1 Perimeter: " + polygon1.perimeter());
        System.out.println(polygon1);

        Point[] points = {new Point(1, 1), new Point(5, 1), new Point(5, 4), new Point(1, 4)};
        Polygon polygon2 = new Polygon(points);
        System.out.println("Polygon2 Perimeter: " + polygon2.perimeter());
        System.out.println(polygon2);
    }
}
