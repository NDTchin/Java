package com.test.aptech.shape;

import java.util.Scanner;

public class MainThread {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhap chieu dai hinh chu nhat: ");
        double length = scanner.nextDouble();

        System.out.print("Nhap chieu rong hinh chu nhat: ");
        double width = scanner.nextDouble();

//        if(length < width || length <= 0 || width <= 0) {
//            System.out.println("Nhap lai chieu dai va chieu rong");
//        }

        Rectangle rectangle = new Rectangle(length, width);
        double perimeter = rectangle.calculatePerimeter();
        double area = rectangle.calculateArea();

        System.out.println("Chu vi hcn: " + perimeter);
        System.out.println("Dien tich hcn: " + area);
    }
}