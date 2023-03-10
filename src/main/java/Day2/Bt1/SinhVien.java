package Day2.Bt1;

public class SinhVien {
    private String maSv;
    private String tenSv;
    private String ngaySinh;
    private String queQuan;
    public SinhVien(){

    }
    public SinhVien(String maSv){
        this.maSv = maSv;

    }

    public SinhVien(String maSv, String tenSv, String ngaySinh, String queQuan) {
        this.maSv = maSv;
        this.tenSv = tenSv;
        this.ngaySinh = ngaySinh;
        this.queQuan = queQuan;

    }

    public String getMaSv() {
        return maSv;
    }

    public void setMaSv(String maSv) {
        this.maSv = maSv;
    }

    public String getTenSv() {
        return tenSv;
    }

    public void setTenSv(String tenSv) {
        this.tenSv = tenSv;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    @Override
    public String toString() {
        return "SinhVien{" +
                "maSv='" + maSv + '\'' +
                ", tenSv='" + tenSv + '\'' +
                ", ngaySinh='" + ngaySinh + '\'' +
                ", queQuan='" + queQuan + '\'' +
                '}';
    }

    public boolean isThay = false;
    public boolean timKiemTheoId(String id) {
        if(maSv.equals(id)){
            isThay = true;
        }
        return isThay;
    }

}
