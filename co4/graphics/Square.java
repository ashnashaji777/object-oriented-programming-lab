package graphics;


public class Square implements Shape {
    private double side;
    
    public Square(double side) {
        this.side = side;
    }
    
    public double getSide() {
        return side;
    }
    
    public double getArea() {
        return side * side;
    }
}

