package bt;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        circle.getRadius();
        circle.getArena(circle.getRadius());
        System.out.println(circle.getRadius());
        System.out.println(circle.getArena(circle.getRadius()));
    }

}
