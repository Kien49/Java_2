package Day1b;

public class Drawable  {

    public <T extends  IHinhHoc> void Draw (T t){
        String tmp = String.format("Ve hinh %s, co dien tich la %.1f, chu vi la %.1f",
                t.getClass().getSimpleName(),
                t.tinhDienTich(),
                t.tinhChuVi());

        System.out.println(tmp);
    }
}
