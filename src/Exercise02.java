import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double point = 0;
        double max = 0;
        double min = 1;
        int count = 0;
        double sum = 0;
        do{
            System.out.println("Moi ban nhap lua chon:\n"+
                    "1. Nhap diem hoc vien.\n" +
                    "2. Hien thi thong ke\n" +
                    "3. Thoat chuong trinh"
            );
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    do {
                        System.out.println("Moi nhap diem hoc vien");
                        point = sc.nextDouble();
                        if(point != -1){
                            if (point > 10 || point < 0) {
                                System.out.println(" Diem khong hop le. Vui long nhap lai.");
                            } else if (point >= 0 && point < 5) {
                                System.out.println("Hoc luc yeu ");
                            } else if (point >= 5 && point < 7) {
                                System.out.println("Hoc luc trung binh");

                            } else if (point >= 7 && point < 8) {
                                System.out.println("Hoc luc kha");

                            } else if (point >= 8 && point < 9) {
                                System.out.println("Hoc luc gioi");
                            } else if (point >= 9) {
                                System.out.println("Hoc luc xuat sac");
                            }
                        }


                        if (point > 0 && point <= 10) {
                            if (point > max) {
                                max = point;

                            }
                            if (point < min) {
                                min = point;
                            }
                            count++;
                            sum += point;

                        }
                    }
                        while (point != -1) ;
                    break;
                case 2:
                    if (count == 0) {
                        System.out.println("Chua co du lieu");
                    } else {

                        System.out.println(" So lan nhap: " + count);
                        System.out.printf("Diem cao nhat: %.2f ", max);
                        System.out.printf("Diem thap nhat: %.2f ", min);
                        System.out.printf("Diem trung binh: %.2f ", sum / count);

                    }
                    break;
                case 3:
                    sc.close();
                System.exit(0);
            }
        }while (true);


    }
}

