package Day2.Bt1;

public class Diem extends SinhVien {
    private String maSv;
    private String maMonHoc;
    private int diemSo;

    public Diem(String maSv, String maMonHoc, int diemSo) {
        super(maSv);
        this.maMonHoc = maMonHoc;
        this.diemSo = diemSo;
    }

    public Diem(String maSv, String tenSv, String ngaySinh, String queQuan, String maSv1, String maMonHoc, int diemSo) {
        super(maSv, tenSv, ngaySinh, queQuan);
        this.maSv = maSv1;
        this.maMonHoc = maMonHoc;
        this.diemSo = diemSo;
    }

    @Override
    public String toString() {
        return "[ " + super.toString()+
                " ], " +
                "[ MaMonHoc: " + maMonHoc+
                ", [ DiemSo: " + diemSo+
                " ]" ;
    }


}
