package HomeworkNewProject;

import java.util.ArrayList;

public class Polygon {
    private ArrayList<Point> vertices;

    public Polygon(double[] xCoordinates, double[] yCoordinates) {
        vertices = new ArrayList<>();
        for (int i = 0; i < xCoordinates.length; i++) {
            vertices.add(new Point(xCoordinates[i], yCoordinates[i]));
        }
    }

    public Polygon(Point[] points) {
        vertices = new ArrayList<>();
        for (Point point : points) {
            vertices.add(new Point(point));
        }
    }

    public Polygon(Polygon other) {
        vertices = new ArrayList<>();
        for (Point vertex : other.vertices) {
            vertices.add(new Point(vertex));
        }
    }

    public Point getVertex(int index) {
        return vertices.get(index);
    }

    public void setVertex(int index, Point point) {
        vertices.set(index, new Point(point));
    }

    public double perimeter() {
        double perimeter = 0.0;
        for (int i = 0; i < vertices.size(); i++) {
            Point start = vertices.get(i);
            Point end = vertices.get((i + 1) % vertices.size());
            perimeter += Math.sqrt(Math.pow(end.getX() - start.getX(), 2) + Math.pow(end.getY() - start.getY(), 2));
        }
        return perimeter;
    }

    @Override
    public String toString() {
        return "Polygon with " + vertices.size() + " vertices";
    }

}