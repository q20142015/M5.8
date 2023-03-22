public class Dimensions {
    final double length;
    final double width;
    final double height;

    Dimensions(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double volume() {
        return length * width * height;
    }
}
