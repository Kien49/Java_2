package Day4;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import static org.junit.jupiter.api.Assertions.*;

class HinhTronTest {

    @Test
    @DisplayName("Hinh tron mac dinh co ban kinh = 1")
    public void banKinhMacDinh1() {
        HinhTron ht = new HinhTron();
        // Gia tri dung
        double expected = 1.0;
        // Gia tri thuc te
        double actual = ht.getRadius();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Hinh tron ban kinh 1 chu vi la 6.283")
    public void testChuVi1() {
        HinhTron ht = new HinhTron(1);

        double expected = 6.283;

        double actual = ht.tinhChuVi();

        Assertions.assertTrue(Math.abs(expected - actual) < 0.001);

    }

    @Test
    @DisplayName("Hinh tron ban kinh 2,123 co dien tich la 14,159")
    public void testDienTich() {
        HinhTron ht = new HinhTron();
        ht.setRadius(2.123);

        double expected = 14.159;
        double actual = ht.tinhDienTich();

        Assertions.assertTrue(Math.abs(expected - actual) < 0.001);
    }

    @Test
    @DisplayName("Nem ra exception neu khoi tao hinh tron co ban kinh bang 0")

    public void nemRaException1() {
        Exception actualException = Assertions.assertThrows(RuntimeException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                // Viet code
                HinhTron hinhTron = new HinhTron(-4);
            }
        });

        String expected = "Error";
        Assertions.assertEquals(expected, actualException.getMessage());
    }


    @Test
    @DisplayName("Nem ra exception neu set ban kinh hinh tron  bang 0")
    public void nemRaException2(){
        Exception actualException = Assertions.assertThrows(RuntimeException.class, new Executable() {
            @Override
            public void execute() throws Throwable {
                // Viet code
                HinhTron hinhTron = new HinhTron(1);
                hinhTron.setRadius(0);
            }
        });

        String expected = "Error";
        Assertions.assertEquals(expected, actualException.getMessage());
    }

}