package util;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Chuong trinh tinh chu vi tam giac. ");
//        System.out.println("Vui long dien do dai canh thu nhat: ");
//        float a = scanner.nextFloat();
//        System.out.println("Vui long dien do dai canh thu hai: ");
//        float b = scanner.nextFloat();
//        System.out.println("Vui long dien do dai canh thu ba: ");
//        float c = scanner.nextFloat();
//        float chuVi = Calculator.tinhChuViTamGiac(a, b, c);
//        System.out.println("Chu vi tam giac la: ");
//        System.out.println(chuVi);

        Scanner sc = new Scanner(System.in);
        System.out.println("Chuong trinh may tinh. ");
        System.out.println("====================== ");
        System.out.println("1. Tinh tong hai so. ");
        System.out.println("2. Tinh hieu hai so. ");
        System.out.println("3. Tinh tich hai so. ");
        System.out.println("4. Tinh thuong hai so. ");
        System.out.println("====================== ");
        System.out.println("Vui long chon tu 1 - 4:");
        int choice = sc.nextInt();
        float number1 = 0;
        float number2 = 0;
        float result = 0;
        System.out.println("Vui long nhap so thu nhat: ");
        number1 = sc.nextFloat();
        System.out.println("Vui long nhap so thu hai: ");
        number2 = sc.nextFloat();
        switch(choice){
            case 1:
                // xu ly cong
                result = Calculator.tinhTong(number1, number2);
                System.out.println("Tong 2 so la: " + result);
                break;
            case 2:
                // xu ly tru
                result = Calculator.tinhHieu(number1, number2);
                System.out.println("Hieu 2 so la: " + result);
                break;
            case 3:
                // xu ly nhan
                result = Calculator.tinhTich(number1, number2);
                System.out.println("Tich 2 so la: " + result);
                break;
            case 4:
                // xu ly cong
                result = Calculator.tinhThuong(number1, number2);
                System.out.println("Thuong 2 so la: " + result);
                break;
        }
    }
}
