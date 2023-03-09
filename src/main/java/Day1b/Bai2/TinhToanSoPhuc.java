package Day1b.Bai2;

public class TinhToanSoPhuc implements ITinhToan<SoPhuc>{
    @Override
    public SoPhuc cong(SoPhuc... args) {
        SoPhuc s = new SoPhuc();
        for (SoPhuc p: args) {
            s = s.cong(p);
        }
        return s;
    }

    @Override
    public SoPhuc tru(SoPhuc t1, SoPhuc t2) {
        SoPhuc s = t1.tru(t2);
        return s;
    }

    @Override
    public SoPhuc nhan(SoPhuc... args) {
        SoPhuc s = new SoPhuc();
        for (SoPhuc p: args) {
            s = s.nhan(p);
        }
        return s;
    }

    @Override
    public SoPhuc chia(SoPhuc t1, SoPhuc t2) {
        SoPhuc s = t1.chia(t2);
        return s;
    }
}
