package linhtinhhhh;

import java.util.Scanner;

public class nhanvienvp extends nhanvien {
	private int mucluong;
	private int ngaynghi;
	public nhanvienvp(String hoten, int namvaolam, int mucluong, int ngaynghi) {
		super(hoten, namvaolam);
		this.mucluong = mucluong;
		this.ngaynghi = ngaynghi;
	}
	@Override
	public void nhap() {
		Scanner sc= new Scanner (System.in);
		mucluong=sc.nextInt();
		ngaynghi=sc.nextInt();
		
	}
	@Override
	public double tinhluong() {
		
		return (mucluong-ngaynghi)*1000;
	}
	
	
	
	
	

}
