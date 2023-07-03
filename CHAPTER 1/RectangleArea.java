public class RectangleArea {
    public static void main(String[] args) {
        double length = 7.9;
        double width = 4.5;

        double area = calculateArea(length, width);

        System.out.println("The area of the rectangle is: " + area);
    }

    public static double calculateArea(double length, double width) {
        return length * width;
    }
}
