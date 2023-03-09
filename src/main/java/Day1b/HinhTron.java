package Day1b;

public class HinhTron implements IHinhHoc{
    private double radius =1.0;

    public HinhTron(double radius) {
        if (radius <= 0) {
            throw new RuntimeException("Error");
        }
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius <= 0) {
            throw new RuntimeException("Error");
        }
        this.radius = radius;
    }

    @Override
    public double tinhChuVi() {
        return radius*2*Math.PI;
    }

    @Override
    public double tinhDienTich() {
        return radius*radius*Math.PI;
    }

    @Override
    public String toString() {
        return "HinhTron{" +
                "radius=" + radius +
                '}';
    }
}
