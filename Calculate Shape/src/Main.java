
import common.Library;
import model.Circle;
import model.Rectangle;
import model.Triangle;

public class Main {

    Library va  = new Library();

    public Triangle inputTriangle() {
        while (true) {
            System.out.print("Please input side A of Triangle: ");
            double sideA = va.checkInputDouble();
            System.out.print("Please input side B of Triangle: ");
            double sideB = va.checkInputDouble();
            System.out.print("Please input side C of Triangle: ");
            double sideC = va.checkInputDouble();
            if (sideA + sideB > sideC && sideB + sideC > sideA && sideA + sideC > sideB) {
                return new Triangle(sideA, sideB, sideC);
            } else {
                System.out.println("Re-input");
            }
        }
    }

    public Rectangle inputRectangle() {
        System.out.print("Please input side width of Rectangle: ");
        double width = va.checkInputDouble();
        System.out.print("Please input length of Rectangle: ");
        double length = va.checkInputDouble();
        return new Rectangle(width, length);
    }

    public Circle inputCircle() {
        System.out.print("Please input radius of Circle: ");
        double radius = va.checkInputDouble();
        return new Circle(radius);
    }

    public void display(Rectangle rectangle, Circle circle,Triangle trigle) {
        rectangle.printResult();
        circle.printResult();
        trigle.printResult();
    }

    public static void main(String[] args) {
        Main a = new Main();
        a.display(a.inputRectangle(), a.inputCircle(), a.inputTriangle());
    }
}
