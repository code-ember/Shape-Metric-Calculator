public class Main {
    public static void main(String[] args) {
        // Create a Rectangle object with specified length and width
        Rectangle rectangle = new Rectangle(5.0, 3.0);

        // Create a Circle object with specified radius
        Circle circle = new Circle(2.5);

        // Calculate the area of the rectangle and store the result in a variable
        double areaOfRectangle = ShapeMetricCalculator.calculateRectangleArea(rectangle);

        // Calculate the area of the circle and store the result in a variable
        double areaOfCircle = ShapeMetricCalculator.calculateCircleArea(circle);

        // Print the results
        System.out.println("Area if Rectangle: " + areaOfRectangle);
        System.out.println("Area if Circle: " + areaOfCircle);
    }
}