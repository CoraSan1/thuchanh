
import java.util.Scanner;

public class SuDungToanTu {
    public static void main(String[] args) {
        float width;
        float length;

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap chieu rong: ");
        width = sc.nextFloat();
        System.out.println("Nhap chieu dai: ");
        length = sc.nextFloat();

        float dt = width * length;
        System.out.println("dien tich hinh chu nhat la: " + dt);
    }
}
