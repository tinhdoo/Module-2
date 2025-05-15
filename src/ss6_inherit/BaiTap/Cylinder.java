package ss6_inherit.BaiTap;

public class Cylinder extends Circle {
    private double height;

    public double getHeight() {
        return height;
    }
    public Cylinder(double height)
    {
        this.height=height;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getRadius() {
        return super.getRadius();
    }

    public double getVolume(){
        return radius * radius;
    }

}
