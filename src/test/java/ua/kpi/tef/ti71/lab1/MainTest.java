package ua.kpi.tef.ti71.lab1;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class MainTest {

    @Test
    public void disk() {
        double a = 1.0;
        double b = 2.0;
        double c = 3.0;
        double D;
        D=b*b-4*a*c;
        double D1;
        D1 = Main.disk(a, b, c);
        assertEquals(D1, D, 0.001);
    }

    @Test
    public void disk1() {
        double a = 1.0;
        double b = 4.0;
        double c = 4.0;
        double D;
        D=b*b-4*a*c;
        double D1;
        D1 = Main.disk(a, b, c);
        assertEquals(D1, D, 0.001);
    }
}