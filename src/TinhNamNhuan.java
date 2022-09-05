import java.util.Scanner;

public class TinhNamNhuan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("nhap so nam ");
        int nam = sc.nextInt();
        if (nam % 4 == 0 && nam % 100 != 0){
            System.out.println("Day la nam nhuan");
        }
        if (nam % 400 != 0 && nam % 100 == 0){
            System.out.println("Day khong phai nam nhuan");
        }
        if (nam % 400 == 0 && nam % 100 == 0){
            System.out.println("Day la nam nhuan");
        }
        if (nam % 4 != 0){
            System.out.println("Day khong la nam nhuan");
        }
    }
}
