package Aptech.day4;

import java.util.ArrayList;

public class MainDay4 {
    public static void main(String[] args) {
         ArrayList<Student> danhSachSinhvien = new ArrayList<>();
         Student st1 = new Student(1, "Hoang", "Bui");
         danhSachSinhvien.add(st1);
         Student st2 = new Student(2, "Chi", "Nguyen");
         danhSachSinhvien.add(st2);
         Student st3 = new Student(3, "Hanh", "Nguyen");
         danhSachSinhvien.add(st3);
         Student st4 = new Student(4, "Thanh", "Nguyen");
         danhSachSinhvien.add(st4);
         Student st5 = new Student(5, "Thang", "Nguyen");
         danhSachSinhvien.add(st5);
         Student st6 = new Student(6, "Phuong", "Vu");
         danhSachSinhvien.add(st6);

         int searchIndex = -1;
         long searchKey = 5;

         for(int i = 0; i < danhSachSinhvien.size(); i++) {
             Student student = danhSachSinhvien.get(i);
             if(student.getId() == searchKey) {
                 searchIndex = i;
                 System.out.println(student);
             }
         }
         if(searchIndex == -1) {
             System.out.println("Khong tim thay sinh vien.");
         }else {
             danhSachSinhvien.remove(searchIndex);
             System.out.println("Xoa thanh cong sinh vien.");
         }
         for(int i = 0; i < danhSachSinhvien.size(); i++) {
             Student student = danhSachSinhvien.get(i);
             System.out.printf("Student %d - %s %s\n", student.getId(), student.getFirstName(), student.getLastName());
         }
    }
}
