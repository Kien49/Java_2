package Day1;

public class MayTinhDouble extends MayTinh<Double> {


    @Override
    public Double tong(Double... doubles) {
        double t =0;
        for (double d: doubles) {
            t +=d;
        }
        return t;
    }

    @Override
    public Double hieu(Double t1, Double t2) {
        return t1-t2;
    }

    @Override
    public Double tich(Double... doubles) {
        double t =1;
        for (Double d: doubles) {
            t *= d;
        }
        return t;
    }

    @Override
    public Double chia(Double t1, Double t2) {
        return t1/t2;
    }
}
