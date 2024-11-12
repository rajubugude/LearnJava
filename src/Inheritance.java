public class Inheritance {
    public static void main(String[] args) {
    Shape s = new Shape();
    s.area();
    Triangle t = new Triangle();
    t.area(2,4);

    Circle c = new Circle();
    c.area(5);
    }
}
// HERE COME RUN TIME polymorphism - method over-riding
class Shape {
    public void area() {
        System.out.println("Displays Area of Shape");
    }
}
//single level inheritance(a->b)
class Triangle extends Shape {
    public void area(int h, int b) {
        System.out.println((1/2)*b*h);
    }
}
//Hierarchical Inheritance - a->b->c (i.e more than one level same parent class gets inherited)
class Circle extends Shape {
    public void area(int r) {
        System.out.println((3.14)*r*r);
    }
}
//Multilevel Inheritance - shape-> triangle, triangle-> equilateral triangle
class EquilateralTriangle extends Triangle {
    int side;
}



