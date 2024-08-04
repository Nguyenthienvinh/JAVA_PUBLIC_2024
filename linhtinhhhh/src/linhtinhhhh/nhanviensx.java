package linhtinhhhh;

import java.util.Scanner;

public class nhanviensx extends nhanvien {
	

	private int sanpham;
	public nhanviensx(String hoten, int namvaolam, int sanpham) {
		super(hoten, namvaolam);
		this.sanpham = sanpham;
	}
	@Override
	public void nhap() {
		Scanner sc= new Scanner(System.in);
		sanpham=sc.nextInt();
	}
	@Override
	public double tinhluong() {
		// TODO Auto-generated method stub
		return sanpham*1000;
	}
	

}
