package entities;

public class Rectangle {
    public double Width;
    public double Height;

    public double area() {
        return Width * Height;
    }

    public double perimeter() {
        return (Width + Height) * 2;
    }

    public double diagonal() {
        return Math.sqrt(Math.pow(Width, 2) + Math.pow(Height, 2));
    }

    public String toString() {
        return String.format("AREA = %.2f%n" +
                "PERIMETER = %.2f%n" +
                "DIAGONAL = %.2f", area(), perimeter(), diagonal());

    }
}
