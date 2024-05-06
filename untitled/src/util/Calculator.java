package util;

public class Calculator {
    public static float tinhChuViTamGiac(float a, float b, float c){
        return a + b + c;
    }
    public static float tinhTong(float a, float b) {
        return a + b;
    }
    public static float tinhHieu(float a, float b){
        return a - b;
    }
    public static float tinhTich(float a, float b){
        return a * b;
    }
    public static float tinhThuong(float a, float b){
        if(b == 0){
            System.out.println("Khong chia het");
            return 0;
        }
        return a / b;
    }
}
