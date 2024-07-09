package bai_tap;
import java.text.DecimalFormat;
import java.util.Scanner;

public class bai_6 {
	public static void main(String[] args) {
		

		// cho phép người dùng nhập số tiền USD từ bàn phím
        Scanner banPhim = new Scanner(System.in);
        
        // In ra màn hình dòng chữ để người dùng nhập vào số tiền USD
        System.out.print("Nhập số tiền USD: ");
        double tienUSD = banPhim.nextDouble();
        
        banPhim.close();

        // Tỉ giá VND là 23.500đ
        final double tiGia = 23.500;

        // Lấy tiền USD nhân với tỷ giá để ra được số tiền cần đổi
        double tienVND = tienUSD * tiGia;

        // Định dạng số tiền VND với 3 chữ số thập phân
        DecimalFormat dinhDang = new DecimalFormat("#,##0.000");
        String dinhDangTienVND = dinhDang.format(tienVND);

        // In ra màn hình số tiền VND
        System.out.print("Số tiền VND của bạn là: " + dinhDangTienVND + "đ");
	}
}
