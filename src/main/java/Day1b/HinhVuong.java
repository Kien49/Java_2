package Day1b;

public class HinhVuong implements IHinhHoc{

    private double canh =1.0;

    public HinhVuong(double canh) {
        if (canh <= 0) {
            throw new RuntimeException("Error");
        }
        this.canh = canh;
    }

    public double getCanh() {
        return canh;
    }

    public void setCanh(double canh) {
        this.canh = canh;
    }

    @Override
    public double tinhChuVi() {
        return canh*4;
    }

    @Override
    public double tinhDienTich() {
        return canh*canh;
    }

    @Override
    public String toString() {
        return "HinhVuong{" +
                "canh=" + canh +
                '}';
    }
}
