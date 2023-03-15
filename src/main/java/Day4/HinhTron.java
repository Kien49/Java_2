package Day4;

public class HinhTron {
    private double radius =1.0;
    private double PI =3.1415;

    public HinhTron(){

    }
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

    public double tinhChuVi() {
        return radius*2*PI;
    }

    public double tinhDienTich() {
        return radius*radius*PI;
    }

/*    @Override
    public String toString() {
        return "HinhTron{" +
                "radius=" + radius +
                '}';
    }*/

}
