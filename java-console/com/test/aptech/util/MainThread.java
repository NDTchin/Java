package com.test.aptech.util;

public class MainThread {
    public static void main(String[] args) {
        float f = 79;
        ConverterlHelper converterlHelper = new ConverterlHelper();
        float c = converterlHelper.convertFtoC(f);
        System.out.println(c);
        float inch = 1;
        float m = converterlHelper.convertInchtoMeter(inch);
        System.out.printf("%.3f Inch sang %.4f Meter\n", inch, m);
        float meter = 1;
        float inch2 = converterlHelper.convertMetertoInch(meter);
        System.out.printf("%.3f Meter sang %.4f Inch", meter, inch2);
    }
}
