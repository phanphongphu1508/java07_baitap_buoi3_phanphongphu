package bai_tap;
import java.util.Scanner;
public class bai_3 {
	public static void main(String[] args) {
		
		// Cho phép nhập từ bàn phím
	    Scanner banPhim = new Scanner(System.in);
	    
	    // In ra màn hình dòng chữ để người dùng nhập vào
	    System.out.print("Nhập vào số nguyên có 2 ký số: ");
	    int soNguyen = banPhim.nextInt();
	  
	    banPhim.close();
	
	    // Đặt điều kiện nếu 2 kí số từ 10 đến 99 thì lấy ra tính tổng
	    if (soNguyen >= 00 && soNguyen <=99) {
	        int hangChuc = soNguyen / 10;
	        int hangDonVi = soNguyen % 10;
	        int tinhTong = hangChuc + hangDonVi;
	        System.out.print("Tổng số nguyên có 2 ký số là " + tinhTong);
	    }
	     // Nếu 2 kí số không nằm trong khoảng từ 10 đến 99 in ra thông báo
	    else {
	        System.out.print("Vui lòng nhập số nguyên dương có 2 ký số từ 00 đến 99");
	    }
	}
}