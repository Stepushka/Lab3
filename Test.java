public class Test {
    public static void main(String[] args) {
        Plate Plate1 = new Plate("Yellow", "Ceramic", "Plate filled with soap", "Circle", 3);
        Cup Cup1 = new Cup("White", "Porcelain", "Cup is half filled", "Jacobs", 3, 10);
        System.out.println(Plate1);
        System.out.println(Cup1);
        System.out.println(Plate1.isFilled());
        System.out.println(Cup1.isFilled());
        if (Plate1.shape.equals("Circle")) {
            System.out.print("Plate area = ");
            System.out.println( Plate1.getArea());
        }
        System.out.print("Cup volume = ");
        System.out.println(Cup1.getVolume());
    }
}
