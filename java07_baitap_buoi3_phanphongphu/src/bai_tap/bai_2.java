package bai_tap;
import java.util.Scanner;

public class bai_2 {
	public static void main(String[] args) {
		
		// Cho phép người dùng nhập giá trị
		Scanner banPhim = new Scanner(System.in);
		
		// Nhập vào số thực
		System.out.print("Nhập vào số thực: ");
		double a = banPhim.nextDouble();
		
		// Nhập vào số nguyên
		System.out.print("Nhập vào số nguyên không âm: ");
		int n = banPhim.nextInt();
		
		banPhim.close();
		// Tính giá trị P(x) = ax^n
		double donThuc = a * Math.pow(8, n);
		
		// In kết quả ra màn hình
		System.out.print("Giá trị đơn thức P(x) = " + a + " * " + "8" + "^" + n + " là " + donThuc);
	}
}