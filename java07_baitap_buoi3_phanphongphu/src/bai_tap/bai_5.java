package bai_tap;
import java.util.Scanner;

public class bai_5 {
	public static void main(String[] args) {
		
		// cho phép người dùng nhập nhiệt độ từ bàn phím
		Scanner banPhim = new Scanner(System.in);

	    // In ra màn hình dòng chữ để người dùng nhập nhập độ C từ bàn phím
	    System.out.print("Nhập vào °C: ");
	    double doC = banPhim.nextDouble();
	   
	    banPhim.close();

	    // Lấy độ C nhập vào tính toán để ra độ F
	    Double doF = (doC * 1.8) + 32;

	    // Xuất ra màn hình độ C và độ F
	    System.out.print(doC + "°C tương đương với " + doF + "°F");
	}
}
