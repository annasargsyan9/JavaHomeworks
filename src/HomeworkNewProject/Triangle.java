package HomeworkNewProject;

public class Triangle {


    private Point vertex1, vertex2, vertex3;

    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        this.vertex1 = new Point(x1, y1);
        this.vertex2 = new Point(x2, y2);
        this.vertex3 = new Point(x3, y3);
    }

    public Triangle(Point v1, Point v2, Point v3) {
        this.vertex1 = new Point(v1);
        this.vertex2 = new Point(v2);
        this.vertex3 = new Point(v3);
    }

    public Triangle(Triangle other) {
        this.vertex1 = new Point(other.vertex1);
        this.vertex2 = new Point(other.vertex2);
        this.vertex3 = new Point(other.vertex3);
    }

    public Point getVertex1() {
        return vertex1;
    }

    public void setVertex1(Point vertex1) {
        this.vertex1 = vertex1;
    }

    public Point getVertex2() {
        return vertex2;
    }

    public void setVertex2(Point vertex2) {
        this.vertex2 = vertex2;
    }

    public Point getVertex3() {
        return vertex3;
    }

    public void setVertex3(Point vertex3) {
        this.vertex3 = vertex3;
    }

    // Calculating side lengths
    private double sideLength(Point p1, Point p2) {
        return Math.sqrt(Math.pow(p2.getX() - p1.getX(), 2) + Math.pow(p2.getY() - p1.getY(), 2));
    }

    // Perimeter
    public double perimeter() {
        return sideLength(vertex1, vertex2) + sideLength(vertex2, vertex3) + sideLength(vertex3, vertex1);
    }

    // Area using Heron's formula
    public double area() {
        double a = sideLength(vertex1, vertex2);
        double b = sideLength(vertex2, vertex3);
        double c = sideLength(vertex3, vertex1);
        double s = perimeter() / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    // Center of mass
    public Point centerOfMass() {
        double centerX = (vertex1.getX() + vertex2.getX() + vertex3.getX()) / 3;
        double centerY = (vertex1.getY() + vertex2.getY() + vertex3.getY()) / 3;
        return new Point(centerX, centerY);
    }

    // Triangle type checks
    public boolean isEquilateral() {
        double a = sideLength(vertex1, vertex2);
        double b = sideLength(vertex2, vertex3);
        double c = sideLength(vertex3, vertex1);
        return a == b && b == c;
    }

    public boolean isIsosceles() {
        double a = sideLength(vertex1, vertex2);
        double b = sideLength(vertex2, vertex3);
        double c = sideLength(vertex3, vertex1);
        return a == b || b == c || a == c;
    }

    public boolean isScalene() {
        return !isIsosceles();
    }

    @Override
    public String toString() {
        return "Triangle[vertex1=" + vertex1 + ", vertex2=" + vertex2 + ", vertex3=" + vertex3 + "]";
    }
}
