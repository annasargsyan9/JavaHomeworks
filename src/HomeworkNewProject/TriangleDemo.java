package HomeworkNewProject;

public class TriangleDemo {
    public static void main(String[] args) {
        Triangle triangle1 = new Triangle(0, 0, 3, 0, 3, 4);
        System.out.println("Triangle1 Perimeter: " + triangle1.perimeter());
        System.out.println("Triangle1 Area: " + triangle1.area());
        System.out.println("Triangle1 Center of Mass: " + triangle1.centerOfMass());
        System.out.println("Triangle1 is Equilateral: " + triangle1.isEquilateral());
        System.out.println("Triangle1 is Isosceles: " + triangle1.isIsosceles());
        System.out.println("Triangle1 is Scalene: " + triangle1.isScalene());
        System.out.println(triangle1);
    }
}

