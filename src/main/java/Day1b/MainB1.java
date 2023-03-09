package Day1b;

public class MainB1 {
    public static void main(String[] args) {
        HinhTron ht = new HinhTron(3);
        HinhVuong hv = new HinhVuong(4);

        Drawable drawable = new Drawable();
        drawable.Draw(ht);
        drawable.Draw(hv);
    }
}
