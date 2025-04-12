package week4;

import java.util.Scanner;

// Base class
abstract class ThreeDObject {
    abstract double wholeSurfaceArea();
    abstract double volume();
}

// Derived class: Box
class Box extends ThreeDObject {
    double length, breadth, height;

    Box(double l, double b, double h) {
        length = l;
        breadth = b;
        height = h;
    }

    @Override
    double wholeSurfaceArea() {
        return 2 * (length * breadth + breadth * height + height * length);
    }

    @Override
    double volume() {
        return length * breadth * height;
    }
}

// Derived class: Cube
class Cube extends ThreeDObject {
    double side;

    Cube(double s) {
        side = s;
    }

    @Override
    double wholeSurfaceArea() {
        return 6 * side * side;
    }

    @Override
    double volume() {
        return side * side * side;
    }
}

// Derived class: Cylinder
class Cylinder extends ThreeDObject {
    double radius, height;

    Cylinder(double r, double h) {
        radius = r;
        height = h;
    }

    @Override
    double wholeSurfaceArea() {
        return 2 * Math.PI * radius * (radius + height);
    }

    @Override
    double volume() {
        return Math.PI * radius * radius * height;
    }
}

// Derived class: Cone
class Cone extends ThreeDObject {
    double radius, height;

    Cone(double r, double h) {
        radius = r;
        height = h;
    }

    @Override
    double wholeSurfaceArea() {
        double slantHeight = Math.sqrt(radius * radius + height * height);
        return Math.PI * radius * (radius + slantHeight);
    }

    @Override
    double volume() {
        return (1.0 / 3) * Math.PI * radius * radius * height;
    }
}

// Main class
public class ThreeDObjectTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Box
        System.out.print("Enter length, breadth, and height of Box: ");
        double l = sc.nextDouble(), b = sc.nextDouble(), h = sc.nextDouble();
        Box box = new Box(l, b, h);
        System.out.println("Box Surface Area: " + box.wholeSurfaceArea());
        System.out.println("Box Volume: " + box.volume());

        // Cube
        System.out.print("\nEnter side of Cube: ");
        double s = sc.nextDouble();
        Cube cube = new Cube(s);
        System.out.println("Cube Surface Area: " + cube.wholeSurfaceArea());
        System.out.println("Cube Volume: " + cube.volume());

        // Cylinder
        System.out.print("\nEnter radius and height of Cylinder: ");
        double r1 = sc.nextDouble(), h1 = sc.nextDouble();
        Cylinder cyl = new Cylinder(r1, h1);
        System.out.println("Cylinder Surface Area: " + cyl.wholeSurfaceArea());
        System.out.println("Cylinder Volume: " + cyl.volume());

        // Cone
        System.out.print("\nEnter radius and height of Cone: ");
        double r2 = sc.nextDouble(), h2 = sc.nextDouble();
        Cone cone = new Cone(r2, h2);
        System.out.println("Cone Surface Area: " + cone.wholeSurfaceArea());
        System.out.println("Cone Volume: " + cone.volume());

        sc.close();
    }
}
