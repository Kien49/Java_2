package Day2.b.bt;

public class HinhCau implements IHinhHoc3D{
    private double banKinh =1.0;

    public HinhCau(){

    }
    public HinhCau(double banKinh) {
        if (banKinh <= 0) {
            throw new RuntimeException("Error");
        }
        this.banKinh = banKinh;
    }

    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        if (banKinh <= 0) {
            throw new RuntimeException("Error");
        }
        this.banKinh = banKinh;
    }

    @Override
    public String toString() {
        return "HinhCau{" +
                "banKinh=" + banKinh +
                '}';
    }

    @Override
    public double tinhTheTich() {
        return (4/3)*banKinh*banKinh*banKinh*Math.PI;
    }



}
