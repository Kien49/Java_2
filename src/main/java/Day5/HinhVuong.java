package Day5;

public class HinhVuong {
    private double canh =1.0;

    public HinhVuong(){

    }
    public HinhVuong(double canh) {
        if (canh <= 0) {
            throw new RuntimeException("Cạnh phải là số dương");
        }
        this.canh = canh;
    }

    @Override
    public String toString() {
        return "HinhVuong{" +
                "canh=" + canh +
                '}';
    }

    public double getCanh() {
        return canh;
    }

    public void setCanh(double canh) {
        if (canh <= 0) {
            throw new RuntimeException("Cạnh phải là số dương");
        }
        this.canh = canh;
    }
    public double chuVi() {
        return canh*4;
    }

    public double dienTich() {
        return canh*canh;
    }
}
