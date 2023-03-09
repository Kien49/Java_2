package Day1b.Bai2;

public class SoPhuc {
    private int phanThuc =1;
    private int phanAo =1;

    public SoPhuc(){}

    public SoPhuc(int phanThuc, int phanAo) {
        this.phanThuc = phanThuc;
        this.phanAo = phanAo;
    }

    public int getPhanThuc() {
        return phanThuc;
    }

    public void setPhanThuc(int phanThuc) {
        this.phanThuc = phanThuc;
    }

    public int getPhanAo() {
        return phanAo;
    }

    public void setPhanAo(int phanAo) {
        this.phanAo = phanAo;
    }

    @Override
    public String toString() {
        return String.format("z = %d + %di", phanThuc, phanAo);
    }

    public SoPhuc cong(SoPhuc s){
        int phanThuc = this.phanThuc + s.phanThuc;
        int phanAo = this.phanAo + s.phanAo;
        return new SoPhuc(phanThuc, phanAo);
    }
    public SoPhuc tru(SoPhuc s){
        int phanThuc = this.phanThuc - s.phanThuc;
        int phanAo = this.phanAo - s.phanAo;
        return new SoPhuc(phanThuc, phanAo);
    }
    public SoPhuc nhan(SoPhuc s){
        //aa′−bb′+(ab′+a′b)i

        int phanThuc = this.phanThuc * s.phanThuc - this.phanAo * s.phanAo;
        int phanAo = this.phanThuc * s.phanAo + this.phanAo * s.phanThuc;
        return new SoPhuc(phanThuc, phanAo);
    }
    public SoPhuc chia(SoPhuc s){
        int phanThuc = this.phanThuc * s.phanThuc + this.phanAo * s.phanThuc - this.phanThuc * s.phanAo ;
        int phanAo = s.phanThuc * s.phanThuc + s.phanAo * s.phanAo;
        return new SoPhuc(phanThuc, phanAo);
    }

}
