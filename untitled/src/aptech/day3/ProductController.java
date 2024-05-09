package aptech.day3;


import java.util.ArrayList;
import java.util.Scanner;

public class ProductController {
    ArrayList<Product> productArrayList = new ArrayList<>();

    //1. Cho phep nhap san pham.
    public void createProduct() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Vui long nhap thong tin san pham. ");
        Product product1 = new Product();
        System.out.println("Nhap Id: ");
        sc.nextInt();
        product1.slug = sc.nextLine();
        System.out.println("Nhap Slug cho san pham: ");
        product1.slug = sc.nextLine();
        System.out.println("Nhap Ten tin san pham: ");
        product1.name = sc.nextLine();
        System.out.println("Nhap Gia cho san pham: ");
        product1.price = sc.nextDouble();
//        System.out.println("Thong tin san pham ban vua nhap la: ");
//        product1.showInformation();
        productArrayList.add(product1);
        System.out.println("Luu du lieu thanh cong");
    }

    public void showProduct() {
        for (int i = 0; i < productArrayList.size(); i++) {
            Product sp1 = productArrayList.get(i);
            System.out.println(sp1.id);
            System.out.println(sp1.slug);
            System.out.println(sp1.name);
            System.out.println(sp1.price);
        }
    }
    // 2. Xem danh sach san pham.
    // 3. Sua san pham.
    // 4. Xoa
    // 5. Tim kiem
}
