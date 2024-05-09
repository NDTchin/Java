package aptech.day3;

public class Main {
    public static void main(String[] args) {
//        Product product1 = new Product();
//        product1.id = 10;
//        product1.slug = "San pham 01";
//        product1.name = "San pham 01";
//        product1.price = 10;
//        product1.showInformation();
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Vui long nhap thong tin san pham. ");
//        Product product1 = new Product();
//        System.out.println("Nhap Id: ");
//        sc.nextInt();
//        product1.slug = sc.nextLine();
//        System.out.println("Nhap Slug cho san pham: ");
//        product1.slug = sc.nextLine();
//        System.out.println("Nhap Ten tin san pham: ");
//        product1.name = sc.nextLine();
//        System.out.println("Nhap Gia cho san pham: ");
//        product1.price = sc.nextDouble();
//        System.out.println("Thong tin san pham ban vua nhap la: ");
//        product1.showInformation();
//        System.out.println("Luu giu lieu thanh cong");
          ProductController productController = new ProductController();
          productController.createProduct();
          productController.createProduct();
          productController.createProduct();

          productController.showProduct();
    }
}
