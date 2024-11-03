package HomeworkNewProject;

public class Line {private Point start;
    private Point end;

    public Line(double x1, double y1, double x2, double y2) {
        this.start = new Point(x1, y1);
        this.end = new Point(x2, y2);
    }

    public Line(Point start, Point end) {
        this.start = new Point(start);
        this.end = new Point(end);
    }

    public Line(Line other) {
        this.start = new Point(other.start);
        this.end = new Point(other.end);
    }

    public Point getStart() {
        return start;
    }

    public Point getEnd() {
        return end;
    }

    public void setStart(Point start) {
        this.start = new Point(start);
    }

    public void setEnd(Point end) {
        this.end = new Point(end);
    }

    public double[][] getCoordinates() {
        return new double[][]{start.getCoordinates(), end.getCoordinates()};
    }

    public void setCoordinates(double x1, double y1, double x2, double y2) {
        this.start.setCoordinates(x1, y1);
        this.end.setCoordinates(x2, y2);
    }

    public double length() {
        double dx = end.getX() - start.getX();
        double dy = end.getY() - start.getY();
        return Math.sqrt(dx * dx + dy * dy);
    }

    public Point midpoint() {
        double midX = (start.getX() + end.getX()) / 2;
        double midY = (start.getY() + end.getY()) / 2;
        return new Point(midX, midY);
    }


    @Override
    public String toString() {
        return "Line[start=" + start + ", end=" + end + "]";
    }
}
