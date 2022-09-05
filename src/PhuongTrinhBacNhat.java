import java.util.Scanner;

public class PhuongTrinhBacNhat {
    public static void main(String[] args) {
        System.out.println("Cho phuong trinh ax + b = c ");
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap so a ");
        double a = sc.nextDouble();
        System.out.print("nhap so b ");
        double b = sc.nextDouble();
        System.out.print("nhap so c ");
        double c = sc.nextDouble();
        if (a != 0){
            double x = (c - b)/a;
            System.out.println(x);
        }
        else {
            if (b == c){
                System.out.println("Phuong trinh vo so nghiem");
            }
            else {
                System.out.println("Phuong trinh vo nghiem");
            }
        }
    }
}
