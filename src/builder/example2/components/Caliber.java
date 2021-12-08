package builder.example2.components;

public class Caliber {
    private final double length;
    private final double radius;

    public Caliber(double length, double radius) {
        this.length = length;
        this.radius = radius;
    }

    public String checkLargeness() {
        if (this.length < 9.0 && this.radius < 5.5) {
            return "This is a small-bore weapon";
        } else {
            return "This is a large-scale weapon";
        }
    }

    public double getLength() {
        return length;
    }

    public double getRadius() {
        return radius;
    }
}
