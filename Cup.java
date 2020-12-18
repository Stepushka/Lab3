import static java.lang.Math.*;

public class Cup extends Dish {
    public Cup(String color,String material,String filled, String label, double radius, double h) {
        this.color = color;
        this.material = material;
        this.filled = filled;
        this.label = label;
        this.radius = radius;
        this.h = h;
    }
    public double getVolume() { return PI*radius*radius*h; }
    public String isFilled() { return this.filled; }
    public String toString() {
        return this.filled+", material: "+this.material+", color: "+this.color;
    }
}
