package Day1;

public abstract class MayTinh<T> {
    public abstract T tong(T...ts);
    public abstract T hieu(T t1, T t2);
    public abstract T tich(T...ts);
    public abstract T chia(T t1, T t2);
/*    public T tong(){
        T sum = t;

        for(int i =1; i<t.intValue(); i++){
            sum +=t;
        }
        return sum;
    }
    public T hieu(T t1, T t2){
        T hieu;
        hieu = t1 - t2;
        return hieu;
    }
    public T thuong(T t1, T t2){


    }*/

}
