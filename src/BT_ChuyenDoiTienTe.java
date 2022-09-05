import java.util.Scanner;

public class BT_ChuyenDoiTienTe {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so tien can chuyen doi ");
        double uSd;
        uSd = sc.nextDouble();
        int vNd = 23000;
        double rate = uSd * vNd;
        System.out.println("So tien sau khi chuyen doi la: " + rate);
    }
}
