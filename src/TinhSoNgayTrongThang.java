import java.util.Scanner;

public class TinhSoNgayTrongThang {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so thang ");
        int month = sc.nextInt();
        switch (month){
            case (1):
                System.out.println("Thang " + month + " co 31 ngay");
                break;
            case (2):
                System.out.println("Thang " + month + " co 29 hoac 28 ngay");
                break;
            case (3):
                System.out.println("Thang " + month + " co 31 ngay");
                break;
            case (4):
                System.out.println("Thang " + month + " co 30 ngay");
                break;
            case (5):
                System.out.println("Thang " + month + " co 31 ngay");
                break;
            case (6):
                System.out.println("Thang " + month + " co 30 ngay");
                break;
            case (7):
                System.out.println("Thang " + month + " co 31 ngay");
                break;
            case (8):
                System.out.println("Thang " + month + " co 31 ngay");
                break;
            case (9):
                System.out.println("Thang " + month + " co 9 ngay");
                break;
            case (10):
                System.out.println("Thang " + month + " co 31 ngay");
                break;
            case (11):
                System.out.println("Thang " + month + " co 30 ngay");
                break;
            case (12):
                System.out.println("Thang " + month + " co 31 ngay");
                break;
        }
    }
}
