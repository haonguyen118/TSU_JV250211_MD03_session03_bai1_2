import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap vao ten khach hang: ");
        String name = sc.nextLine();

        System.out.println("Moi nhap vao ten san pham: ");
        String productName = sc.nextLine();

        System.out.println("Moi nhap gia san pham: ");
        int productPrice = sc.nextInt();

        System.out.println("Moi nhap vao so luong san pham muon mua: ");
        int productQuantity = sc.nextInt();

        System.out.print("Bạn có phải là thành viên không? (true/false): ");
        boolean isMember = sc.nextBoolean();


        double totalBill = productPrice * productQuantity * (1 + 0.08);
        if (isMember) {
            totalBill -= totalBill * 0.1; // Giảm 10% cho thành viên
        }
        System.out.printf("Hóa đơn của %s cho sản phẩm %s là: %.2f%n", name, productName, totalBill);
        sc.close();
    }



    }


