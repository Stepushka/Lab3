public class Plate extends Dish {

    public Plate(String color,String material,String filled, String shape, double radius) {
        this.color = color;
        this.material = material;
        this.filled = filled;
        this.shape = shape;
        this.radius = radius;
    }
    public double getArea() { return Math.PI*radius*radius; }
    public String isFilled() { return this.filled; }
    public String toString() {
        return this.filled+", material: "+this.material+", color: "+this.color+", shape: "+this.shape;
    }
}
