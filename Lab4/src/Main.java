//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        Circle circle = new Circle(5, 0, 0);
        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Circle Circumference: " + circle.calculateCircumference());

        Rectangle rectangle = new Rectangle(4, 6, 0, 0);
        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        System.out.println("Rectangle Circumference: " + rectangle.calculateCircumference());

        Triangle triangle = new Triangle(3, 4, 0, 0);
        System.out.println("Triangle Area: " + triangle.calculateArea());
        System.out.println("Triangle Circumference: " + triangle.calculateCircumference());
    }

    }
