package aptech.day5;

import java.util.ArrayList;
import java.util.Scanner;

public class CustomerController {
    //tao noi luu tru khach hang
    //khai bao o ngoai giup luu tru du lieu va duoc ham khac su dung lai
    ArrayList<Customer> customers = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    //1. Luu tru, tao moi thong tin khach hang
    public void createCustomer() {
        //Yeu cau nhap vao
        System.out.println("Vui long nhap thong tin khach hang.");
        System.out.println("Nhap id:");
        long id = sc.nextLong();
        sc.nextLine();
        System.out.println("Nhap firstName:");
        String firstName = sc.nextLine();
        System.out.println("Nhap lastName:");
        String lastName = sc.nextLine();
        System.out.println("Nhap phone:");
        String phone = sc.nextLine();
        System.out.println("Nhap email:");
        String email = sc.nextLine();
        System.out.println("Nhap address:");
        String address = sc.nextLine();
        System.out.println("Nhap tuoi:");
        int age = sc.nextInt();
        sc.nextLine();
        //Tao ra 1 customer tu thong tin nhap vao
        Customer customer = new Customer();
        customer.setId(id);
        customer.setFirstName(firstName);
        customer.setLastName(lastName);
        customer.setPhone(phone);
        customer.setEmail(email);
        customer.setAddress(address);
        customer.setAge(age);
        //Dua customer vao danh sach List
        customers.add(customer);
    }
    //2. Hien thi
    public void showListCustomer(){
        System.out.println("Hien thi danh sach khach hang.");
        System.out.println("_________________________________");
        System.out.printf("%-10s || %-30s  || %-30s\n","Id","LastName","FirstName");
        System.out.println("_________________________________");
        for (int i = 0; i < customers.size(); i++) {
           Customer c = customers.get(i);
           System.out.printf("%-10s || %-30s  || %-30s\n", c.getId(), c.getLastName(), c.getFirstName());
        }
        System.out.println("Enter de tiep tuc");
        sc.nextLine();
    }
    //3. Thay doi
    //4. Xoa
}
