package com.test.aptech.util;

public class ConverterlHelper {
    public float convertFtoC(float f) {
        return (f-32) / 1.8f;
    }
    public float convertInchtoMeter(float inch) {
        return (inch * 0.0254f);
    }
    public float convertMetertoInch(float m) {
        return (m / 0.0254f);
    }
}
