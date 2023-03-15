package Day5;

import Day4.HinhTron;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class HinhVuongTest {
    @Test
    @DisplayName("Hinh vuong canh 1 chu vi:4 , dien tich: 1")
    public void testChuDien1() {
        HinhVuong ht = new HinhVuong(1);

        double expectedC = 4;
        double expectedD = 1;

        double actualC = ht.chuVi();
        double actualD = ht.dienTich();

        Assertions.assertTrue((Math.abs(expectedC - actualC) < 0.01) && (Math.abs(expectedD - actualD) < 0.01));
    }
    @Test
    @DisplayName("Hinh vuong canh 2 chu vi:8 , dien tich: 4")
    public void testChuDien2() {
        HinhVuong ht = new HinhVuong(2);

        double expectedC = 8;
        double expectedD = 4;

        double actualC = ht.chuVi();
        double actualD = ht.dienTich();

        Assertions.assertTrue((Math.abs(expectedC - actualC) < 0.01) && (Math.abs(expectedD - actualD) < 0.01));
    }
    @Test
    @DisplayName("Hinh vuong canh 1.234 chu vi:4.94 , dien tich: 1.53")
    public void testChuDien3() {
        HinhVuong ht = new HinhVuong(1.234);

        double expectedC = 4.94;
        double expectedD = 1.53;

        double actualC = ht.chuVi();
        double actualD = ht.dienTich();

        Assertions.assertTrue((Math.abs(expectedC - actualC) < 0.01) && (Math.abs(expectedD - actualD) < 0.01));
    }
    @Test
    @DisplayName("Hinh vuong canh 2.345 chu vi:9.38 , dien tich: 5.5")
    public void testChuDien4() {
        HinhVuong ht = new HinhVuong(2.345);

        double expectedC = 9.38;
        double expectedD = 5.5;

        double actualC = ht.chuVi();
        double actualD = ht.dienTich();

        Assertions.assertTrue((Math.abs(expectedC - actualC) < 0.01) && (Math.abs(expectedD - actualD) < 0.01));
    }
    @Test
    @DisplayName("Hinh vuong canh 23.432123 chu vi:93.73 , dien tich: 549.07")
    public void testChuDien5() {
        HinhVuong ht = new HinhVuong(23.432123);

        double expectedC = 93.73;
        double expectedD = 549.07;

        double actualC = ht.chuVi();
        double actualD = ht.dienTich();

        Assertions.assertTrue((Math.abs(expectedC - actualC) < 0.01) && (Math.abs(expectedD - actualD) < 0.01));
    }
    @Test
    @DisplayName("Hinh vuong canh 4.2 chu vi:16.8 , dien tich: 17.64")
    public void testChuDien6() {
        HinhVuong ht = new HinhVuong(4.2);

        double expectedC = 16.8;
        double expectedD = 17.64;

        double actualC = ht.chuVi();
        double actualD = ht.dienTich();

        Assertions.assertTrue((Math.abs(expectedC - actualC) < 0.01) && (Math.abs(expectedD - actualD) < 0.01));
    }
    @Test
    @DisplayName("Hinh vuong canh 12.33 chu vi:49.32 , dien tich: 152.03")
    public void testChuDien7() {
        HinhVuong ht = new HinhVuong(12.33);

        double expectedC = 49.32;
        double expectedD = 152.03;

        double actualC = ht.chuVi();
        double actualD = ht.dienTich();

        Assertions.assertTrue((Math.abs(expectedC - actualC) < 0.01) && (Math.abs(expectedD - actualD) < 0.01));
    }
    @Test
    @DisplayName("Hinh vuong canh 23 chu vi:92 , dien tich: 529")
    public void testChuDien8() {
        HinhVuong ht = new HinhVuong(23);

        double expectedC = 92;
        double expectedD = 529;

        double actualC = ht.chuVi();
        double actualD = ht.dienTich();

        Assertions.assertTrue((Math.abs(expectedC - actualC) < 0.01) && (Math.abs(expectedD - actualD) < 0.01));
    }


    @Test
    @DisplayName("Nem ra exception neu khoi tao hinh vuong co canh bang 0")

    public void nemRaException1() {
        Exception actualException = Assertions.assertThrows(RuntimeException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                // Viet code
                HinhVuong hv = new HinhVuong();
                hv.setCanh(0);
            }
        });

        String expected = "Cạnh phải là số dương";
        Assertions.assertEquals(expected, actualException.getMessage());
    }


    @Test
    @DisplayName("Nem ra exception neu set canh nho hon 0")
    public void nemRaException2(){
        Exception actualException = Assertions.assertThrows(RuntimeException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                // Viet code
                HinhVuong hv = new HinhVuong(-3.2848);
            }
        });

        String expected = "Cạnh phải là số dương";
        Assertions.assertEquals(expected, actualException.getMessage());
    }
}