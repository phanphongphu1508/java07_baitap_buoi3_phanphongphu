package bai_tap;
import java.util.Scanner;
public class bai_4 {
	public static void main(String[] args) {
		
		 final int n = 5;
		 
		 Scanner banPhim = new Scanner(System.in);

		 // Biến tích lũy để tính tổng
		 double tichLuy = 0;

		 // Vòng lặp để nhập các số và tính tổng
		 for (int i = 1; i <= n; i++) {
		 System.out.print("Nhập số thứ " + i + ": ");
		 double giaTri = banPhim.nextDouble();
		 tichLuy += giaTri; // Cộng dồn giá trị vào biến tích lũy
		 }
		 
		 banPhim.close();
		 
		 // Tính giá trị trung bình
		  double trungBinh = tichLuy / n;

		  // Hiển thị kết quả
		  System.out.println("Giá trị trung bình của 5 số là: " + trungBinh);
		    
	
	}
}
