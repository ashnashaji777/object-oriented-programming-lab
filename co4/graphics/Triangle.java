package graphics;

public class Triangle implements Shape {
    private double base;
    private double height1;
    
    public Triangle(double base, double height) {
        this.base = base;
        this.height1 = height;
    }
    
    public double getBase() {
        return base;
    }
    
    public double getHeight() {
        return height1;
    }
    
    public double getArea() {
        return 0.5 * base * height1;
    }
}

