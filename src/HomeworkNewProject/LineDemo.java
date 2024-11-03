package HomeworkNewProject;

public class LineDemo { public static void main(String[] args) {
    Line line1 = new Line(0, 0, 3, 4);
    System.out.println("Line1: " + line1);
    System.out.println("Length of Line1: " + line1.length());
    System.out.println("Midpoint of Line1: " + line1.midpoint());

    Point p1 = new Point(1, 1);
    Point p2 = new Point(4, 5);
    Line line2 = new Line(p1, p2);
    System.out.println("\nLine2: " + line2);
    System.out.println("Length of Line2: " + line2.length());
    System.out.println("Midpoint of Line2: " + line2.midpoint());

    Line line3 = new Line(line1);
    System.out.println("\nLine3 (Copy of Line1): " + line3);

    line1.setStart(line2.midpoint());
    System.out.println("\nModified Line1 with new start at midpoint of Line2: " + line1);
    System.out.println("New Length of Line1: " + line1.length());
    System.out.println("New Midpoint of Line1: " + line1.midpoint());

    System.out.println("\nFinal Lines:");
    System.out.println("Line1: " + line1);
    System.out.println("Line2: " + line2);
    System.out.println("Line3: " + line3);
}
}
