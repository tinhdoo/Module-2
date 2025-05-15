package ss6_inherit.BaiTap;

public class MainCircle extends Circle {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(5.5);
        Cylinder cylinder = new Cylinder(3);
        circle.setColor("blue");
        System.out.println(cylinder.getVolume());

    }
}
