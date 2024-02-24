import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Nhập chuỗi từ bàn phím
        System.out.print("Nhập chuỗi: ");
        String chuoi = scanner.nextLine();

        // Thay thế ký tự 'n' và 'g' bằng 'a'
        String chuoiMoi = chuoi.replace('n', 'a').replace('g', 'a');
        // relace dùng để thay thế

        // In ra chuỗi mới
        System.out.println("Chuỗi mới: " + chuoiMoi);
    }
}