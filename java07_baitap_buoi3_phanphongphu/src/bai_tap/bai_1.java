package bai_tap;
import java.util.Scanner;
public class bai_1 {
	public static void main(String[] args) {

		// Cho phép người dùng nhập giá trị
		Scanner banPhim = new Scanner(System.in);
		
		// Nhập chiều dài 2 cạnh góc vuông
		System.out.print("Nhập chiều dài cạnh góc vuông thứ nhất: ");
		double a = banPhim.nextDouble();
		
		System.out.print("Nhập chiều dài cạnh góc vuông thứ hai: ");
		double b = banPhim.nextDouble();
		
		banPhim.close();
		
		// Tính chiều dài cạnh huyền
		double canhHuyen = Math.sqrt(a * a + b * b);
		
		// Hiển thị kết quả
		System.out.print("Chiều dài cạnh huyền là: " + canhHuyen);	
	}
}